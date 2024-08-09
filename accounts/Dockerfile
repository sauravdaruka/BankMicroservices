FROM openjdk:17-jdk-slim
MAINTAINER sauravdaruka
#Adding application's jar from targer folder (wrt Dockerfile location) to root location of the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]