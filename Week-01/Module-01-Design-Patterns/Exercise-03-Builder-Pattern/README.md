# Exercise 3: Implementing the Builder Pattern

## Scenario

You are developing a system to create complex objects such as a Computer with multiple optional parts. Use the Builder Pattern to manage the construction process.

---

## Steps

### 1. Create a New Java Project

Create a new Java project named **BuilderPatternExample**.

---

### 2. Define a Product Class

Create a class `Computer` with attributes like:

- CPU  
- RAM  
- Storage  
- Graphics Card (optional)  
- Operating System (optional)

---

### 3. Implement the Builder Class

- Create a static nested `Builder` class inside `Computer`.
- The Builder class should have methods to set each attribute.
- Each method should return the Builder object to support method chaining.

---

### 4. Implement the Builder Pattern

- Ensure that the `Computer` class has a **private constructor**.
- The constructor should accept a `Builder` object and initialize the fields from it.

---

### 5. Test the Builder Implementation

Create a test class to demonstrate the creation of different configurations of `Computer` using the Builder Pattern.

---

## Files in this Exercise

- **CONCEPT.md** - Brief notes on the Builder Pattern and its real-world usage.
- **src/Computer.java** - Product class with static Builder class.
- **src/BuilderPatternTest.java** - Test class to create different computer configurations.
- **output.png** - Screenshot of the program output.