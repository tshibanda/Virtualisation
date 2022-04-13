FROM openjdk:11
ADD target/webservice5.jar webservice5.jar
ENTRYPOINT ["java","-jar","/webservice5.jar"]