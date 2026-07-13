# 🚀 DemoQA Selenium Automation Framework

A complete Selenium Automation Testing Framework developed using **Java**, **Selenium WebDriver**, **TestNG**, **Maven**, and the **Page Object Model (POM)**. This project automates various modules of the DemoQA website while demonstrating industry-standard QA practices, including Data-Driven Testing, Cross-Browser Testing, and comprehensive test documentation.

---

## 📌 Project Overview

This project was developed as a Software Testing automation framework to demonstrate both **Manual Testing** and **Automation Testing** concepts.

The framework includes:

- Manual Testing Documentation
- Selenium WebDriver Automation
- Page Object Model (POM)
- TestNG Framework
- Maven Project Structure
- Data-Driven Testing using Excel
- Cross-Browser Testing
- Screenshot Capture on Test Failure

---

## 🛠 Tech Stack

- Java 21
- Selenium WebDriver 4
- TestNG
- Maven
- Apache POI (Excel Handling)
- Git & GitHub
- Eclipse IDE

---

## 📂 Project Structure

```
DemoQA-Selenium-Automation
│
├── src
│   ├── main
│   └── test
│
├── documentation
│   ├── Test Plan
│   ├── Test Scenarios
│   ├── Test Cases
│   ├── RTM
│   ├── Bug Report
│   └── Test Execution Report
│
├── screenshots
│
├── testdata
│   └── LoginData.xlsx
│
├── pom.xml
├── testng.xml
├── README.md
└── .gitignore
```

---

## ✅ Automated Modules

### Elements
- ✔ Text Box
- ✔ Radio Button
- ✔ Web Tables
- ✔ Upload & Download

### Forms
- ✔ Practice Form

### Alerts, Frame & Windows
- ✔ Frames
- ✔ Modal Dialogs

### Book Store Application
- ✔ Login
- ✔ Book Search
- ✔ Book Details

### Interactions
- ✔ Selectable

---

## ✨ Framework Features

- Page Object Model (POM)
- TestNG Test Execution
- Maven Dependency Management
- Excel Data-Driven Testing
- Screenshot Capture on Failure
- Cross-Browser Testing
- Modular Page Classes
- Reusable Utility Classes

---

## 📊 Manual Testing Deliverables

The project also includes:

- Test Plan
- Test Scenarios
- Test Cases
- Requirement Traceability Matrix (RTM)
- Bug Report
- Test Execution Report
- Performance Testing Report

---

## 🌐 Cross-Browser Testing

The framework has been executed on:

- Google Chrome
- Microsoft Edge

Some browser-specific behavior was observed during execution and documented as part of the testing process.

---

## 📸 Screenshot Capture

Failed test cases automatically capture screenshots for easier debugging and reporting.

---

## 📈 Test Data

The framework uses Excel files for Data-Driven Testing through Apache POI.

Example:

```
testdata/LoginData.xlsx
```

---

## ▶ How to Run

### Clone Repository

```bash
git clone https://github.com/yourusername/DemoQA-Selenium-Automation.git
```

### Open Project

Import as a **Maven Project** into Eclipse or IntelliJ IDEA.

### Install Dependencies

```bash
mvn clean install
```

### Execute Tests

Run:

```
testng.xml
```

or execute individual TestNG test classes.

---

## 📚 Concepts Demonstrated

- Selenium WebDriver
- Page Object Model
- Maven
- TestNG
- Assertions
- Explicit Waits
- JavaScript Executor
- File Upload
- Frames
- Modal Dialogs
- Cross-Browser Testing
- Data-Driven Testing
- Screenshot Handling
- Excel Utilities
- Git & GitHub

---

## 👨‍💻 Author

**Jerry S George**

MCA Graduate | Software Test Engineer | Manual & Automation Testing Enthusiast

GitHub: https://github.com/yourusername

LinkedIn: https://linkedin.com/in/yourprofile

---

## ⭐ Future Enhancements

- Parallel Execution using TestNG
- Jenkins CI/CD Integration
- Extent Reports
- Allure Reports
- API Testing Integration (Postman/Newman)
- Docker & Selenium Grid
