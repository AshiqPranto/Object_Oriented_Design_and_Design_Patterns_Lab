# Console App: Facade Design Pattern Demo

## Overview

This console application demonstrates the use of the Facade design pattern to simplify interactions with a banking subsystem. The primary components of the application include:

- **IAccount Interface**: An interface defining the methods for all types of bank accounts (e.g., Saving, Chequing, Investment). All account classes implement this interface.

- **BankService Facade Class**: A Facade class named `BankService` that provides a simplified and unified interface for clients (the `Customer` class) to interact with the banking subsystem. It encapsulates the complexities of creating, depositing, withdrawing, and transferring money.

- **Customer Class**: The `Customer` class interacts with the banking subsystem through the `BankService` facade. It showcases how clients can easily perform banking operations without needing to understand the underlying details of individual account types.

## Components

### IAccount Interface

- **Purpose**: This interface defines the abstract methods that all types of bank accounts must implement. It serves as a contract for account classes to ensure consistent behavior.

- **Methods**:
  - `createAccount()`: Creates a new bank account.
  - `deposit()`: Deposits a specified amount into the account.
  - `withdraw()`: Withdraws a specified amount from the account.
  - `transfer()`: Transfers funds from one account to another.

### BankService Facade Class

- **Purpose**: The `BankService` class acts as a facade to simplify client interactions with the banking subsystem. It encapsulates the complex operations required to manage bank accounts.

- **Methods**:
  - `createAccount(accountType)`: Creates a new account of the specified type (e.g., Saving, Chequing, Investment).
  - `deposit(account, amount)`: Deposits a specified amount into the given account.
  - `withdraw(account, amount)`: Withdraws a specified amount from the given account.
  - `transfer(fromAccount, toAccount, amount)`: Transfers funds from one account to another.

### Customer Class

- **Purpose**: The `Customer` class represents a bank customer who interacts with the banking subsystem using the `BankService` facade. It demonstrates how clients can perform common banking operations with ease.

- **Methods**:
  - `main()`: The main method of the application where a `Customer` interacts with the `BankService` to create accounts, deposit, withdraw, and transfer money.

## Conclusion

The Facade design pattern simplifies complex subsystem interactions by providing a unified interface. This console app showcases how the `BankService` facade allows clients to perform banking operations without worrying about the intricacies of individual account types. It promotes code simplicity, maintainability, and encapsulation of subsystem complexities.
