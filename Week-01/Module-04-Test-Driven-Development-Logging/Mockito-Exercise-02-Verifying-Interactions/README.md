# Mockito Exercise 2: Verifying Interactions

## Scenario

You need to ensure that a method is called with specific arguments or interactions occur as expected during the execution of a service.

---

## Steps

1. Create a mock object.
2. Call the method that uses the mock object.
3. Verify that the expected interaction occurred.

---

## Objective

The objective of this exercise is to understand how Mockito can be used to:

- Verify interactions between objects.
- Ensure methods are invoked as expected.
- Test behavior rather than just output.
- Improve confidence in unit tests.

---

## Solution Overview

In this exercise:

- An `ExternalApi` interface represents an external dependency.
- A `MyService` class depends on the `ExternalApi`.
- Mockito is used to create a mock implementation of the API.
- The service calls a method on the mock object.
- Mockito verifies that the interaction occurred exactly as expected.

---

## Files in this Exercise

- **pom.xml**  
  Maven configuration file containing JUnit and Mockito dependencies.

- **src/main/java/ExternalApi.java**  
  Interface representing an external API dependency.

- **src/main/java/MyService.java**  
  Service class that uses the external API.

- **src/test/java/MyServiceTest.java**  
  JUnit test class demonstrating interaction verification using Mockito.

- **output.png**  
  Screenshot showing successful execution of the test case.