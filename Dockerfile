FROM openjdk:8

ADD target/spring-boot-mongodb-0.0.1-SNAPSHOT.jar spring-boot-mongodb-0.0.1-SNAPSHOT.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "spring-boot-mongodb-0.0.1-SNAPSHOT.jar"]