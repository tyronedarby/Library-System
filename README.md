# 📚 Library Management System (OOP Project)

## 👤 Author

**Tyrone Darby**

---

## 📌 Project Overview

The **Library Management System** is an Object-Oriented Programming (OOP) project designed to manage book rentals within a library environment. The system tracks users, staff members, books, rental durations, fines, and book replacement values.

This project demonstrates core OOP principles including:

* ✅ Inheritance
* ✅ Polymorphism
* ✅ Encapsulation
* ✅ File Handling
* ✅ Role-Based Access Control

The system distinguishes between two categories of staff: **Clerks** and **Managers**, each with different levels of permissions.

---

## 🏗 System Design

### 📘 Books

Each book in the system contains:

* Title
* Author
* Category
* Maximum rental period (in days)
* Daily late fee
* Replacement value
* Availability status

When a book is returned:

* The system calculates overdue fees
* If damaged or lost, replacement cost is charged

---

### 👤 Users

Library users can:

* Rent books
* Return books
* Pay fines
* Update personal information

User data is stored and managed using file storage for persistence.

---

### 👨‍💼 Staff Roles

#### 🧾 Clerk

Clerks can:

* Rent books to users
* Process book returns
* Collect fines
* Add new users
* Edit user information

#### 👨‍💻 Manager

Managers have all Clerk permissions plus:

* Add new books
* Remove damaged books
* Edit book information
* Manage book inventory

---

## 🧠 OOP Concepts Implemented

### 🔹 Inheritance

* `Staff` → Base class
* `Clerk` and `Manager` inherit from `Staff`

### 🔹 Polymorphism

* Overridden methods for role-based permissions
* Dynamic behavior based on staff type

### 🔹 Encapsulation

* Private data members
* Public getter/setter methods

### 🔹 File Handling

* Books stored in file
* Users stored in file
* Rental records stored in file
* Ensures data persistence after program exits

---

## ▶️ How to Compile and Run (java Example)

### Using java

```bash
 main.java -o library
./library
```

### Using an IDE

You may use:

* Netbeans
* Visual Studio
* eclicpse

---

## 🔄 System Workflow

1. Staff logs in (Clerk or Manager)
2. Staff selects operation from menu
3. System updates files accordingly
4. On book return:

   * System calculates overdue fine:

     ```
     Fine = (Days Late × Daily Late Fee)
     ```
   * If damaged/lost:

     ```
     Charge = Replacement Value
     ```

---

## 💰 Fine & Replacement Policy

* Every book has:

  * Maximum rental days
  * Daily late fee
  * Replacement cost

When returned:

* If returned late → Fine calculated automatically
* If damaged/lost → Replacement cost charged

---

## 🎯 Learning Objectives

This project demonstrates:

* Real-world application of OOP
* Role-based system permissions
* Data persistence using files
* Class relationships and hierarchy
* Business logic implementation
* Error handling and validation

---

## ⚠ Assumptions

* Staff authentication system implemented
* All transactions logged
* File system properly structured
* Users cannot perform administrative tasks

---

## 🚀 Possible Enhancements

* Add GUI interface
* Add database integration (MySQL)
* Add password encryption
* Add search/filter books by category
* Add reporting system
* Add book reservation system
* Add audit log for staff actions

---

## 📄 License

This project is created for academic and educational purposes.

