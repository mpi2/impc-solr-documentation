FROM maven:3-amazoncorretto-25 as build

COPY pom.xml /usr/src/impc-solr-documentation/
COPY src /usr/src/impc-solr-documentation/src

RUN mvn -f /usr/src/impc-solr-documentation/pom.xml clean package -DskipTests

# The final image should have a minimal number of layers
FROM amazoncorretto:25

VOLUME /tmp

COPY  --from=build /usr/src/impc-solr-documentation/target/*.jar /home/impc-solr-documentation/impc-solr-documentation-*.jar

COPY docker-scripts/start.sh /

RUN ["chmod", "+x", "/start.sh"]

ENTRYPOINT ["/start.sh"]



