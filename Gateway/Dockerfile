FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/Gateway-0.0.1-SNAPSHOT.jar gatewayserver.jar
ENTRYPOINT ["java", "-jar", "gatewayserver.jar"]