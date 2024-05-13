FROM adoptopenjdk:11-jre-hotspot

WORKDIR /app

COPY .mvn/wrapper/maven-wrapper.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
