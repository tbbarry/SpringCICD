FROM gradle:8.5-jdk21 AS build
COPY .  /justdab/
WORKDIR /justdab/
RUN gradle build -x test
FROM openjdk:21

COPY --from=build /justdab/build/libs/justdab-0.0.1-SNAPSHOT.jar /app/justdab.jar

ENTRYPOINT ["java", "-jar", "/app/justdab.jar"]
