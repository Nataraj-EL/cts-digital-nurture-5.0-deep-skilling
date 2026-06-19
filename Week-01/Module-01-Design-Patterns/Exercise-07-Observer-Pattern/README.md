# Exercise 7: Implementing the Observer Pattern

## Scenario

You are developing a stock market monitoring application where multiple clients need to be notified whenever stock prices change. Use the Observer Pattern to achieve this.

---

## Steps

### 1. Create a New Java Project

Create a new Java project named **ObserverPatternExample**.

---

### 2. Define Subject Interface

Create an interface `Stock` with methods to:

- Register observers
- Deregister observers
- Notify observers

---

### 3. Implement Concrete Subject

Create a class `StockMarket` that implements `Stock` and maintains a list of observers.

---

### 4. Define Observer Interface

Create an interface `Observer` with a method:

- `update()`

---

### 5. Implement Concrete Observers

Create classes:

- `MobileApp`
- `WebApp`

Both classes should implement the `Observer` interface.

---

### 6. Test the Observer Implementation

Create a test class to demonstrate the registration and notification of observers.

---

## Files in this Exercise

- **CONCEPT.md** – Brief explanation of Observer Pattern and real-world usage.
- **src/Stock.java** – Subject interface.
- **src/StockMarket.java** – Concrete subject maintaining observers.
- **src/Observer.java** – Observer interface.
- **src/MobileApp.java** – Mobile client implementation.
- **src/WebApp.java** – Web client implementation.
- **src/ObserverPatternTest.java** – Test class demonstrating the pattern.
- **output.png** – Screenshot of program output.