# Exercise 03 - Score Calculator App

## Objective

This exercise demonstrates the creation of a React Function Component, passing data through props, applying CSS styling to components, and rendering the component in a React application.

---

## Objectives

- Explain React Components
- Identify the differences between Components and JavaScript Functions
- Identify the types of Components
- Explain Function Components
- Define Component Constructor
- Define the `render()` function

---

## Hands-on Lab

In this hands-on lab, you will learn how to:

- Create a Function Component
- Apply styles to Components
- Render a Component

---

## Prerequisites

The following software is required to complete this exercise:

- Node.js
- npm
- Visual Studio Code

---

## Project Description

Create a React application named **scorecalculatorapp** and implement a Function Component named **CalculateScore** that accepts the following properties:

- Name
- School
- Total
- Goal

The component calculates the student's average score and displays the student details along with the calculated score. CSS styling is applied using an external stylesheet.

---

## Project Structure

```text
scorecalculatorapp/
├── public/
├── src/
│   ├── Components/
│   │   └── CalculateScore.js
│   ├── Stylesheets/
│   │   └── mystyle.css
│   ├── App.js
│   ├── index.js
│   └── ...
├── package.json
└── README.md
```

---

## Steps Performed

1. Created a React project named **scorecalculatorapp**.
2. Created a **CalculateScore** Function Component.
3. Created a **Stylesheets** folder and added `mystyle.css`.
4. Applied CSS styling to the component.
5. Imported and rendered the component in `App.js`.
6. Passed student details as props.
7. Executed the application using `npm start`.
8. Verified the output in the browser.

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

```text
http://localhost:3000
```

---

## Expected Output

The application displays:

- Student Name
- School Name
- Total Marks
- Calculated Score

---

## Screenshots

### Browser Output

_Add browser output screenshot here._

### Terminal Output

_Add terminal output showing successful execution (`npm start`)._

---

## Outcome

Successfully created a React application named **scorecalculatorapp** using a Function Component. The application accepts student details as props, calculates the score, applies CSS styling, and renders the information in the browser.

---

**Author:** Nataraj EL