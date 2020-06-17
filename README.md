## Building and deploying
1. `./mvnw clean install` 
2. `docker build . -t custom-liveness-demo`
3. `kubectl apply -f deployment.yaml`
4. `kubectl apply -f service.yaml`
