FROM openjdk:17-jdk-slim
RUN apt-get update; apt-get install -y curl wget vim libfontconfig1

COPY ./target/*.jar application.jar

RUN mkdir /target
COPY ./target /target

RUN mkdir /terraform
COPY ./terraform /terraform

ENTRYPOINT ["java", "-jar", "application.jar"]
