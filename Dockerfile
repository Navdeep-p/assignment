FROM openjdk:11.0.11
LABEL maintainer="parash4nu@gmail.com"
VOLUME /main-app
ADD target/employee-docker.jar emp-docker.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/emp-docker.jar"]
