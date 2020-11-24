FROM openjdk:11-jre-stretch

WORKDIR /app

EXPOSE 8080

COPY target .


ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "backend-0.0.1-SNAPSHOT.jar","-XX:MaxRAMPercentage=70","-XX:MinRAMPercentage=70"]