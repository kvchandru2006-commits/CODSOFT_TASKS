# Task 3 - ATM Interface

## Introduction

This project is developed as part of the Java Development Internship at CodSoft.

The ATM Interface is a Java console-based application that simulates basic ATM operations such as checking account balance, depositing money, and withdrawing money.

## Objective

The main objective of this task is to develop an ATM interface using Java classes and methods and to implement basic banking operations with proper input validation.

## Features

- Check account balance.
- Deposit money.
- Withdraw money.
- Validate the withdrawal amount.
- Check whether sufficient balance is available.
- Validate invalid transaction amounts.
- Display transaction success messages.
- Display appropriate failure messages.
- Menu-based user interface.

## Technologies Used

- Java
- Scanner class
- Classes and Objects
- Methods
- Conditional statements
- Object-Oriented Programming

## Classes Used

### ATM.java

The `ATM` class manages the ATM user interface and provides options for:

- Check Balance
- Deposit Money
- Withdraw Money
- Exit

It also handles user input and displays appropriate messages.

### BankAccount.java

The `BankAccount` class stores and manages the user's account balance.

It provides methods for:

- Getting the account balance
- Depositing money
- Withdrawing money

## How the Program Works

1. The program creates a bank account with an initial balance.
2. The ATM menu is displayed to the user.
3. The user selects an operation.
4. The selected operation is performed.
5. For deposits, the amount is added to the account balance.
6. For withdrawals, the program checks whether sufficient balance is available.
7. Invalid amounts are rejected.
8. The updated balance is displayed after successful transactions.
9. The user can continue performing transactions until selecting Exit.

## ATM Operations

| Option | Operation |
|--------|-----------|
| 1 | Check Balance |
| 2 | Deposit Money |
| 3 | Withdraw Money |
| 4 | Exit |

## Validation

The program validates:

- Deposit amount must be greater than zero.
- Withdrawal amount must be greater than zero.
- Withdrawal amount must not exceed the available balance.
- Invalid menu choices are handled appropriately.

## How to Run

Open the terminal in the project folder.

Compile both Java files:

```bash
javac ATM.java BankAccount.java