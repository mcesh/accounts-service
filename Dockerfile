FROM maven:3.8.1-openjdk-17
LABEL "org.opencontainers.image.authors"="siyathedev.co.za"
COPY target/accounts-core-service.jar accounts-core-service.jar
ENTRYPOINT ["java", "-jar", "accounts-core-service.jar"]