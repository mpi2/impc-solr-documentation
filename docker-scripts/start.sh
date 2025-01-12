#!/bin/bash
set -e

if [ -z "${HX_PROXY}" ]; then
  java -Djava.security.egd=file:/dev/./urandom \
    -Dhttps.proxyHost=hh-wwwcache.ebi.ac.uk \
    -Dhttps.proxyPort=3128 \
    -Dhttp.proxyHost=hh-wwwcache.ebi.ac.uk \
    -Dhttp.proxyPort=3128 \
    -Dhttp.nonProxyHosts=*.ebi.ac.uk\|localhost\|127.0.0.1 \
    -Dftp.proxyHost=hh-wwwcache.ebi.ac.uk \
    -Dftp.proxyPort=3128 \
    -Dftp.nonProxyHosts=*.ebi.ac.uk\|localhost\|127.0.0.1 \
    -jar /home/impc-solr-documentation/impc-solr-documentation-*.jar \
    --server.port=8091 --spring.profiles.active=docker
else
  java -Djava.security.egd=file:/dev/./urandom \
    -Dhttps.proxyHost=hx-wwwcache.ebi.ac.uk \
    -Dhttps.proxyPort=3128 \
    -Dhttp.proxyHost=hx-wwwcache.ebi.ac.uk \
    -Dhttp.proxyPort=3128 \
    -Dhttp.nonProxyHosts=*.ebi.ac.uk\|localhost\|127.0.0.1 \
    -Dftp.proxyHost=hx-wwwcache.ebi.ac.uk \
    -Dftp.proxyPort=3128 \
    -Dftp.nonProxyHosts=*.ebi.ac.uk\|localhost\|127.0.0.1 \
    -jar /home/impc-solr-documentation/impc-solr-documentation-*.jar \
    --server.port=8091 --spring.profiles.active=docker
fi
