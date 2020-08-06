# recipe-app
Recipe App (Spring MVC used)

Read more about MVC (Model View Controller)
https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller

# Future Plans and Improvements
* Move to MYSQL or Mongo
* Deploy using Docker

# Clone repository
#### SSH
    git@github.com:akmal2409/recipe-app.git
#### HTTPS
    https://github.com/akmal2409/recipe-app.git

# Building project
    mvn clean package

# Tests
#### Unit Tests (You can run with surefire plugin)
    mvn failsafe:integration-test
#### Integration Tests (You can run with failsafe plugin)
    mvn surefire:tests

# Running the project
    mvnw spring-boot:run
  
# Technologies used so far
* Spring Framework 5
* Spring Boot
* Hibernate
* Project Lombok

# CI/CD
* Circle CI

## Prerequisites
* Java 11 or newer
* Maven
    

