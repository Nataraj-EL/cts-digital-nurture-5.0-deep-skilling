# Decorator Pattern - Notes

## Intro

The Decorator Pattern is used to add new functionality to an object dynamically without changing its original code.

It follows the principle of **composition over inheritance**.

---

## Why Decorator Pattern is needed

Suppose a notification system initially supports Email notifications.

Later, requirements change:

- Send Email + SMS
- Send Email + Slack
- Send Email + SMS + Slack

Creating subclasses for every combination becomes difficult:

- EmailNotifier
- EmailSMSNotifier
- EmailSlackNotifier
- EmailSMSSlackNotifier

This quickly becomes hard to maintain.

Decorator Pattern solves this problem by allowing features to be added dynamically.

---

## How it works

The pattern consists of:

1. Component Interface  
   Defines common operations.

2. Concrete Component  
   Basic implementation.

3. Decorator  
   Wraps another object implementing the same interface.

4. Concrete Decorators  
   Add new behavior before or after delegating to the wrapped object.

---

## My understanding from this exercise

In this exercise:

- `EmailNotifier` sends email notifications.
- `SMSNotifierDecorator` adds SMS notifications.
- `SlackNotifierDecorator` adds Slack notifications.

By wrapping decorators around each other, multiple notification channels can be enabled without changing existing code.

---

## Real-world usage

Decorator Pattern is commonly used in:

- Notification systems
- Java I/O Streams
- Logging frameworks
- Middleware pipelines
- Spring Security filters

---

## Key takeaway

Decorator Pattern helps us:

- Extend functionality dynamically
- Avoid creating too many subclasses
- Follow the Open/Closed Principle
- Keep the code flexible and maintainable

---

## Personal note

I found this pattern interesting because instead of creating many subclasses, we can simply wrap objects and add new features whenever required.