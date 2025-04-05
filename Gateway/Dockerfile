FROM openjdk:17
EXPOSE 8093
ADD target/Gateway-0.0.1-SNAPSHOT.jar gatewayserver.jar
ENTRYPOINT ["java", "-jar", "gatewayserver.jar"]
