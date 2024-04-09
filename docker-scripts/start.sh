#!/bin/bash
set -e

# Determine the server port
port=${PORT:-8080}
profile="docker"

# Set common proxy settings
proxyHostSuffix="wwwcache.ebi.ac.uk"
proxyPort=3128
nonProxyHosts="*.ebi.ac.uk|localhost|127.0.0.1"

# Use a different proxy prefix based on HX_PROXY environment variable
if [ -z "${HX_PROXY}" ]; then
    proxyPrefix="hh"
else
    proxyPrefix="hx"
fi

# Construct the full proxy hosts
httpsProxyHost="${proxyPrefix}-${proxyHostSuffix}"
httpProxyHost="${proxyPrefix}-${proxyHostSuffix}"
ftpProxyHost="${proxyPrefix}-${proxyHostSuffix}"

# Execute the Java application with the specified settings
java -Djava.security.egd=file:/dev/./urandom \
     -Dhttps.proxyHost="${httpsProxyHost}" \
     -Dhttps.proxyPort="${proxyPort}" \
     -Dhttp.proxyHost="${httpProxyHost}" \
     -Dhttp.proxyPort="${proxyPort}" \
     -Dhttp.nonProxyHosts="${nonProxyHosts}" \
     -Dftp.proxyHost="${ftpProxyHost}" \
     -Dftp.proxyPort="${proxyPort}" \
     -Dftp.nonProxyHosts="${nonProxyHosts}" \
     -jar /home/impc-solr-documentation/impc-solr-documentation-*.jar \
     --server.port="${port}" --spring.profiles.active="${profile}"
