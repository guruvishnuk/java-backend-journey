# OOP (Object Oriented Programming)

## What is OOP?

OOP is a programming paradigm based on objects and classes.

It helps in:
- Code reusability
- Modularity
- Maintainability
- Real-world modeling

---

## Class

A class is a blueprint for creating objects.

Example:
A "Student" class defines:
- properties (name, age)
- behavior (display())

Syntax:
class Student {
    String name;
    int age;
}

---

## Object

An object is an instance of a class.

Example:
Student s1 = new Student();

Here:
- Student → class
- s1 → object
- new → keyword to allocate memory

---

## Memory Concept (VERY IMPORTANT)

When object is created:
- Memory is allocated in HEAP
- Reference variable (s1) is stored in STACK

---

## Encapsulation

Encapsulation = wrapping data + methods into one unit

Main goal:
👉 Data hiding

Why needed?
- Prevent unauthorized access
- Improve security
- Control modification

---

## Access Modifiers

- private → only inside class
- public → accessible everywhere
- protected → same package + subclass
- default → same package

---

## Getters and Setters

Used to access private variables safely.

Example:
public void setName(String name) {
    this.name = name;
}