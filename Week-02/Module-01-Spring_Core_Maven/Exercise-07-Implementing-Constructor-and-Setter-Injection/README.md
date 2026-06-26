# Exercise 7: Implementing Constructor and Setter Injection

## Scenario

The library management application requires both constructor injection and setter injection to manage dependencies between the `BookService` and `BookRepository` classes.

---

## Steps

1. Configure constructor injection for the `BookService` bean in the `applicationContext.xml` file.
2. Configure setter injection to inject the `BookRepository` dependency into the `BookService` bean.
3. Update the `BookService` class to support both constructor-based and setter-based dependency injection.
4. Load the Spring Application Context and verify that both injections are working correctly.

---

## Objective

The objective of this exercise is to understand how Spring supports both constructor injection and setter injection for managing dependencies between application components.

---

## Solution Overview

In this exercise:

- Spring IoC Container is configured using XML-based configuration.
- Constructor injection is used to initialize the `BookService` bean.
- Setter injection is used to inject the `BookRepository` dependency.
- The application loads the Spring context and verifies that both dependency injection techniques are working successfully.

---

## Files in this Exercise

- **pom.xml**  
  Maven configuration file containing the required Spring Framework dependencies.

- **src/main/resources/applicationContext.xml**  
  Spring XML configuration file demonstrating both constructor injection and setter injection.

- **src/main/java/com/library/repository/BookRepository.java**  
  Repository class responsible for handling book-related operations.

- **src/main/java/com/library/service/BookService.java**  
  Service class implementing both constructor injection and setter injection.

- **src/main/java/com/library/LibraryManagementApplication.java**  
  Main class that loads the Spring Application Context and verifies dependency injection.

- **output.png**  
  Screenshot showing successful execution of the application.