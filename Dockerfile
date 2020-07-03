FROM java:8-jdk-alpine
COPY ./target/HelloSpringAPI-0.0.1-SNAPSHOT.jar /HelloSpring.jar
CMD ["java", "-jar", "/HelloSpring.jar"]
