# Observer Pattern - Notes

## Intro

The Observer Pattern is a **Behavioral Design Pattern**.

It is used when multiple objects need to stay updated about changes happening in another object.

Instead of checking continuously for updates, observers are automatically notified whenever the subject changes.

---

## Why Observer Pattern is needed

Consider a stock market application.

When the stock price changes:

- Mobile users should receive updates
- Web users should receive updates
- Future applications may also subscribe

Without Observer Pattern, the stock market class would need to know every client explicitly.

This creates tight coupling and makes the system difficult to maintain.

Observer Pattern solves this by keeping the subject and observers loosely coupled.

---

## How it works

The pattern consists of:

### 1. Subject

Maintains a list of observers.

It can:

- Register observers
- Remove observers
- Notify observers

---

### 2. Observer

Defines an interface that all observers must implement.

Example:

- `update()`

---

### 3. Concrete Subject

The actual object whose state changes.

Example:

- `StockMarket`

---

### 4. Concrete Observers

Objects that want updates.

Examples:

- MobileApp
- WebApp

---

## My understanding from this exercise

In this exercise:

- `StockMarket` maintains stock prices.
- `MobileApp` and `WebApp` subscribe to stock updates.
- Whenever the stock price changes, all registered observers are notified automatically.

---

## Real-world usage

Observer Pattern is widely used in:

- Stock market applications
- Notification systems
- Event-driven architectures
- Spring Application Events
- Kafka consumers
- React state management

---

## Key takeaway

Observer Pattern helps in:

- Loose coupling between objects
- Automatic event notification
- Easy addition of new observers
- Building scalable event-driven systems

---

## Personal note

This pattern closely resembles real-life subscription systems.

Instead of polling for updates repeatedly, observers simply subscribe and receive notifications whenever something changes.