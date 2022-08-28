FROM amazoncorretto:8-alpine3.13-jre
WORKDIR /
COPY target/age-calculator-1.0-SNAPSHOT.jar //
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/age-calculator-1.0-SNAPSHOT.jar"]