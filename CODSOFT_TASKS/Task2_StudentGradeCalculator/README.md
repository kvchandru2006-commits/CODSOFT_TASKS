# Task 2 - Student Grade Calculator

## Introduction

This project is developed as part of the Java Development Internship at CodSoft.

The Student Grade Calculator is a Java console-based application that takes the marks obtained by a student in each subject and calculates the total marks, average percentage, and corresponding grade.

## Objective

The main objective of this task is to develop a Java program that calculates a student's total marks, average percentage, and grade based on the marks obtained in different subjects.

## Features

- Accepts marks obtained in each subject.
- Accepts marks out of 100 for each subject.
- Calculates total marks.
- Calculates average percentage.
- Assigns a grade based on the average percentage.
- Validates marks between 0 and 100.
- Displays the final result.

## Technologies Used

- Java
- Scanner class
- Conditional statements
- Loops

## How the Program Works

1. The program asks the user to enter the number of subjects.
2. The user enters the marks obtained in each subject.
3. The program calculates the total marks.
4. The average percentage is calculated by dividing the total marks by the number of subjects.
5. A grade is assigned based on the average percentage.
6. The program displays the total marks, average percentage, and grade.

## Grade Calculation

| Average Percentage | Grade |
|---------------------|-------|
| 90 - 100            | A     |
| 80 - 89             | B     |
| 70 - 79             | C     |
| 60 - 69             | D     |
| 50 - 59             | E     |
| Below 50            | F     |

## How to Run

Open the terminal in the project folder and compile the program:

```bash
javac GradeCalculator.java