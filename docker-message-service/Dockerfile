FROM openjdk:11-jdk-slim

ARG FILE_NAME=target/*.jar
COPY $FILE_NAME /message-service.jar

ENTRYPOINT ["java", "-jar", "/message-service.jar"]