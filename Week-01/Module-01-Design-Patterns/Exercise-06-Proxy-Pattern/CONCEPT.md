# Proxy Pattern - Notes

## Intro

The Proxy Pattern is a **Structural Design Pattern**.

The Proxy Pattern acts like a **middle layer between the client and the real object**.

Instead of directly accessing the real object, the client interacts with a proxy object.

The proxy controls:
- When the real object is created
- Whether it should be reused (caching)
- How it should be accessed

---

## Why Proxy Pattern is needed

In real applications, creating or loading objects can be expensive.

Example:
- Loading images from a remote server
- Fetching large files
- Database-heavy objects

If we load everything directly, the system becomes slow.

Proxy Pattern helps by delaying object creation until it is actually needed.

---

## How it works

The pattern has three parts:

### 1. Subject Interface
Defines common behavior.

Example:
- `Image` interface with `display()` method

---

### 2. Real Subject
The actual object that performs the real work.

Example:
- `RealImage` loads image from server

---

### 3. Proxy
Acts as a wrapper around the real object.

It:
- Creates the real object only when needed (lazy loading)
- Reuses it if already created (caching)
- Controls access to it

---

## My understanding from this exercise

In this exercise:

- `ProxyImage` is used instead of directly loading `RealImage`
- The image is loaded only when `display()` is called for the first time
- After that, the same object is reused

This improves performance by avoiding unnecessary loading.

---

## Real-world usage

Proxy Pattern is widely used in:

- Image loading systems (like social media apps)
- Hibernate lazy loading
- Spring AOP (security, logging proxies)
- API gateways
- Caching systems

---

## Key takeaway

Proxy Pattern helps in:

- Improving performance through lazy loading
- Adding caching without modifying real objects
- Controlling access to expensive resources
- Keeping system efficient and scalable

---

## Personal note

This pattern is very useful in real systems where objects are heavy or expensive to create.

Instead of loading everything upfront, we load only what is required.