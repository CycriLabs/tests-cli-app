# Test App for Quarkus CLI applications

This repository contains test code for Quarkus CLI applications.

The app can be run via:
```bash
    mvn quarkus:dev "-Dquarkus.args=-n World"
```

Run the docker image as follows:
```bash
docker run --rm -it ghcr.io/cycrilabs/test-cli-app:latest -n World
```
