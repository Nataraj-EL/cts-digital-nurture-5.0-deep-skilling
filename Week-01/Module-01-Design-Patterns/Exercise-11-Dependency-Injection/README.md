# Exercise 11: Implementing Dependency Injection

## Scenario

You are developing a customer management application where the service class depends on a repository class. Use Dependency Injection to manage these dependencies.

---

## Steps

### 1. Create a New Java Project

Create a new Java project named **DependencyInjectionExample**.

---

### 2. Define Repository Interface

Create an interface `CustomerRepository` with methods like:

- `findCustomerById()`

---

### 3. Implement Concrete Repository

Create a class `CustomerRepositoryImpl` that implements `CustomerRepository`.

---

### 4. Define Service Class

Create a class `CustomerService` that depends on `CustomerRepository`.

---

### 5. Implement Dependency Injection

Use **constructor injection** to inject `CustomerRepository` into `CustomerService`.

---

### 6. Test the Dependency Injection Implementation

Create a main class to demonstrate:

- Creating a `CustomerService` with `CustomerRepositoryImpl`
- Using it to find a customer

---

## Files in this Exercise

- **CONCEPT.md** - Explanation of Dependency Injection and constructor injection.
- **src/CustomerRepository.java** - Repository interface.
- **src/CustomerRepositoryImpl.java** - Concrete repository implementation.
- **src/CustomerService.java** - Service class that uses dependency injection.
- **src/DependencyInjectionTest.java** - Main class demonstrating dependency injection.
- **output.png** - Screenshot of program output.