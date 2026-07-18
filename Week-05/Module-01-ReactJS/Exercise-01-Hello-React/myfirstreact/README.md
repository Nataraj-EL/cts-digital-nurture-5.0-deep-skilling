# Exercise 01 - Hello React

## Objective

The objective of this exercise is to set up a React development environment, create a basic React application, and understand the fundamentals of building a Single Page Application (SPA) using React.

---

## Learning Outcomes

- Understand the concept of Single Page Applications (SPA)
- Learn the basics of React
- Set up a React development environment
- Create a React application using Create React App
- Modify and render React components
- Run a React application locally

---

## Tech Stack

- React
- JavaScript (ES6)
- HTML5
- CSS3
- Node.js
- npm

---

## Project Structure

```
myfirstreact/
├── public/
├── src/
│   ├── App.js
│   ├── index.js
│   └── ...
├── package.json
└── README.md
```

---

## Implementation

The application displays a simple heading on the home page.

**App.js**

```jsx
function App() {
  return (
    <div>
      <h1>Welcome to the first session of React</h1>
    </div>
  );
}

export default App;
```

---

## How to Run

### 1. Install Dependencies

```bash
npm install
```

### 2. Start the Development Server

```bash
npm start
```

### 3. Open the Application

```
http://localhost:3000
```

---

## Expected Output

```
Welcome to the first session of React
```

---

## Screenshots

### Browser Output

_Add browser screenshot here._

### Terminal Output

_Add terminal screenshot showing `npm start` execution._

---

## Concepts Covered

- Single Page Applications (SPA)
- React
- Components
- JSX
- ReactDOM
- Development Server
- npm
- Create React App

---

## Outcome

Successfully created and executed the first React application using Create React App. The application renders a heading in the browser, confirming that the React development environment has been configured correctly.

---

**Author:** Nataraj EL