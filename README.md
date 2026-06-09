## Java Constructor Types: Implementation & Verification
A robust, enterprise-grade Java demonstration showcasing constructor overloading patterns, object state copying, and lifecycle management within the Java Virtual Machine (JVM).
## Technical Architecture
This repository contains a clean-room implementation of constructor polymorphism in Java. It demonstrates how the JVM handles object initialization through three distinct structural patterns:

* Default Constructor: Instantiates objects with basic, uninitialized states.
* Parameterized Constructor: Enforces injection of required object dependencies at creation time.
* Copy Constructor: Implements safe object-state cloning by referencing existing instances.

## Codebase Structure

public class kent {
    String st;

    // 1. Zero-argument constructor
    kent() {
        System.out.println("This is a without parameter constructor");
    }

    // 2. Parameterized constructor 
    kent(String str) {
        st = str;
        System.out.println("Welcome " + st);
    }

    // 3. Copy constructor (Deep-copy equivalent for local state)
    kent(kent k2) {
        st = k2.st;
        System.out.println("Welcome " + st);
    }

    public void get() {
        System.out.println("This is get method in kent class");
    }

    public static void main(String[] args) {
        kent k1 = new kent();        // Invokes zero-arg constructor
        kent k2 = new kent("Tarun"); // Invokes parameterized constructor
        kent k3 = new kent(k2);      // Invokes copy constructor
        k1.get();                    // Standard method execution
    }
}

## Compilation and Execution## Prerequisites

* Java Development Kit (JDK) 8 or higher.

## Build Steps
Compile the source code using the standard Java compiler:

javac kent.java

Execute the compiled bytecode via the JVM:

java kent

## Deterministic Output Log

This is a without parameter constructor
Welcome Tarun
Welcome Tarun
This is get method in kent class

## Core Object-Oriented Design Principles Demonstrated

* Encapsulation: Object state (st) is safely assigned and manipulated strictly within the class boundary.
* Constructor Overloading: Explores compile-time polymorphism by varying constructor signatures.
* Memory Management: Demonstrates explicit stack-allocated object references pointing to independent heap-allocated memory blocks (k1, k2, k3).

