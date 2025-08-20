# ATM-Simulation-Project
This is a Java-based console application that simulates the core functionalities of an ATM (Automated Teller Machine). The project demonstrates Object-Oriented Programming (OOP) principles such as abstraction, encapsulation, interfaces, and implementation.

==== Features
--> User Authentication – Secure login using ATM Number and PIN.
--> Check Balance – Displays the available account balance.
--> Withdraw Amount – Withdraw cash with validations:
  * Prevents withdrawing more than balance.
  * Maximum withdrawal limit set to ₹10,000 per transaction.
  * Rejects invalid (negative/zero) inputs.
--> Deposit Amount – Deposit money into the account with validation.
--> Mini Statement – Shows a history of recent transactions with date & time.
--> Exit – Safely exits the system after returning the ATM card.


====Tech Stack
--> Language: Java
Core Concepts Used:
Encapsulation (balance management)
Abstraction (interface AtmOperationInterface)
Polymorphism (interface implementation)
Collections (ArrayList for storing mini statements)

How To Run
Clone this repository
Open in your IDE (e.g., Eclipse, IntelliJ, VS Code with Java).
Run MainClass.java.
Enter:
ATM Number: 12345
PIN: 123
Choose options from the ATM menu.



Sample Output
Enter Atm Number : 12345
Enter Pin : 123

===== ATM Menu =====
1. Check Available Balance
2. Withdraw Amount
3. Deposit Amount
4. View Mini Statement
5. Exit
Enter Choice : 1
Available Balance is : 0.0
