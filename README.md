Project Name: #{mortgageCalculatorAutomation}

Programming Language: Java 11
IDE: IntelliJ IDEA
Build Tool: Maven
Framework: Selenium WebDriver with Junit
Design Pattern: Page Object Model, Singleton Design Pattern for WebDriver
Testing Strategy: BDD (Behavior Driven Development) Testing and DDT (Data Driven Testing)
Environment: Chrome

The Framework is used to test the functionality of the input box "Interest Rate".
Application under test: https://www.zillow.com/mortgage-calculator/

How to run the test: 
Option 1:Run the test from the CukesRunner class, by providing the path to the specific test file by using the "@wip" 
Tag in the feature file.
Option 2:Run the test from the Feature file and the test will run automatically


Contributing:
Any contributions you make are greatly appreciated.
If you have a suggestion that would make this better, please fork the repo and create a pull request.

Fork the Project:
Create your Feature Branch (git checkout -b feature/AmazingFeature)
Commit your Changes (git commit -m 'Add some AmazingFeature')
Push to the Branch (git push origin feature/AmazingFeature)
Open a Pull Request (git pull origin feature/AmazingFeature)

Advice/Troubleshooting:
For the future maintaining and developing of the Framework, please follow the steps below:
-Maintain the code in the correct order
-Continue developing Page Object Model by creating new Page Object classes for each new page of the tested feature 
and adding them to the pages package
-For avoiding hard coding add new useful methods to the BrowserUtils class from utilities package
-Use target folder whenever you need a report of the run or screenshot of failed tests 
Timeouts or waits may need to be increased

Author:
Victoria Drumea - victory.drumea@gmail.com

Project Link: https://github.com/vdrumeaa/mortgageCalculatorAutomation.git


Resources:
Junit Documentation
Java Documentation
Selenium Documentation
Sack Overflow: A great resource to search for issues not explicitly covered by documentation