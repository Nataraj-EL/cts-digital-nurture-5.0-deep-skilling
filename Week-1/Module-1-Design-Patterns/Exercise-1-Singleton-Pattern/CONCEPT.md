# Singleton Pattern

## What is the Singleton Pattern?

> The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.

### Real Time Example

Think of a company's CEO.

There is only one CEO, and everyone in the organization refers to the same person while decision making.

Similarly, in software, certain components such as a logger or configuration manager should exist only once and be shared across the application.

---

## Common Singleton Implementations

### 1. Lazy Initialization

The object is created only when it is needed for the first time.

**Pros**

- Memory efficient
- Simple to implement
- Object is created only when required

**Cons**

- Not thread-safe
- Multiple instances can be created in multithreaded applications

---

### 2. Thread-Safe Singleton (Synchronized Method)

The method responsible for creating the instance is synchronized to prevent multiple threads from creating multiple objects.

**Pros**

- Thread safe process 
- Easy to understand and to implement

**Cons**

- Synchronization introduces performance overhead
- Every call requires acquiring a lock

---

### 3. Double-Checked Locking

Synchronization is performed only during the first object creation, which significantly improves the performance.

**Pros**

- Thread safe process
- Better performance than synchronized methods
- Synchronization happens only once

**Cons**

- Slightly complex to understand
- Requires the use of `volatile`

---

### 4. Eager Initialization

The object is created as soon as the class is loaded.

**Pros**

- Simple implementation
- Thread safe by default
- No synchronization required

**Cons**

- Object is created even if it is never used
- May lead to unnecessary memory usage

---

### 5. Bill Pugh Singleton

Uses a static inner helper class to create the instance only when required.

**Pros**

- Thread safe
- Lazy initialization
- No synchronization overhead
- Widely preferred in enterprise applications

**Cons**

- Slightly difficult to understand for beginners

---

### 6. Enum-based Singleton

Implements Singleton using Java's `enum`.

**Pros**

- Very simple and concise
- Thread safe
- Handles serialization automatically
- Protects against reflection attacks

**Cons**

- Not suitable when lazy initialization is required
- Less flexible compared to class based implementations

---

## Comparison of Singleton Implementations

| Implementation | Lazy Initialization | Thread Safe | Performance | Complexity |
|----------------|---------------------|------------|------------|-----------|
| Lazy Initialization | Yes | No | High | Easy |
| Synchronized Method | Yes | Yes | Medium | Easy |
| Double-Checked Locking | Yes | Yes | High | Medium |
| Eager Initialization | No | Yes | High | Easy |
| Bill Pugh Singleton | Yes | Yes | Very High | Medium |
| Enum Singleton | No | Yes | Very High | Easy |

---

## Which Implementation is Preferred in Industry?

That's completely depends on the use case:

- **Small applications** commonly use **Eager Initialization** or **Synchronized Singleton** because of their simplicity.
- **Enterprise Java applications** often prefer **Bill Pugh Singleton** because it offers both thread safety and efficient lazy initialization.
- **Modern Java applications** may use **Enum Singleton** due to its simplicity and protection against serialization and reflection issues.
- In **Spring Boot**, the framework manages Singleton beans automatically, so developers rarely implement the pattern manually.

---

## Real-world Applications

Singleton Pattern is commonly used in:

- Logging frameworks
- Configuration managers
- Cache managers
- Database connection pools
- Runtime environment objects
- Spring Beans (`@Service`, `@Repository`, `@Component`)

---

## Key Takeaway

Singleton is not just about creating a single object.

It is about:

- Controlled object creation
- Shared access to resources
- Consistent application state
- Efficient memory utilization

Choosing the right Singleton implementation depends on the application's requirements, especially with respect to **thread safety**, **performance**, and **simplicity**.