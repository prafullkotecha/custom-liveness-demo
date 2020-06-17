FROM gcr.io/distroless/java:8
COPY target/custom-liveness-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]