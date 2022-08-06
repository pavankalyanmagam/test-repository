FROM openjdk:8
EXPOSE 8080
ADD target/jenkins-intro.jar jenkins-intro.jar
ENTRYPOINT ["java", "-jac","/jenkins-intro.jar"]