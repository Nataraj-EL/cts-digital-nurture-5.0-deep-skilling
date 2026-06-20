# Dependency Injection - Notes

## Pattern Category

Dependency Injection (DI) is a **Design Principle** used to achieve **Inversion of Control (IoC)**.

It helps reduce tight coupling between classes by providing dependencies from outside rather than creating them internally.

---

## What I understood

A class often depends on another class to perform its tasks.

For example:

- `CustomerService` needs `CustomerRepository`
- Instead of creating the repository inside the service,
- We provide the repository from outside.

This process is called **Dependency Injection**.

---

## Why Dependency Injection is needed

Without DI:

- Classes become tightly coupled
- Testing becomes difficult
- Replacing implementations requires modifying existing code

With DI:

- Dependencies are loosely coupled
- Components become easier to test
- Implementations can be changed without affecting the service class

---

## Types of Dependency Injection

1. Constructor Injection
2. Setter Injection
3. Field Injection

Among these, **Constructor Injection** is the most recommended approach because dependencies become mandatory and immutable.

---

## My understanding from this exercise

In this exercise:

- `CustomerRepository` defines the repository operations.
- `CustomerRepositoryImpl` provides the implementation.
- `CustomerService` depends on the repository.
- The repository object is injected into the service through its constructor.

This keeps the service independent of any specific repository implementation.

---

## Real-world usage

Dependency Injection is widely used in:

- Spring Framework
- Spring Boot
- Jakarta EE
- ASP.NET Core
- Angular

---

## Key takeaway

Dependency Injection helps in:

- Loose coupling
- Better testability
- Easier maintenance
- Improved flexibility

---

## Personal note

Dependency Injection is one of the most important concepts in modern software development.

Frameworks like Spring Boot use DI extensively to manage objects and their dependencies automatically.