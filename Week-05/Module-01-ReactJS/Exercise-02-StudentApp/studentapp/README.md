# Exercise 02 - Creating Multiple React Components

## Objective

This exercise demonstrates how to create and render multiple React class components in a React application. It focuses on understanding React components, their types, and how they are composed to build a Single Page Application.

---

## Objectives

- Explain React components
- Identify the differences between components and JavaScript functions
- Identify the types of components
- Explain Class Components
- Explain Function Components
- Define Component Constructor
- Define the `render()` function

---

## Hands-on Lab

In this hands-on lab, you will learn how to:

- Create a Class Component
- Create Multiple Components
- Render Components in a React Application

---

## Prerequisites

The following software is required to complete this exercise:

- Node.js
- npm
- Visual Studio Code

---

## Project Description

Create a React application named **StudentApp** and implement the following components:

### Home Component

Display the following message:

```
Welcome to the Home page of Student Management Portal
```

### About Component

Display the following message:

```
Welcome to the About page of the Student Management Portal
```

### Contact Component

Display the following message:

```
Welcome to the Contact page of the Student Management Portal
```

Render all the above components from the main `App.js` component.

---

## Project Structure

```
studentapp/
├── public/
├── src/
│   ├── Components/
│   │   ├── Home.js
│   │   ├── About.js
│   │   └── Contact.js
│   ├── App.js
│   ├── index.js
│   └── ...
├── package.json
└── README.md
```

---

## Steps Performed

1. Created a React project named **StudentApp**.
2. Created a **Components** folder inside the `src` directory.
3. Created the **Home** class component.
4. Created the **About** class component.
5. Created the **Contact** class component.
6. Imported all three components into `App.js`.
7. Rendered all components in the application.
8. Executed the application using `npm start`.
9. Verified the output in the browser.

---

## How to Run

Install the required dependencies:

```bash
npm install
```

Run the application:

```bash
npm start
```

Open the application in your browser:

```
http://localhost:3000
```

---

## Expected Output

```
Welcome to the Home page of Student Management Portal

Welcome to the About page of the Student Management Portal

Welcome to the Contact page of the Student Management Portal
```

---

## Screenshots

### Browser Output

_Add browser output screenshot here._

### Terminal Output

_Add terminal output showing successful execution (`npm start`)._

---

## Outcome

Successfully created a React application named **StudentApp** with three class components (**Home**, **About**, and **Contact**) and rendered them successfully within the main application.

---

**Author:** Nataraj EL