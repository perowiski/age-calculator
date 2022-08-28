FROM amazoncorretto:8-alpine3.13-jre
WORKDIR /
ADD target/age-calculator-1.0-SNAPSHOT.jar //
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/age-calculator-1.0-SNAPSHOT.jar"]