# Task 1 - Number Game

## Introduction

This project is developed as part of the Java Development Internship at CodSoft.

The Number Game is a Java console-based application where the computer generates a random number within a specified range, and the user tries to guess the generated number.

## Objective

The main objective of this task is to develop a simple number guessing game using Java programming concepts.

## Features

- Generates a random number between 1 and 100.
- Allows the user to enter their guess.
- Compares the user's guess with the generated number.
- Displays whether the guess is too high or too low.
- Displays a success message when the correct number is guessed.
- Limits the number of attempts.
- Allows the user to play multiple rounds.
- Calculates and displays the user's score.

## Technologies Used

- Java
- Scanner class
- Random class
- Conditional statements
- Loops

## How the Program Works

1. The program generates a random number between 1 and 100.
2. The user is asked to enter a guess.
3. The program compares the guess with the generated number.
4. If the guess is lower than the generated number, it displays "Too Low".
5. If the guess is higher than the generated number, it displays "Too High".
6. If the guess is correct, the user wins the round.
7. The program limits the number of attempts.
8. The user can choose to play another round.
9. The final score and rounds won are displayed.

## How to Run

Open the terminal in the project folder and run:

```bash
javac NumberGame.java