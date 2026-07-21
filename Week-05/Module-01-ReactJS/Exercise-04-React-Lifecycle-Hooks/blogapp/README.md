# Exercise 04 - React Component Lifecycle Hooks

## Objective

This exercise demonstrates the implementation of React Component Lifecycle methods by fetching data from an external API, rendering it in a class component, and handling runtime errors using lifecycle hooks.

---

## Objectives

- Explain the need and benefits of the Component Lifecycle
- Identify various Lifecycle Hook methods
- List the sequence of steps involved in rendering a component

---

## Hands-on Lab

In this hands-on lab, you will learn how to:

- Implement the `componentDidMount()` lifecycle hook
- Implement the `componentDidCatch()` lifecycle hook

---

## Prerequisites

The following software is required to complete this exercise:

- Node.js
- npm
- Visual Studio Code

---

## Project Description

Create a React application named **blogapp** that displays a list of blog posts fetched from an external API.

The application includes:

- A `Post` class to represent blog post data.
- A `Posts` class component that:
  - Initializes component state.
  - Fetches blog posts using the Fetch API.
  - Loads the data during component mounting.
  - Displays the blog post title and content.
  - Handles runtime errors using `componentDidCatch()`.
- A simple CSS stylesheet to improve the appearance of the application.

---

## Project Structure

```text
blogapp/
├── public/
├── src/
│   ├── App.js
│   ├── Post.js
│   ├── Posts.js
│   ├── Posts.css
│   ├── index.js
│   └── ...
├── package.json
└── README.md
```

---

## Steps Performed

1. Created a React project named **blogapp**.
2. Created a `Post` class to represent blog data.
3. Created a `Posts` class component.
4. Initialized the component state using the constructor.
5. Implemented the `loadPosts()` method using the Fetch API.
6. Used `componentDidMount()` to load posts after the component was mounted.
7. Displayed the fetched posts using the `render()` method.
8. Implemented `componentDidCatch()` for runtime error handling.
9. Added simple CSS styling for better presentation.
10. Rendered the `Posts` component from `App.js`.
11. Executed the application using `npm start`.

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

The application fetches blog posts from:

```text
https://jsonplaceholder.typicode.com/posts
```

and displays:

- Blog Post Title
- Blog Post Content

with a simple styled user interface.

---

## Screenshots

### Browser Output

_Add browser output screenshot here._

### Terminal Output

_Add terminal output showing successful execution (`npm start`)._

---

## Outcome

Successfully implemented a React class component using lifecycle methods. The application retrieves blog posts from an external API using `componentDidMount()`, displays the fetched data, and handles runtime errors using `componentDidCatch()`.

---

**Author:** Nataraj EL