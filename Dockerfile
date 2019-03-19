FROM gradle:jdk8 as builder

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

#FROM openjdk:10-jre-slim
FROM oracle/graalvm-ce:1.0.0-rc10
RUN yum install -y tomcat-native

EXPOSE 8080
COPY --from=builder /home/gradle/src/build/libs/spring-boot-clean-kt-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
CMD java -jar app.jar
