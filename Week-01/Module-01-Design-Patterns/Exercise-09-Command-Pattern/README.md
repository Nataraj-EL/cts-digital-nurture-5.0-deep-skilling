# Exercise 9: Implementing the Command Pattern

## Scenario

You are developing a home automation system where commands can be issued to turn devices on or off. Use the Command Pattern to achieve this.

---

## Steps

### 1. Create a New Java Project

Create a new Java project named **CommandPatternExample**.

---

### 2. Define Command Interface

Create an interface `Command` with a method:

- `execute()`

---

### 3. Implement Concrete Commands

Create classes:

- `LightOnCommand`
- `LightOffCommand`

Both classes should implement the `Command` interface.

---

### 4. Implement Invoker Class

Create a class `RemoteControl` that:

- Holds a reference to a `Command`
- Provides a method to execute the command

---

### 5. Implement Receiver Class

Create a class `Light` with methods:

- `turnOn()`
- `turnOff()`

---

### 6. Test the Command Implementation

Create a test class to demonstrate issuing commands using the `RemoteControl`.

---

## Files in this Exercise

- **CONCEPT.md** - Explanation of Command Pattern and its real-world usage.
- **src/Command.java** - Command interface.
- **src/Light.java** - Receiver class (device).
- **src/LightOnCommand.java** - Concrete command to turn light ON.
- **src/LightOffCommand.java** - Concrete command to turn light OFF.
- **src/RemoteControl.java** - Invoker class.
- **src/CommandPatternTest.java** - Test class demonstrating execution.
- **output.png** - Screenshot of program output.