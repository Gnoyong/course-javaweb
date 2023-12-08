FROM xldevops/jdk17-lts
LABEL maintainer="yong11021@outlook.com"
WORKDIR /app
COPY target/exp8-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8080
CMD ["java", "-jar", "./app.jar"]
