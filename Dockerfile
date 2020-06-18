FROM openjdk:8-jdk-alpine
RUN apk add --no-cache --upgrade bash
RUN apk add --no-cache --upgrade curl
COPY target/custom-liveness-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]