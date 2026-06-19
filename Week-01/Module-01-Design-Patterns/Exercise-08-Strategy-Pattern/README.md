# Exercise 8: Implementing the Strategy Pattern

## Scenario

You are developing a payment system where different payment methods (e.g., Credit Card, UPI) can be selected at runtime. Use the Strategy Pattern to achieve this.

---

## Steps

### 1. Create a New Java Project

Create a new Java project named **StrategyPatternExample**.

---

### 2. Define Strategy Interface

Create an interface `PaymentStrategy` with a method:

- `pay()`

---

### 3. Implement Concrete Strategies

Create classes:

- `CreditCardPayment`
- `UPIPayment`

Both classes should implement `PaymentStrategy`.

---

### 4. Implement Context Class

Create a class `PaymentContext` that:

- Holds a reference to `PaymentStrategy`
- Provides a method to execute the selected strategy

---

### 5. Test the Strategy Implementation

Create a test class to demonstrate selecting and using different payment strategies.

---

## Files in this Exercise

- **CONCEPT.md** - Brief explanation of Strategy Pattern and its applications.
- **src/PaymentStrategy.java** - Strategy interface.
- **src/CreditCardPayment.java** - Credit card payment strategy.
- **src/UPIPayment.java** - UPI payment strategy.
- **src/PaymentContext.java** - Context class that executes strategies.
- **src/StrategyPatternTest.java** - Test class demonstrating strategy switching.
- **output.png** - Screenshot of program output.