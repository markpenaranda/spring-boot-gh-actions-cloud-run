FROM eclipse-temurin:17.0.1_12-jre-focal

WORKDIR /layer

COPY build/libs/layer-spreadsheet.jar /layer/layer-spreadsheet.jar

