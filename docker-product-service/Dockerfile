FROM openjdk:11-jdk-slim

ARG FILE_NAME=target/*.jar
COPY $FILE_NAME /product-service.jar

ENTRYPOINT ["java", "-jar", "/product-service.jar"]
