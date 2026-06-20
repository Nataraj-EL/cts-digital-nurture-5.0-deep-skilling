# MVC Pattern - Notes

## Intro

MVC (Model-View-Controller) is an **Architectural Pattern**.

Unlike design patterns that solve specific programming problems, architectural patterns define the overall structure of an application.

MVC separates an application into three independent components: Model, View, and Controller.

The MVC pattern separates:

- Data (Model)
- User Interface (View)
- Business Logic (Controller)

This separation makes the application easier to develop, maintain, and scale.

---

## Why MVC is needed

In small applications, data handling, business logic, and user interface are often written together.

As the application grows, this becomes difficult to:

- Maintain
- Test
- Extend

MVC solves this problem by assigning clear responsibilities to different components.

---

## Components of MVC

### 1. Model

Represents the data of the application.

Example:

- `Student`

The model stores:

- Name
- ID
- Grade

---

### 2. View

Responsible for presenting data to the user.

Example:

- `StudentView`

The view displays student information but does not modify it.

---

### 3. Controller

Acts as a bridge between Model and View.

Example:

- `StudentController`

The controller:

- Receives user actions
- Updates the model
- Refreshes the view

---

## My understanding from this exercise

In this exercise:

- `Student` stores the student information.
- `StudentView` displays the information.
- `StudentController` updates the student details and coordinates communication between the model and view.

This separation keeps the application organized and easier to maintain.

---

## Real-world usage

MVC is widely used in:

- Spring MVC
- Java Swing applications
- ASP.NET MVC
- Ruby on Rails
- Django (MVT, inspired by MVC)

---

## Key takeaway

MVC helps in:

- Separation of concerns
- Better maintainability
- Easier testing
- Improved scalability

---

## Personal note

MVC is one of the most influential architectural patterns.

Many modern frameworks are built around the same principle of separating data, presentation, and control logic.