# Exercise 3: Assertions in JUnit

## Scenario

You need to use different assertions in JUnit to validate your test results.

---

## Steps

1. Write tests using various JUnit assertions.
2. Use different assertion methods to validate expected outcomes.
3. Execute the test cases and verify results.

---

## Solution Code Overview

The test class `AssertionsTest` demonstrates different JUnit assertions in a single test method.

```java
public class AssertionsTest {

    @Test
    public void testAssertions() {

        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }
}

```

## Files in this Exercise

- **pom.xml**  
  Maven configuration file containing JUnit dependency.

- **src/test/java/AssertionsTest.java**  
  JUnit test class demonstrating different assertion methods.

- **output.png**  
  Screenshot showing successful execution of all test cases.