import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaTestScenario_1 {

    public static void main(String[] args) {
        // Setting system property for Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishali.Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigating to the Selenium Playground page
        driver.get("https://www.lambdatest.com/selenium-playground");

        // Clicking the "Simple Form Demo" link
        WebElement simpleFormDemoLink = driver.findElement(By.linkText("Simple Form Demo"));
        simpleFormDemoLink.click();

        // Validating that the URL contains "simple-form-demo"
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("simple-form-demo")) {
            System.out.println("URL contains 'simple-form-demo'");
        } else {
            System.out.println("URL does not contain 'simple-form-demo'");
        }

        // Creating a variable for a string value
        String message = "Welcome to LambdaTest";

        // Entering the message in the "Enter Message" text box
        WebElement enterMessageTextBox = driver.findElement(By.id("user-message"));
        enterMessageTextBox.sendKeys("Hello there!");

        // Clicking the "Get Checked Value" button
        WebElement getCheckedValueButton = driver.findElement(By.id("showInput"));
        getCheckedValueButton.click();

        // Validating that the same text message is displayed in the right-hand panel under the "Your Message:" section
        WebElement yourMessageSection = driver.findElement(By.className("mt-20"));
        String displayedMessage = yourMessageSection.getText();
        if (displayedMessage.equals(enterMessageTextBox)) {
            System.out.println("Displayed message matches entered message");
        } else {
            System.out.println("Displayed message does not match entered message");
        }

        // Closing the browser
        driver.quit();
    }
}

