# Hands-On 1: Spring Data JPA - Quick Example

## Scenario

You need to create a Spring Boot application that uses Spring Data JPA and Hibernate to interact with a MySQL database. The application should retrieve data from a `Country` table using the repository pattern.

---

## Steps

1. Create a Spring Boot project named **orm-learn** using Spring Initializr.
2. Add the required dependencies:
   - Spring Boot DevTools
   - Spring Data JPA
   - MySQL Driver
3. Configure the database connection in the `application.properties` file.
4. Create a `Country` entity class and map it to the `country` table.
5. Create a `CountryRepository` interface by extending `JpaRepository`.
6. Create a `CountryService` class to retrieve all countries from the database.
7. Modify the main application class to invoke the service and display the retrieved data.
8. Run the application and verify that the country records are fetched successfully from the MySQL database.

---

## Objective

The objective of this hands-on is to understand the fundamentals of Spring Data JPA, Hibernate, and the Repository pattern by building a Spring Boot application that performs database operations using a MySQL database.

---

## Solution Overview

In this hands-on:

- A Spring Boot project is created using Spring Initializr.
- Spring Data JPA and MySQL dependencies are configured.
- A MySQL database named `ormlearn` is connected to the application.
- A `Country` entity is mapped to the `country` table.
- A `CountryRepository` interface is created using Spring Data JPA.
- A service layer retrieves all country records from the database.
- The application loads the Spring context and displays the retrieved countries in the console.

---

## Files in this Hands-On

- **pom.xml**  
  Maven configuration file containing Spring Boot, Spring Data JPA, DevTools, and MySQL dependencies.

- **src/main/resources/application.properties**  
  Configuration file containing database connection details, Hibernate settings, and logging configuration.

- **src/main/java/com/cognizant/ormlearn/model/Country.java**  
  JPA entity class representing the `country` table.

- **src/main/java/com/cognizant/ormlearn/repository/CountryRepository.java**  
  Spring Data JPA repository interface for performing database operations.

- **src/main/java/com/cognizant/ormlearn/service/CountryService.java**  
  Service class responsible for retrieving country data using the repository.

- **src/main/java/com/cognizant/ormlearn/OrmLearnApplication.java**  
  Main Spring Boot application class that loads the application context and invokes the service.

- **output.png**  
  Screenshot showing successful execution of the application and retrieval of country records.