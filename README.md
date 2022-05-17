# Introduction
You are working at Acme Corp. One of the company’s pages has a drop-down list displaying the users’ preferences of cars. You have already saved some data and now you want to ensure it is saved and displays back correctly. Additionally, the page allows you to send messages. This particular test requires sending the same data in all text boxes.

# Problem Statement
Implement two methods in the SeleniumExecutor class, which should use the Selenium WebDriver to perform the below tasks on the page from the src/test/resources/__files/index.html page. 

1. In the `getDropdownValues()` method: retrieve the values of all **selected** items in the `dropdown` with the ID attribute of `dropdown-main`.
2. In the `setInput()` method: type in the text passed in the argument of the method into all `inputs` with the `container text-box` class.

# Setup
You can assume that the page is already loaded by the driver.
