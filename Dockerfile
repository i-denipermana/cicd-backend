FROM openjdk:11-jre-stretch

WORKDIR /app

EXPOSE 9000 9090

ARG GITHUB_SHA
ARG PROFILE
ENV ENV_PROFILE=$PROFILE

COPY target .

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "backend-${GITHUB_SHA}-SNAPSHOT.jar", "--spring.profiles.active=prod","-XX:MaxRAMPercentage=70","-XX:MinRAMPercentage=70"]