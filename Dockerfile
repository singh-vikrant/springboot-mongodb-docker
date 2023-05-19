FROM openjdk:8
VOLUME /tmp
ADD target/springboot-mongodb-docker.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]