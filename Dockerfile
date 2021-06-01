FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/demo-app-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "demo-app-0.0.1-SNAPSHOT.jar"]