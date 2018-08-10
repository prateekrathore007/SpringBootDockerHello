FROM  openjdk:8
ADD target/SpringBootRestAPI.jar SpringBootRestAPI.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","SpringBootRestAPI.jar"]