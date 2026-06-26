# Exercise 1: Configuring a Basic Spring Application

## Scenario

Your company is developing a web application for managing a library. You need to use the Spring Framework to handle the backend operations.

---

## Steps

1. Create a Maven project named **LibraryManagement**.
2. Add Spring Core dependencies to the `pom.xml` file.
3. Create an XML configuration file named `applicationContext.xml`.
4. Define Spring beans for `BookService` and `BookRepository`.
5. Create the service and repository classes.
6. Load the Spring Application Context and test the configuration.

---

## Objective

The objective of this exercise is to understand the fundamentals of the Spring Framework by configuring a basic Spring application using XML-based bean configuration.

---

## Solution Overview

In this exercise:

- Maven is used to manage project dependencies.
- Spring Core is configured using an XML configuration file.
- `BookRepository` is defined as a Spring bean.
- `BookService` is defined as a Spring bean and depends on `BookRepository`.
- The application loads the Spring Application Context and retrieves the configured bean for execution.

---

## Files in this Exercise

- **pom.xml**  
  Maven configuration file containing the Spring Core dependency.

- **src/main/resources/applicationContext.xml**  
  Spring XML configuration file containing bean definitions.

- **src/main/java/com/library/repository/BookRepository.java**  
  Repository class responsible for managing book-related operations.

- **src/main/java/com/library/service/BookService.java**  
  Service class that uses the repository to perform business operations.

- **src/main/java/com/library/LibraryManagementApplication.java**  
  Main class that loads the Spring Application Context and tests the bean configuration.

- **output.png**  
  Screenshot showing successful execution of the Spring application.