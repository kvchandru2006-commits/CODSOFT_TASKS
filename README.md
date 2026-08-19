# CODSOFT Java Development Internship

This repository contains the tasks completed as part of the Java Development Internship at CodSoft.

## Internship Tasks

I have completed the following three tasks:

1. Number Game
2. Student Grade Calculator
3. ATM Interface

---

## Task 1 - Number Game

### Description

The Number Game is a Java-based console application where the computer generates a random number between 1 and 100.

The user has to guess the generated number within a limited number of attempts.

The program provides feedback after each guess:

- Too High
- Too Low
- Correct

The application also includes multiple rounds and keeps track of the user's score.

### Features

- Generates a random number between 1 and 100
- Accepts user guesses
- Provides Too High / Too Low feedback
- Limits the number of attempts
- Supports multiple rounds
- Calculates and displays the score

### Technologies Used

- Java
- Scanner
- Random

### File

`Task1_NumberGame/NumberGame.java`

---

## Task 2 - Student Grade Calculator

### Description

The Student Grade Calculator is a Java console application that accepts marks obtained by a student in different subjects.

The program calculates the total marks, average percentage, and assigns a grade based on the average percentage.

### Features

- Accepts marks for multiple subjects
- Validates marks between 0 and 100
- Calculates total marks
- Calculates average percentage
- Assigns a grade
- Displays the final result

### Grade System

| Average Percentage | Grade |
|--------------------|-------|
| 90 - 100 | A |
| 80 - 89 | B |
| 70 - 79 | C |
| 60 - 69 | D |
| 50 - 59 | E |
| Below 50 | F |

### Technologies Used

- Java
- Scanner

### File

`Task2_StudentGradeCalculator/GradeCalculator.java`

---

## Task 3 - ATM Interface

### Description

The ATM Interface is a Java-based console application that simulates basic ATM operations.

The application allows the user to check their balance, deposit money, and withdraw money.

The project uses two classes:

- ATM
- BankAccount

The ATM class manages the user interface and transactions, while the BankAccount class stores and manages the account balance.

### Features

- Check account balance
- Deposit money
- Withdraw money
- Validate withdrawal amount
- Check sufficient balance
- Validate invalid amounts
- Display transaction success/failure messages
- Simple menu-based interface

### Technologies Used

- Java
- Scanner
- Object-Oriented Programming

### Files

`Task3_ATM_Interface/ATM.java`

`Task3_ATM_Interface/BankAccount.java`

---

## Repository Structure

```text
CODSOFT_TASKS
│
├── README.md
│
├── Task1_NumberGame
│ ├── NumberGame.java
│ └── Output.png
│
├── Task2_StudentGradeCalculator
│ ├── GradeCalculator.java
│ └── Output.png
│
└── Task3_ATM_Interface
    ├── ATM.java
    ├── BankAccount.java
    └── Output.png
