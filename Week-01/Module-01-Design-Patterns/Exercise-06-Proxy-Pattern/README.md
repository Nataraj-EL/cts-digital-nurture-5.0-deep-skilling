# Exercise 6: Implementing the Proxy Pattern

## Scenario

You are developing an image viewer application that loads images from a remote server. Use the Proxy Pattern to add lazy initialization and caching.

---

## Steps

### 1. Create a New Java Project

Create a new Java project named **ProxyPatternExample**.

---

### 2. Define Subject Interface

Create an interface `Image` with a method:

- `display()`

---

### 3. Implement Real Subject Class

Create a class `RealImage` that implements `Image` and loads an image from a remote server.

---

### 4. Implement Proxy Class

Create a class `ProxyImage` that implements `Image` and holds a reference to `RealImage`.

Implement:
- Lazy initialization
- Caching mechanism

inside `ProxyImage`.

---

### 5. Test the Proxy Implementation

Create a test class to demonstrate the use of `ProxyImage` to load and display images.

---

## Files in this Exercise

- **CONCEPT.md** - Brief explanation of Proxy Pattern and real-world usage.
- **src/Image.java** - Subject interface.
- **src/RealImage.java** - Real object that loads image from server.
- **src/ProxyImage.java** - Proxy class with lazy loading and caching.
- **src/ProxyPatternTest.java** - Test class demonstrating the pattern.
- **output.png** - Screenshot of program output.