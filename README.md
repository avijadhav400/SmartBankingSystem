# 🏦 Smart Banking System  
A Multithreaded Java Banking Simulation

![Java](https://img.shields.io/badge/Language-Java-orange?style=flat-square)
![Threads](https://img.shields.io/badge/Concept-Multithreading-blue?style=flat-square)


## Overview

The Smart Banking System is a Java‑based simulation of real‑world banking operations supporting Savings and Current accounts.  
It demonstrates the use of Object‑Oriented Programming, interfaces, inheritance, and thread synchronization to handle concurrent transactions safely and efficiently.

## 🚀 Features

- Thread‑safe deposit and withdrawal operations  
- Minimum balance enforcement for savings accounts  
- Overdraft facility for current accounts  
- Multithreading simulation for realistic concurrent transactions  
- Clean and modular Java codebase adhering to OOP principles  

## 🧠 Concepts Demonstrated

- Interfaces and abstract classes  
- Java threads and synchronization  
- Conditional logic for financial transactions  
- Encapsulation in real‑world object modeling  

## 🏗️ Project Structure

com.smart_banking_system/  
│  
├── Account.java # Defines basic account operations  
├── BankAccount.java # Abstract base class for different bank accounts  
├── SavingAccount.java # Implements savings account with min balance restriction  
├── CurrentAccount.java # Implements current account with overdraft feature  
├── TransactionThread.java # Handles concurrent deposits/withdrawals using Thread  
└── Main.java # Entry point that runs transaction simulations  



## 🧩 How It Works

1. The `Main` class creates a `BankAccount` instance (e.g., `SavingAccount`).  
2. Multiple `TransactionThread` instances perform deposit and withdrawal actions.  
3. Threads operate concurrently, invoking synchronized methods to keep balances accurate.  

## 🖥️ Example Output

Thread-1 withdrawn 55000  
Available balance: 45000  
Thread-2 deposited 10000  
Total Balance: 55000  
Thread-3 failed to withdraw 100000 (Insufficient balance: 55000)  


## ⚙️ How to Run

Clone the repository and execute the main class:

git clone https://github.com/<your-username>/SmartBankingSystem.git  
cd SmartBankingSystem  
javac com/smart_banking_system/*.java  
java com.smart_banking_system.Main  


Make sure your system has **JDK 17+** installed.

## 🧑‍💻 Author

**Avinash S.**  
Java Developer | Full‑Stack Enthusiast  

📬 [LinkedIn](https://www.linkedin.com/) • [GitHub](https://github.com/your-username)

