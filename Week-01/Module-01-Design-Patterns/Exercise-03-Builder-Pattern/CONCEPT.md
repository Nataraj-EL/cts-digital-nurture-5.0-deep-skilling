# Builder Pattern – Notes

## Intro

The Builder Pattern is used when we need to create objects that have **many optional fields**. Instead of creating multiple constructors or passing long parameter lists, we use a step-by-step approach to build the object.

It makes object creation more readable and flexible.

---

## Why Builder Pattern is useful

In real applications, objects like a `Computer`, `Car`, or `UserProfile` often have many attributes.

If we try to handle this using constructors, the code becomes messy like:

- too many constructor overloads
- confusion about parameter order
- hard to maintain when new fields are added

Builder Pattern solves this by making object creation clear and controlled.

---

## How it works (in simple terms)

Instead of directly creating the object, we:

1. Create a **Builder class**
2. Set values step by step
3. Finally call `build()` to get the object

So the object is only created when everything is ready.

---

## My understanding from this exercise

In this exercise, I created a `Computer` class with:

- CPU
- RAM
- Storage
- GPU (optional)
- OS (optional)

Instead of passing everything at once, I used a Builder class to set only what I need.

For example:

- One system is a basic office PC
- Another is a gaming PC
- Another is a minimal development setup

Each one is created using the same structure, but different configurations.

---

## Real-world usage

I found that this pattern is actually used in many real systems:

- Creating complex configuration objects
- Spring Boot builders
- Lombok `@Builder`
- API request object creation

---

## Key takeaway

The Builder Pattern makes object creation:

- cleaner
- easier to read
- flexible for future changes

Instead of forcing many constructors, it allows building objects step by step in a readable way.

---

## Personal note

This pattern feels very practical because it reduces confusion when objects become complex. It is one of those patterns that directly improves code clarity in real projects.
