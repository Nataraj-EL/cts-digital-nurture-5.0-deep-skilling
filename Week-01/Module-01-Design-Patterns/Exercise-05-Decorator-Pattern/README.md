# Exercise 5: Implementing the Decorator Pattern

## Scenario

You are developing a notification system where notifications can be sent via multiple channels (e.g., Email, SMS). Use the Decorator Pattern to add functionalities dynamically.

---

## Steps

### 1. Create a New Java Project

Create a new Java project named **DecoratorPatternExample**.

---

### 2. Define Component Interface

Create an interface `Notifier` with a method:

- `send()`

---

### 3. Implement Concrete Component

Create a class `EmailNotifier` that implements `Notifier`.

---

### 4. Implement Decorator Classes

- Create an abstract decorator class `NotifierDecorator` that implements `Notifier`.
- The decorator should hold a reference to a `Notifier` object.
- Create concrete decorators such as:

  - `SMSNotifierDecorator`
  - `SlackNotifierDecorator`

These decorators add new notification channels dynamically.

---

### 5. Test the Decorator Implementation

Create a test class to demonstrate sending notifications via multiple channels using decorators.

---

## Files in this Exercise

- **CONCEPT.md** – Brief notes on the Decorator Pattern and its real-world usage.
- **src/Notifier.java** – Component interface.
- **src/EmailNotifier.java** – Basic notification implementation.
- **src/NotifierDecorator.java** – Abstract decorator class.
- **src/SMSNotifierDecorator.java** – Adds SMS notification functionality.
- **src/SlackNotifierDecorator.java** – Adds Slack notification functionality.
- **src/DecoratorPatternTest.java** – Test class demonstrating the pattern.
- **output.png** – Screenshot of the program output.