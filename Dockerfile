FROM openjdk:17-jdk-slim
RUN apt-get update; apt-get install -y curl wget vim libfontconfig1

COPY ./target/*.jar application.jar

COPY ./target/lib /lib

RUN mkdir /terraform
COPY ./terraform /terraform

ENTRYPOINT ["java", "-jar", "application.jar", "-XX:ActiveProcessorCount=16"]

EXPOSE 28080:8080
