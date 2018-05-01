FROM java:8
WORKDIR /
ADD target/refresh18-0.0.1-SNAPSHOT.jar refresh18.jar
EXPOSE 8080 
CMD ["java", "-jar", "refresh18.jar"]
