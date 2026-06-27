# Exercise 9: Creating a Spring Boot Application

## Scenario

You need to create a Spring Boot application for the library management system to simplify application configuration, dependency management, and deployment.

---

## Steps

1. Create a new Spring Boot project named **LibraryManagement** using Spring Initializr.
2. Add the required dependencies:
   - Spring Web
   - Spring Data JPA
   - H2 Database
3. Configure the database connection in the `application.properties` file.
4. Create a `Book` entity to represent book records.
5. Create a `BookRepository` interface using Spring Data JPA.
6. Create a REST controller to perform CRUD operations on books.
7. Run the Spring Boot application and test the REST endpoints.

---

## Objective

The objective of this exercise is to understand the fundamentals of Spring Boot application development, including project creation, dependency management, database configuration, REST API development, and data persistence using Spring Data JPA.

---

## Solution Overview

In this exercise:

- A Spring Boot project is created using Spring Initializr.
- Spring Web, Spring Data JPA, and H2 Database dependencies are added.
- An in-memory H2 database is configured.
- A `Book` entity is created using JPA annotations.
- A `BookRepository` interface is implemented using Spring Data JPA.
- A REST controller exposes endpoints to perform CRUD operations on books.
- The application is executed using the embedded Tomcat server.

---

## Files in this Exercise

- **pom.xml**  
  Maven configuration file containing the Spring Boot, Spring Web, Spring Data JPA, and H2 Database dependencies.

- **src/main/resources/application.properties**  
  Configuration file containing H2 database and Spring Boot application properties.

- **src/main/java/com/library/entity/Book.java**  
  JPA entity representing the Book table.

- **src/main/java/com/library/repository/BookRepository.java**  
  Spring Data JPA repository interface for performing database operations.

- **src/main/java/com/library/controller/BookController.java**  
  REST controller exposing CRUD endpoints for managing books.

- **src/main/java/com/library/LibraryManagementApplication.java**  
  Main Spring Boot application class.

- **output.png**  
  Screenshot showing successful execution of the Spring Boot application.