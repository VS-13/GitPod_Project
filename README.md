LambdaTest Scenario 1 This is a simple Java program that demonstrates how to automate browser testing using Selenium WebDriver. It navigates to the LambdaTest Selenium Playground page, clicks the "Simple Form Demo" link, enters a message into a text box, clicks a button, and validates that the same text message is displayed in the right-hand panel.

Requirements To run this program, you need to have the following:

1.Java Development Kit (JDK) 2.Selenium WebDriver Java bindings 3.ChromeDriver

Libraries Used The following libraries are used in this program:

1.org.openqa.selenium.By: This package provides various ways of finding web elements by their properties like name, id, class, xpath etc.

2.org.openqa.selenium.WebDriver: This package provides the WebDriver interface which is implemented by different browser-specific driver classes. It provides methods for browser interactions like opening a browser, navigating to a URL, closing a browser etc.

3.org.openqa.selenium.WebElement: This package provides the WebElement interface which represents an HTML element on a web page. It provides methods for performing actions on web elements like clicking, typing etc.

4.org.openqa.selenium.chrome.ChromeDriver: This package provides the ChromeDriver class which is used to interact with the Google Chrome browser.

Usage

Clone the repository to your local machine.
Make sure that the ChromeDriver path is set correctly in the System.setProperty method. You may need to change the path to the ChromeDriver executable on your system.
Compile and run the LambdaTestScenario_1 class.
The program will open a Chrome browser window and navigate to the LambdaTest Selenium Playground page.
It will then perform the steps described above and display whether the test was successful or not.
The browser window will be automatically closed when the test is complete.
Code Explanation Let's go through the code step by step and explain what each line does:

This below lines imports the necessary classes from the Selenium libraries. import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import org.openqa.selenium.chrome.ChromeDriver;

This line sets the system property to the path of the ChromeDriver executable. The setProperty method is used to set a system property before starting the ChromeDriver. This is necessary to specify the location of the ChromeDriver executable on the local machine. System.setProperty("webdriver.chrome.driver", "C:\Users\Vaishali.Singh\Downloads\chromedriver_win32\chromedriver.exe");

This line creates a new instance of the ChromeDriver class. This is required to launch the Chrome browser and automate browser interactions. WebDriver driver = new ChromeDriver();

This line navigates to the Selenium Playground page on the LambdaTest website. driver.get("https://www.lambdatest.com/selenium-playground");

These two lines locate the "Simple Form Demo" link on the page and click on it to navigate to the form demo page. WebElement simpleFormDemoLink = driver.findElement(By.linkText("Simple Form Demo")); simpleFormDemoLink.click();

These lines validate that the URL of the current page contains the string "simple-form-demo". This is done to ensure that the correct page has been loaded. String currentUrl = driver.getCurrentUrl(); if (currentUrl.contains("simple-form-demo")) { System.out.println("URL contains 'simple-form-demo'"); } else { System.out.println("URL does not contain 'simple-form-demo'"); }

These lines enter the message "Hello there!" into the "Enter Message" text box on the page. This is done to demonstrate how to interact with web page elements using Selenium. String message = "Welcome to LambdaTest"; WebElement enterMessageTextBox = driver.findElement(By.id("user-message")); enterMessageTextBox.sendKeys("Hello there!");

These lines locate the "Get Checked Value" button on the page and click on it. This is done to demonstrate how to click on a button using Selenium. WebElement getCheckedValueButton = driver.findElement(By.id("showInput")); getCheckedValueButton.click();

These lines locate the "Your Message:" section on the page and retrieve the displayed message. It then compares the displayed message with the message that was entered earlier to validate that they match. WebElement yourMessageSection = driver.findElement(By.className("mt-20")); String displayedMessage = yourMessageSection.getText(); if (displayedMessage.equals(enterMessageTextBox)) { System.out.println("Displayed message matches entered message"); } else { System.out.println("Displayed message does not match entered message"); }

This line closes the browser window after the test is complete. It is important to close the browser window to free up system resources and prevent memory leaks. driver.quit();

LambdaTestScenario_2 This is a simple Java program using Selenium Webdriver that performs the following steps:

1.Opens the LambdaTest Selenium Playground page 2.Clicks the "Drag & Drop Sliders" button 3.Drags a slider to a particular position 4.Verifies that the slider value is as expected 5.Closes the browser

Requirements To run this program, you need to have the following:

1.Java Development Kit (JDK) 2.Selenium WebDriver Java bindings 3.ChromeDriver

Libraries used 1.org.openqa.selenium.By: This package provides various ways of finding web elements by their properties like name, id, class, xpath etc.

