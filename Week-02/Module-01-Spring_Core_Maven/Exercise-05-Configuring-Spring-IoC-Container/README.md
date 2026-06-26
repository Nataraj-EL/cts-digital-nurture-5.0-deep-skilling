# Exercise 5: Configuring the Spring IoC Container

## Scenario

The library management application requires a central configuration to manage application beans and their dependencies using the Spring IoC Container.

---

## Steps

1. Create an XML configuration file named `applicationContext.xml` inside the `src/main/resources` directory.
2. Define beans for `BookService` and `BookRepository` in the configuration file.
3. Configure dependency injection by wiring the `BookRepository` bean into the `BookService` bean.
4. Update the `BookService` class to include a setter method for `BookRepository`.
5. Create a main class to load the Spring Application Context and verify the bean configuration.

---

## Objective

The objective of this exercise is to understand how the Spring IoC Container manages bean creation, configuration, and dependency injection using XML-based configuration.

---

## Solution Overview

In this exercise:

- The Spring IoC Container is configured using an XML configuration file.
- Beans for `BookService` and `BookRepository` are defined in the Spring configuration.
- Setter-based Dependency Injection is used to inject `BookRepository` into `BookService`.
- The application loads the Spring Application Context and retrieves the configured bean to verify the configuration.

---

## Files in this Exercise

- **pom.xml**  
  Maven configuration file containing the required Spring Framework dependencies.

- **src/main/resources/applicationContext.xml**  
  Spring XML configuration file defining the application beans and their dependencies.

- **src/main/java/com/library/repository/BookRepository.java**  
  Repository class responsible for managing book-related data.

- **src/main/java/com/library/service/BookService.java**  
  Service class that receives the `BookRepository` dependency through setter injection.

- **src/main/java/com/library/LibraryManagementApplication.java**  
  Main class that loads the Spring IoC Container and verifies the bean configuration.

- **output.png**  
  Screenshot showing successful execution of the application.