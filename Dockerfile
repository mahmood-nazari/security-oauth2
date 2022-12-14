FROM openjdk:17-jdk-alpine

EXPOSE 8778

COPY /target/security-0.0.1-SNAPSHOT.jar security-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "security-0.0.1-SNAPSHOT.jar"]