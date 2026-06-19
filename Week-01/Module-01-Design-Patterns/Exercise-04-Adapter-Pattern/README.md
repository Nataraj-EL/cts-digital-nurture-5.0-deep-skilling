# Exercise 4: Implementing the Adapter Pattern

## Scenario

You are developing a payment processing system that needs to integrate with multiple UPI-based payment gateways such as Google Pay, Paytm, and PhonePe.

Each payment provider has its own interface, but your system expects a unified way to process payments.

To handle this mismatch, we use the **Adapter Pattern**.

---

## Steps

### 1. Create a New Java Project

Create a new Java project named **AdapterPatternExample**.

---

### 2. Define Target Interface

Create a common interface `PaymentProcessor` with a method:

- `processPayment()`

This represents the expected behavior of your system.

---

### 3. Implement Adaptee Classes

Create third-party payment gateway classes:

- `GooglePayService`
- `PaytmService`
- `PhonePeService`

Each class has its own implementation style and method names.

---

### 4. Implement the Adapter Class

Create adapter classes:

- `GooglePayAdapter`
- `PaytmAdapter`
- `PhonePeAdapter`

Each adapter:

- Implements `PaymentProcessor`
- Converts `processPayment()` into gateway-specific method calls

This allows incompatible systems to work together seamlessly.

---

### 5. Test the Adapter Implementation

Create a test class to demonstrate how different payment gateways can be used through a single unified interface.

---

## Files in this Exercise

- **CONCEPT.md** – Brief explanation of Adapter Pattern and real-world usage.
- **src/PaymentProcessor.java** – Target interface.
- **src/GooglePayService.java** – Google Pay implementation.
- **src/PaytmService.java** – Paytm implementation.
- **src/PhonePeService.java** – PhonePe implementation.
- **src/GooglePayAdapter.java** – Adapter for Google Pay.
- **src/PaytmAdapter.java** – Adapter for Paytm.
- **src/PhonePeAdapter.java** – Adapter for PhonePe.
- **src/AdapterTest.java** – Test class demonstrating the pattern.
- **output.png** – Program output screenshot.
