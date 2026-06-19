# Strategy Pattern - Notes

## Intro

The Strategy Pattern is a **Behavioral Design Pattern**.

It helps us choose different ways of performing the same task without changing the client code.

Instead of writing multiple if-else conditions, each behavior is implemented as an individual strategy class.

The required strategy can then be selected during runtime.

---

## Why Strategy Pattern is needed

Consider a payment system.

A user may choose:

- Credit Card
- UPI
- Net Banking
- Wallet

If all these payment methods are implemented using if-else statements, the code becomes difficult to maintain.

Strategy Pattern solves this by separating each payment method into its own class.

---

## How it works

The pattern consists of:

### 1. Strategy Interface

Defines the common behavior.

Example:

- `PaymentStrategy`

---

### 2. Concrete Strategies

Provide different implementations.

Examples:

- `CreditCardPayment`
- `UPIPayment`

---

### 3. Context

Maintains a reference to the selected strategy.

Example:

- `PaymentContext`

The context delegates the task to the currently selected strategy.

---

## My understanding from this exercise

In this exercise:

- Each payment method is implemented independently.
- The user can switch payment methods at runtime.
- The context class remains unchanged regardless of the selected strategy.

---

## Real-world usage

Strategy Pattern is commonly used in:

- Payment gateways
- Sorting algorithms
- Route planning applications
- Authentication mechanisms
- Compression algorithms

---

## Key takeaway

Strategy Pattern helps in:

- Eliminating large if-else chains
- Promoting flexibility
- Following the Open/Closed Principle
- Making systems easier to extend

---

## Personal note

This pattern is useful whenever multiple approaches exist for performing the same task and the choice needs to be made dynamically.