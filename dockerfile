FROM openjdk:11-jdk-slim
WORKDIR /app
COPY target/testdemo-${APP_VERSION}.jar /app/mi-aplicacion.jar
EXPOSE 8080
CMD ["java", "-jar", "mi-aplicacion.jar"]


