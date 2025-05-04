🛒 Real-World E-Commerce Automation Framework

📌 Overview

This project is a real-world hybrid automation framework designed to automate end-to-end testing for an e-commerce website. The primary use case involves logging into the application, searching for a product (e.g., "iPhone 16"), and adding it to the cart.

The framework incorporates best practices like the Page Object Model (POM) for modular, reusable code and integrates powerful tools like Selenium WebDriver, Cucumber (BDD), TestNG, and Extent Reports for execution and reporting.

🔧 Project Structure

Here's the directory structure of the project:

![image](https://github.com/user-attachments/assets/925a7569-99ea-46a1-a594-651c927e9bfc)

🛠️ Tools and Technologies Used

Tool	Purpose

Java	Programming Language

Selenium	Browser Automation

Cucumber (BDD)	Readable feature files and step definitions

TestNG	Test execution and control

Maven	Dependency Management

Extent Reports	: Detailed test reporting

ChromeDriver	Browser driver

🧪 Cucumber Concepts Used

This project leverages several Cucumber concepts for structured and efficient test automation:


Feature Files: Written in Gherkin syntax to describe test scenarios.

Step Definitions: Java methods that implement steps from the feature files.

Hooks:

@Before for setup (e.g., browser initialization).

@After for teardown (e.g., closing the browser).

Tags:

@Smoke and @Regression to organize and filter tests.

Background: Define common preconditions for all scenarios.

Scenario Outline: For parameterized test scenarios.

Data Tables: To pass multiple data entries into steps.

Example Ecommerce.feature file:


Gherkin

Feature: E2E Shopping Cart Test


  Background:
  
    Given User launches the browser and navigates to the application
    

  @Smoke @Regression
  
  Scenario: Login, Search and Add to Cart
  
    When User enters username and password and logs in
    
    And User searches for "iPhone 16"
    
    And User adds the product to the cart
    
    Then the Product "iPhone 16" should be visible in the cart
    
🧪 TestNG Annotations Used

TestNG annotations provide fine-grained control over test execution:


@BeforeSuite: Initialise global resources (e.g., test data).

@AfterSuite: Cleanup global resources.

@BeforeTest: Pre-test setup (e.g., database connections).

@AfterTest: Cleanup after test execution.

@BeforeClass: Setup specific to a class of tests.

@AfterClass: Cleanup specific to a class of tests.

@BeforeMethod: Setup before each test method.

@AfterMethod: Cleanup after each test method.

@Test: Mark a method as a test case.

Example TestRunner.java file:


Java

@Test

public void testLoginAndSearch() {

    // Test logic for login and search
    
}

🚀 How to Run the Project

1. Clone the Repository
   
bash

git clone https://github.com/Furqanbijapur/E_CommerceWebsite.git

cd MyAutomationProject

4. Install Dependencies
   
Ensure Maven is installed, then run:


bash

mvn clean install

3. Run Tests
   
bash

mvn test

5. Parallel Execution
   
Parallel execution is configured in testng.xml. You can modify the parallel and thread count 
attributes as needed.


📄 Reports

After execution, a detailed Extent Report is generated at:


Code

/test-output/ExtentReport/extentReport.html

👥 Contributing

Contributions are welcome! You can fix this repository, create a new branch, and submit a pull request.


🛠️ Future Enhancements

Cross-browser testing

Docker + Selenium Grid support

CI/CD Integration with Jenkins

Integration of Allure Reports for advanced reporting

👨‍💻 Author

Developed by: Furqan Ahmed Bijapur


If you have any questions, feel free to reach me via GitHub or email.