2.org.openqa.selenium.WebDriver: This package provides the WebDriver interface which is implemented by different browser-specific driver classes. It provides methods for browser interactions like opening a browser, navigating to a URL, closing a browser etc.

3.org.openqa.selenium.WebElement: This package provides the WebElement interface which represents an HTML element on a web page. It provides methods for performing actions on web elements like clicking, typing etc.

4.org.openqa.selenium.chrome.ChromeDriver: This package provides the ChromeDriver class which is used to interact with the Google Chrome browser.

Steps Step 1: Setting the path of the ChromeDriver executable System.setProperty("webdriver.chrome.driver", "C:\Users\Vaishali.Singh\Downloads\chromedriver_win32\chromedriver.exe"); This line of code sets the system property to the path where the ChromeDriver executable is stored.

Step 2: Creating an instance of ChromeDriver WebDriver driver = new ChromeDriver(); This line of code creates an instance of the ChromeDriver class.

Step 3: Creating an instance of Actions class Actions action = new Actions(driver); This line of code creates an instance of the Actions class, which is used to perform advanced user interactions like dragging and dropping.

Step 4: Navigating to the LambdaTest Selenium Playground page driver.get("https://www.lambdatest.com/selenium-playground/"); This line of code opens the LambdaTest Selenium Playground page.

Step 5: Clicking the "Drag & Drop Sliders" button driver.findElement(By.linkText("Drag & Drop Sliders")).click(); This line of code clicks on the "Drag & Drop Sliders" button.

Step 6: Dragging the slider to a particular position WebElement slider = driver.findElement(By.xpath("//input[@value='15']")); action.dragAndDropBy(slider, 95, 0).build().perform(); These lines of code locate the slider element and use the dragAndDropBy method of the Actions class to drag the slider to a particular position.

Step 7: Verifying the slider value String rangeValue = driver.findElement(By.id("range")).getAttribute("value"); if (rangeValue.equals("95")) { System.out.println("Slider test passed!"); } else { System.out.println("Slider test failed."); } These lines of code verify that the value of the slider is as expected.

Step 8: Closing the browser driver.quit(); This line of code closes the browser.

**LambdaTestScenario_3

This Java program is a test scenario for LambdaTest Selenium Playground using Selenium WebDriver. The program interacts with the webpage elements, fills in the form fields and submits the form. It checks whether the error and success messages are displayed correctly.

Libraries used:

org.openqa.selenium.By: It provides mechanisms to locate elements on a web page.
org.openqa.selenium.WebDriver: It is the interface for the WebDriver API and provides a set of methods to control a web browser.
org.openqa.selenium.WebElement: It represents an HTML element on a web page.
org.openqa.selenium.support.ui.Select: It provides methods to handle dropdown menus.
Steps of the code: Set the path to the chromedriver executable. System.setProperty("webdriver.chrome.driver", "C:\Users\Vaishali.Singh\Downloads\chromedriver_win32\chromedriver.exe")

Launch the Chrome browser and navigate to the LambdaTest Selenium Playground. WebDriver driver = new ChromeDriver(); driver.get("https://www.lambdatest.com/selenium-playground/");

Click the "Input Form Submit" link under "Input Forms". driver.findElement(By.linkText("Input Form Submit")).click();

Click the "Submit" button without filling in any information in the form. driver.findElement(By.xpath("//button[.='Submit']")).click();

Assert that the "Please fill out the field" error message is displayed. WebElement submit = driver.findElement(By.id("name")); if (submit.getAttribute("name").equals("Please fill out this field")) {...}

Fill in the form fields. driver.findElement(By.name("name")).sendKeys("John"); driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abcd@gmail.com"); driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567890"); driver.findElement(By.id("company")).sendKeys("ABC"); driver.findElement(By.name("website")).sendKeys("www.abc.com"); Select drpCountry = new Select(driver.findElement(By.name("country"))); drpCountry.selectByVisibleText("India"); driver.findElement(By.name("city")).sendKeys("Anytown"); driver.findElement(By.id("inputAddress1")).sendKeys("42 Street"); driver.findElement(By.id("inputAddress2")).sendKeys("Cox Town"); driver.findElement(By.id("inputState")).sendKeys("Delhi"); driver.findElement(By.id("inputZip")).sendKeys("110066");

Click the "Submit" button again. driver.findElement(By.xpath("//button[.='Submit']")).click();

Verify that the success message is displayed. WebElement successText = driver.findElement(By.xpath("//p[@class='success-msg hidden']")); if (successText.getText().equals("Thanks for contacting us, we will get back to you shortly.")) {...}

Close the browser. driver.quit();
 
