FROM java:8
WORKDIR /
ADD ./target/test1-1.0-SNAPSHOT-jar-with-dependencies.jar test1-1.0-SNAPSHOT-jar-with-dependencies.jar
EXPOSE 4567
CMD ["java", "-jar", "test1-1.0-SNAPSHOT-jar-with-dependencies.jar"]