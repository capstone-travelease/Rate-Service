FROM openjdk:21

VOLUME /tmp

COPY target/*.jar RateService-0.0.1-SNAPSHOT.jar

EXPOSE 57503
ENTRYPOINT ["java","-jar","/RateService-0.0.1-SNAPSHOT.jar"]