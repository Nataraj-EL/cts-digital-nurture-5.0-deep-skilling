# Factory Method Pattern

## Introduction

The Factory Method Pattern is a **Creational Design Pattern** that provides a way to create objects without specifying their exact classes in the client code.

Instead of creating objects directly using `new`, the responsibility of object creation is delegated to factory classes.

---

## Why do we need it?

Imagine a document management system that supports multiple document types:

- Word Documents
- PDF Documents
- Excel Documents

If we create objects directly:

```java
WordDocument document = new WordDocument();
```
the client becomes tightly coupled to the concrete class.

As the application grows and new document types are introduced, maintaining the code becomes difficult.

The Factory Method Pattern solves this problem by moving the object creation logic into separate factory classes.

---

## Real-world Example

Think of a restaurant.

You order a pizza without worrying about:

- who prepares it
- what ingredients are used
- how it is baked

The kitchen takes care of creating the pizza and serves it to you.

Similarly, in the Factory Method Pattern, the client requests an object, and the factory creates it.

---

## Components of Factory Method Pattern

### Product

Represents the common interface or abstract class for all objects that can be created.

**Example:** `Document`

---

### Concrete Products

These are the actual implementations of the product.

**Examples:**

- `WordDocument`
- `PdfDocument`
- `ExcelDocument`

---

### Creator

An abstract class that declares the factory method.

**Example:** `DocumentFactory`

---

### Concrete Creators

Classes responsible for creating specific objects.

**Examples:**

- `WordDocumentFactory`
- `PdfDocumentFactory`
- `ExcelDocumentFactory`

---

## Advantages

- Reduces dependency on concrete classes.
- Promotes loose coupling.
- Makes the code easier to extend.
- Follows the Open-Closed Principle.

---

## Disadvantages

- Introduces more classes into the project.
- Can feel unnecessary for very small applications.

---

## Where is it used?

The Factory Method Pattern is commonly used in:

- Document management systems
- Database drivers
- GUI frameworks
- Notification systems
- Spring Framework and Spring Boot

---

## Key Takeaway

The Factory Method Pattern separates **object creation** from **object usage**.

Instead of creating objects directly, the client asks a factory to create them. This makes the application more flexible, maintainable, and easier to extend in the future.
