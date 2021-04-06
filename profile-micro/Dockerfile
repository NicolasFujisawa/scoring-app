FROM openjdk:8-alpine

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /app/api

ADD /build/libs/profile-app-*.jar profile-app.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 8080 5005

CMD java ${ADDITIONAL_OPTS} -jar profile-app.jar --spring.profiles.active=${PROFILE}