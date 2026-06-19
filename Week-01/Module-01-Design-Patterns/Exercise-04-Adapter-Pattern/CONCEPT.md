# Adapter Pattern - Notes

## Intro

The Adapter Pattern is used when two systems that are not compatible need to work together.

In simple terms, it acts like a **bridge between two different interfaces**.

It allows existing classes to be used without modifying their original code.

---

## Why Adapter Pattern is needed

In real-world applications, we often integrate third-party services like:

- Google Pay
- Paytm
- PhonePe
- External APIs

The problem is that each service has its own method structure and naming style.

Our system expects a common interface, but the external systems do not match it.

This is where the Adapter Pattern helps.

---

## How it works 

The Adapter Pattern has three main parts:

### 1. Target Interface
This is the interface our system expects.

Example:
- `PaymentProcessor` with method `processPayment()`

---

### 2. Adaptee (Existing system)
These are external services with their own methods.

Example:
- Google Pay service
- Paytm service
- PhonePe service

Each of them works differently.

---

### 3. Adapter
The adapter connects both worlds.

It:
- Implements the target interface
- Internally calls the adaptee’s method

So the system doesn’t need to know how the payment is actually processed.

---

## My understanding from this exercise

In this exercise, I simulated different payment gateways:

- Google Pay
- Paytm
- PhonePe

Each service had its own method structure.

Instead of changing their code, I created adapter classes for each one.

These adapters made all gateways usable through a single interface: `PaymentProcessor`.

---

## Real-world usage

This pattern is widely used in industry:

- Payment gateway integrations
- Legacy system integration
- API integration (REST, SOAP conversion)
- Cloud service adapters

Example:
A system written in one format can still work with another system without rewriting everything.

---

## Key takeaway

The Adapter Pattern helps in:

- Reusing existing code
- Avoiding modification of third-party systems
- Making incompatible interfaces work together
- Improving system flexibility

---

## Personal note

This pattern is very practical because in real projects, we rarely build everything from scratch.

Most of the time, we integrate existing systems, and Adapter Pattern makes that integration clean and manageable.
