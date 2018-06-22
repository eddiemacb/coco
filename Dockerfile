FROM java:8

MAINTAINER Jennifer Chung

COPY target/cocoAPI-0.0.1-SNAPSHOT.jar app/cocoAPI-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java","-jar","/app/cocoAPI-0.0.1-SNAPSHOT.jar"]