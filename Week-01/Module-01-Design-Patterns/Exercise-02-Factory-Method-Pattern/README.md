# Exercise 2: Implementing the Factory Method Pattern

## Scenario

You are developing a document management system that needs to create different types of documents (e.g., Word, PDF, Excel). Use the Factory Method Pattern to achieve this.

---

## Steps

### 1. Create a New Java Project

Create a new Java project named **FactoryMethodPatternExample**.

---

### 2. Define Document Classes

Create interfaces or abstract classes for different document types such as:

- WordDocument
- PdfDocument
- ExcelDocument

---

### 3. Create Concrete Document Classes

Implement concrete classes for each document type that implements or extends the above interfaces or abstract classes.

---

### 4. Implement the Factory Method

- Create an abstract class `DocumentFactory` with a method `createDocument()`.
- Create concrete factory classes for each document type that extends `DocumentFactory` and implements the `createDocument()` method.

---

### 5. Test the Factory Method Implementation

Create a test class to demonstrate the creation of different document types using the factory method.

---

## Files in this Exercise

- **CONCEPT.md** – Brief notes on the Factory Method Pattern and its common implementations.
- **src/Document.java** – Common interface for all document types.
- **src/WordDocument.java** – Concrete implementation for Word documents.
- **src/PdfDocument.java** – Concrete implementation for PDF documents.
- **src/ExcelDocument.java** – Concrete implementation for Excel documents.
- **src/DocumentFactory.java** – Abstract factory class defining the factory method.
- **src/WordDocumentFactory.java** – Factory for creating Word documents.
- **src/PdfDocumentFactory.java** – Factory for creating PDF documents.
- **src/ExcelDocumentFactory.java** – Factory for creating Excel documents.
- **src/FactoryMethodTest.java** – Test class to verify Factory Method behavior.
- **output.png** – Screenshot of the program output.
