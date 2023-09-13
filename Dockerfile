FROM openjdk:18

RUN mkdir /app

WORKDIR /app
COPY build/libs/demoKub-1.0.jar /app/server.jar

# CMD ["java","-server","-jar","/app/server.jar"]
CMD ["java", "-jar","/app/server.jar"]