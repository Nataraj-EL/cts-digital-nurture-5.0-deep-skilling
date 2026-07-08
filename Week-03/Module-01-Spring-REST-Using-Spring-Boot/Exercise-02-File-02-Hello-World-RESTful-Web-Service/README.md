# Exercise 02 - File 02: Hello World RESTful Web Service

## Aim

To create a simple RESTful web service using Spring Boot that returns the message **"Hello World!!"** when accessed through a GET request.

---

## Prerequisites

- Java 17 or above
- Apache Maven
- Spring Boot 3.x
- Visual Studio Code / IntelliJ IDEA
- Postman
- Web Browser (Chrome/Firefox)

---

## Files in this Hands-On

- **pom.xml**  
  Maven configuration file containing Spring Boot Web, DevTools, and Test dependencies.

- **src/main/resources/application.properties**  
  Configuration file containing the server port and logging configuration.

- **src/main/java/com/cognizant/springlearn/SpringLearnApplication.java**  
  Main Spring Boot application class responsible for starting the application.

- **src/main/java/com/cognizant/springlearn/controller/HelloController.java**  
  REST controller that exposes the **GET /hello** endpoint and returns the message **"Hello World!!"** with start and end logging.

- **output1.png**  
  Screenshot showing the project structure in Visual Studio Code.

- **output2.png**  
  Screenshot showing successful execution of the REST service in a web browser.

- **output3.png**  
  Screenshot showing successful execution of the REST service using Postman.

---

## REST Endpoint

| Method | URL | Response |
|--------|-----|----------|
| GET | http://localhost:8083/hello | Hello World!! |

---

## Steps Performed

1. Created a Spring Boot Web project using Maven.
2. Added the Spring Web dependency.
3. Created the `HelloController` REST controller.
4. Implemented the `sayHello()` method.
5. Added **START** and **END** logging statements.
6. Configured the application to run on port **8083**.
7. Executed the application.
8. Tested the endpoint using both a web browser and Postman.

---

## Result

The Spring Boot RESTful web service was successfully implemented. The application responded with **"Hello World!!"** for the **GET /hello** request, and the endpoint was successfully verified using both a web browser and Postman with the required logging.