# 🧪 Selenium Cucumber TestNG Automation Framework

## 📌 Overview

This is a **real-world hybrid automation framework** built using:

- **Selenium WebDriver** – For browser automation
- **Cucumber (BDD)** – For readable feature files and step definitions
- **TestNG** – For test execution and reporting
- **Page Object Model (POM)** – For modular, reusable page classes
- **Extent Reports** – For beautiful test reports
- **Parallel Execution** – Enabled via `testng.xml`

> ✅ Use Case: Login to an e-commerce site, search for **iPhone 16**, and add it to the cart.

---

## 🔧 Project Structure

src/
│
├── features/
│ └── E2ETest.feature # BDD Scenario
│
├── stepDefinitions/
│ └── StepDefinitions.java # Cucumber step logic
│
├── hooks/
│ └── Hooks.java # Cucumber Hooks (@Before, @After)
│
├── pageObjects/
│ ├── LoginPage.java
│ ├── HomePage.java
│ └── CartPage.java
│
├── utilities/
│ ├── BaseClass.java # WebDriver setup/teardown
│ ├── ConfigReader.java # Read from config.properties
│ └── ExtentReportManager.java # Extent Report setup
│
├── runners/
│ └── TestRunner.java # Cucumber + TestNG integration
│
└── resources/
└── config.properties # URL, browser config etc.



---

## 🧪 Technologies Used

| Tool              | Purpose                                 |
|-------------------|------------------------------------------|
| Java              | Programming Language                     |
| Selenium WebDriver| Browser automation                       |
| Cucumber          | Behavior-Driven Development              |
| TestNG            | Test runner & assertions                 |
| Maven             | Dependency management                    |
| ExtentReports     | Test reporting                           |
| ChromeDriver      | Browser driver used                      |

---

## 🚀 How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/Furqanbijapur/E_CommerceWebsite.git
cd selenium-cucumber-framework

2. Install Dependencies
Make sure Maven is installed, then run:

bash
Copy code
mvn clean install
3. Run Tests (All Features)
bash
Copy code
mvn test
4. Parallel Execution
Parallel execution is configured in testng.xml. You can modify the parallel and thread-count attributes as needed.

🧪 Sample Scenario
gherkin
Copy code
Feature: E2E Shopping Cart Test

  Background:
    Given User launches the browser and navigates to the application

  @Smoke @Regression
  Scenario: Login, Search and Add to Cart
    When User enters username and password and logs in
    And User searches for "iPhone 16"
    And User adds the product to the cart
    Then Product "iPhone 16" should be visible in the cart

⚙️ Configurable Properties (config.properties)
properties
Copy code
baseURL=https://ecommerce-demo.com
browser=chrome
username=testuser
password=secure123
📄 Reports
After execution, a detailed Extent Report is generated at:

bash
Copy code
/test-output/ExtentReport/extentReport.html
🧩 Cucumber Concepts Used
✅ Hooks – @Before, @After setup and teardown

✅ Tags – @Smoke, @Regression for test selection

✅ Background – Common preconditions for scenarios

✅ Scenario Steps – Defined using Gherkin

✅ POM – Page Object Model for clean maintainable code

👥 Author
Developed by: Forqan Ahmed Bijapur

📬 Contributing
Feel free to fork this repo and submit a pull request if you'd like to contribute or improve this framework.

🛠️ Future Enhancements
Cross-browser testing

Docker + Selenium Grid

CI/CD Integration with Jenkins

Allure Reports




