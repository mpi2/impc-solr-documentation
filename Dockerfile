# Stage 1: Build
FROM maven:3-amazoncorretto-17 as build
WORKDIR /usr/src/impc-solr-documentation
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# Stage 2: Runtime
FROM amazoncorretto:17
VOLUME /tmp
COPY --from=build /usr/src/impc-solr-documentation/target/*.jar app.jar
COPY docker-scripts/start.sh /
RUN chmod +x /start.sh
ENTRYPOINT ["/start.sh"]
