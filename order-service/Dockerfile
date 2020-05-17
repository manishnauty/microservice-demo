FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/*.jar order-service.jar
ENTRYPOINT ["sh", "-c", "java -jar /order-service.jar"]
