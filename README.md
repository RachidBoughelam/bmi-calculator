# BMI Calculator

## Project Overview

The BMI Calculator is a Java-based application that computes an individual's Body Mass Index (BMI) using their weight and height. This tool is designed to help users assess their body weight status and is particularly useful for health professionals and individuals monitoring their weight-related health.

## Features

- **BMI Calculation:** Input weight and height to calculate BMI.
- **Health Classification:** Provides health status based on BMI value.
- **User-Friendly Interface:** Simple and intuitive design for ease of use.

## SOLID

- **Single Responsibility Principle (SRP):**
Each class has one responsibility. BMIService handles calculation logic, while UserInput manages user inputs.

- **Open/Closed Principle (OCP):**
The project is open for extension but closed for modification. New features can be added without altering existing code.

- **Liskov Substitution Principle (LSP):**
Derived classes can be substituted for their base classes without affecting functionality.

- **Interface Segregation Principle (ISP):**
Interfaces are specific to the needs of the implementing classes, ensuring classes are not forced to implement methods they do not use.

- **Dependency Inversion Principle (DIP):**
High-level modules depend on abstractions rather than concrete implementations, allowing for easier testing and modification.
