# Gaming PC Builder

A Java project that demonstrates how **Factory Method** and **Abstract Factory** design patterns can be used to build different configurations of a gaming PC.

The project separates the creation of individual PC components from the process of assembling a complete computer. Two configuration levels are supported:

- **Budget** — budget-oriented components and gaming PC configuration.
- **High-End** — high-performance components and gaming PC configuration.

## Features

- Build a gaming PC using predefined component configurations.
- Support for CPU, GPU, RAM, and Storage components.
- Use of the **Factory Method** pattern to create different gaming PC configurations.
- Use of the **Abstract Factory** pattern to create compatible families of PC components.
- Separate classes for Budget and High-End components.
- Demonstration classes showing how both patterns work.

## Design Patterns

### 1. Factory Method

The Factory Method pattern is used to create different types of gaming PCs without putting the object-creation logic directly into the client code.

Main classes:

- `GamingPC` — base product.
- `BudgetGamingPC` — budget gaming PC.
- `HighEndGamingPC` — high-end gaming PC.
- `GamingPCFactory` — factory abstraction.
- `BudgetPCFactory` — creates budget PCs.
- `HighEndPCFactory` — creates high-end PCs.
- `GamingPCClient` — demonstrates factory usage.

The client can choose a factory and receive the required gaming PC without manually creating the concrete PC class.

### 2. Abstract Factory

The Abstract Factory pattern is used to create a **family of related PC components**.

Main component interfaces:

- `CPU`
- `GPU`
- `RAM`
- `Storage`

Factories:

- `GamingPCComponentFactory`
- `BudgetComponentFactory`
- `HighEndComponentFactory`

Concrete component implementations include:

- `BudgetCPU`
- `BudgetGPU`
- `BudgetRAM`
- `BudgetStorage`
- `HighEndCPU`
- `HighEndGPU`
- `HighEndRAM`
- `HighEndStorage`

`GamingPCAssembler` uses a component factory to create and assemble a complete PC from compatible components.

## Project Structure

```text
GamingPCBuilder2/
├── src/
│   └── main/
│       └── java/
│           ├── Main.java
│           │
│           ├── factory_method/
│           │   ├── GamingPC.java
│           │   ├── GamingPCFactory.java
│           │   ├── BudgetGamingPC.java
│           │   ├── HighEndGamingPC.java
│           │   ├── BudgetPCFactory.java
│           │   ├── HighEndPCFactory.java
│           │   └── GamingPCClient.java
│           │
│           └── abstract_factory/
│               ├── CPU.java
│               ├── GPU.java
│               ├── RAM.java
│               ├── Storage.java
│               ├── GamingPCComponentFactory.java
│               ├── BudgetComponentFactory.java
│               ├── HighEndComponentFactory.java
│               ├── BudgetCPU.java
│               ├── BudgetGPU.java
│               ├── BudgetRAM.java
│               ├── BudgetStorage.java
│               ├── HighEndCPU.java
│               ├── HighEndGPU.java
│               ├── HighEndRAM.java
│               ├── HighEndStorage.java
│               ├── GamingPCAssembler.java
│               ├── GamingPCClient.java
│               └── Main.java
│
└── README.md
```

## Technologies

- **Java**
- Object-Oriented Programming
- Factory Method Design Pattern
- Abstract Factory Design Pattern
- IntelliJ IDEA (project configuration is included)

## Requirements

- Java JDK 8 or newer
- IntelliJ IDEA or another Java IDE
- Java compiler available in the system `PATH`

Check your Java version:

```bash
java -version
javac -version
```

## How to Run

### Using IntelliJ IDEA

1. Open the `GamingPCBuilder2` project in IntelliJ IDEA.
2. Make sure a JDK is configured.
3. Open one of the demonstration `Main.java` files.
4. Click **Run**.

The project contains examples for both design patterns.

### Using the Terminal

From the project root, compile the source files:

```bash
javac -d out src/main/java/*.java src/main/java/factory_method/*.java src/main/java/abstract_factory/*.java
```

Then run the required `Main` class.

For the Abstract Factory example:

```bash
java -cp out abstract_factory.Main
```

For the root example:

```bash
java -cp out Main
```

> If your IDE uses a different output directory or the project configuration is different, run the corresponding `Main` class directly from the IDE.

## Example Workflow

### Factory Method

The general workflow is:

```text
Client
  ↓
GamingPCFactory
  ↓
BudgetPCFactory / HighEndPCFactory
  ↓
BudgetGamingPC / HighEndGamingPC
```

The factory decides which concrete gaming PC should be created.

### Abstract Factory

The general workflow is:

```text
Client
  ↓
GamingPCComponentFactory
  ↓
BudgetComponentFactory / HighEndComponentFactory
  ↓
CPU + GPU + RAM + Storage
  ↓
GamingPCAssembler
  ↓
Complete Gaming PC
```

This allows the application to switch between component families without changing the assembly logic.

## Why These Patterns Are Used

Using these patterns makes the project easier to extend and maintain.

For example, a new configuration such as **Mid-Range** can be added by creating:

- a new gaming PC class and factory for Factory Method;
- a new component factory and corresponding CPU/GPU/RAM/Storage classes for Abstract Factory.

The existing client and assembly logic can remain mostly unchanged.

## Learning Objectives

This project demonstrates:

- Encapsulation and abstraction.
- Interfaces and implementations.
- Polymorphism.
- Separation of object creation from object usage.
- Factory Method.
- Abstract Factory.
- Composition of related objects.
- Extensibility of object-oriented applications.

