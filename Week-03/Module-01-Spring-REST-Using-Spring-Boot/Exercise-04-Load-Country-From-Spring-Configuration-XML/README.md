# Exercise 04 – Spring Core: Load Country from Spring Configuration XML

## Objective

This exercise demonstrates how to configure and load a Spring bean using an XML configuration file. A `Country` bean is defined in `country.xml`, loaded using `ClassPathXmlApplicationContext`, and its properties are displayed through the application.

## Technologies Used

- Java 17
- Spring Boot 3.5.3
- Spring Framework 6
- Spring Core
- Maven
- SLF4J Logging
- VS Code

## Files in this Hands-On

- **pom.xml**  
  Maven configuration file containing Spring Boot, Spring Web, Spring Context, DevTools, and logging dependencies.

- **src/main/resources/application.properties**  
  Configures the application's logging levels.

- **src/main/resources/country.xml**  
  Spring XML configuration file that defines the `Country` bean and initializes its properties.

- **src/main/java/com/cognizant/springlearn/Country.java**  
  Java bean representing a country with `code` and `name` properties. Includes logging in the constructor, getters, and setters.

- **src/main/java/com/cognizant/springlearn/SpringLearnApplication.java**  
  Main Spring Boot application that loads the Spring XML configuration, retrieves the `Country` bean, and displays its details.

- **output.png**  
  Screenshot showing successful execution of the application and loading of the `Country` bean from the Spring XML configuration.

## Bean Configuration

The `country.xml` file defines a Spring bean as follows:

- Bean ID: `country`
- Class: `com.cognizant.springlearn.Country`
- Country Code: `IN`
- Country Name: `India`

## How to Run

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.cognizant.springlearn.SpringLearnApplication"
```

Alternatively:

```bash
mvn spring-boot:run
```

## Expected Output

- Spring application starts successfully.
- `country.xml` is loaded.
- `Country` bean is created.
- Constructor and setter methods are invoked.
- Country details are displayed in the console.

Example:

```
Starting Spring Learn Application
Inside displayCountry()
Inside Country Constructor.
Inside setCode()
Inside setName()
Country : Country{code='IN', name='India'}
Spring Learn Application Started Successfully
```

## Learning Outcomes

- Configure Spring beans using XML.
- Understand the purpose of the `<bean>` and `<property>` tags.
- Load Spring configuration using `ClassPathXmlApplicationContext`.
- Retrieve beans using `ApplicationContext#getBean()`.
- Observe the Spring bean lifecycle through logging.
- Understand how dependency injection works using XML configuration.