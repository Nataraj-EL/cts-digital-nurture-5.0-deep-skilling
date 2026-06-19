# Command Pattern - Notes

## Intro

The Command Pattern is a **Behavioral Design Pattern**.

The Command Pattern separates the object that issues a request from the object that actually performs the action.

Instead of calling methods directly, we wrap the request inside a command object.

This makes the system more flexible and extensible.

---

## Why Command Pattern is needed

In real applications, we often need to:

- Decouple sender and receiver
- Queue requests
- Log operations
- Support undo/redo functionality

Without Command Pattern, the sender directly calls the receiver, which creates tight coupling.

---

## How it works

The pattern consists of four main components:

### 1. Command Interface

Defines a common method:

- `execute()`

---

### 2. Concrete Command

Implements the command interface and defines the action.

Examples:

- `LightOnCommand`
- `LightOffCommand`

---

### 3. Receiver

The actual object that performs the work.

Example:

- `Light`

---

### 4. Invoker

Triggers the command execution.

Example:

- `RemoteControl`

---

## My understanding from this exercise

In this system:

- `RemoteControl` does not know how the light works
- It only knows which command to execute
- Each command internally controls the `Light` object

This makes the system loosely coupled and flexible.

---

## Real-world usage

Command Pattern is used in:

- Remote controls (TV, AC, Smart Home systems)
- Undo/Redo operations in editors
- Task scheduling systems
- Transaction management systems
- Queue-based processing systems

---

## Key takeaway

Command Pattern helps in:

- Decoupling request sender and receiver
- Encapsulating actions as objects
- Supporting extensibility
- Enabling undo/redo functionality

---

## Personal note

This pattern is very powerful in systems where actions need to be stored, queued, or executed dynamically.