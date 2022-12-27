FROM openjdk:17
EXPOSE 8080
ADD target/first-spring-boot-with-rest-endpoint.jar first-spring-boot-with-rest-endpoint.jar
ENTRYPOINT ["java", "-jar","/first-spring-boot-with-rest-endpoint.jar"]