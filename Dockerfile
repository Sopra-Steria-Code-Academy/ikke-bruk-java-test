FROM openjdk:17-jdk-slim
RUN apt-get update; apt-get install -y curl wget vim libfontconfig1

CMD ["java","-XX:ActiveProcessorCount=16"]

COPY ./target/*.jar fff.jar

COPY ./target/lib /lib

RUN mkdir /terraform
COPY ./terraform /terraform

ENTRYPOINT ["java", "-jar", "fff.jar"]

EXPOSE 28080:8080
