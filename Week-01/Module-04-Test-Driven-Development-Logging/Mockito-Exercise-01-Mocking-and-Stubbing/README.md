# Mockito Exercise 1: Mocking and Stubbing

## Scenario

You need to test a service that depends on an external API. Use Mockito to mock the external API and stub its methods.

---

## Steps

1. Create a mock object for the external API.
2. Stub the methods to return predefined values.
3. Write a test case that uses the mock object.

---

## Solution Overview

In this exercise:

- An `ExternalApi` interface represents an external dependency.
- A `MyService` class depends on the `ExternalApi`.
- Mockito is used to create a mock implementation of the API.
- The `getData()` method is stubbed to return predefined data.
- A JUnit test verifies that the service correctly uses the mocked dependency.

---

## Files in this Exercise

- **pom.xml**  
  Maven configuration file containing JUnit and Mockito dependencies.

- **src/main/java/ExternalApi.java**  
  Interface representing an external API dependency.

- **src/main/java/MyService.java**  
  Service class that uses the external API to fetch data.

- **src/test/java/MyServiceTest.java**  
  JUnit test class that uses Mockito for mocking and stubbing.

- **output.png**  
  Screenshot showing successful execution of the test case.