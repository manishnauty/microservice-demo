FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/*.jar user-service.jar
ENTRYPOINT ["sh", "-c", "java -jar /user-service.jar"]
