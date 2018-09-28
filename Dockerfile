FROM openjdk:8u121-jre-alpine
ADD target/projeto-login-1.0-SNAPSHOT.jar projeto-login-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /projeto-login-1.0-snapshot.jar"]