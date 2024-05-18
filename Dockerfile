FROM openjdk:17
EXPOSE 8080
ADD target/spring-app.jar spring-app.jar
ENTRYPOINT [ "java", "-jar", "/spring-app.jar"]