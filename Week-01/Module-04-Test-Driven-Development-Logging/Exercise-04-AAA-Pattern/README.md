# Exercise 4: AAA Pattern (Arrange - Act - Assert)

## Scenario

You need to understand and implement the AAA (Arrange-Act-Assert) pattern in JUnit tests to improve readability and structure of unit tests.

---

## Objective

The AAA pattern is a standard structure used in unit testing to make tests clear and maintainable:

- **Arrange** → Set up test data and preconditions
- **Act** → Execute the method under test
- **Assert** → Verify the result

---

## Example Use Case

A simple calculator class is tested using the AAA pattern to validate addition functionality.

---

## Solution Code Overview

### Calculator Class

```java id="calc1"
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
}

## Files in this Exercise

- pom.xml  
  Maven configuration file with JUnit dependency.

- **src/test/java/Calculator.java**  
  Simple calculator class containing business logic.

- **src/test/java/CalculatorTest.java**  
  JUnit test class implementing the AAA (Arrange–Act–Assert) pattern.

- **output.png**  
  Screenshot showing successful test execution.

