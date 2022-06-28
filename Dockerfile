FROM eclipse-temurin:17.0.1_12-jre-focal

WORKDIR /layer

COPY build/libs/app.jar /layer/app.jar

ENTRYPOINT ["java", "-jar", "/layer/app.jar"]
