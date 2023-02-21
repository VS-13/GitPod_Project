import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;


public class LambdaTestScenario_3 {
	public static void main(String[] args) {
        // Set the path to the chromedriver executable
    	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishali.Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Launch the Chrome browser and navigate to the LambdaTest Selenium Playground
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");

        // Click the "Input Form Submit" link under "Input Forms"
        driver.findElement(By.linkText("Input Form Submit")).click();

        // Click the "Submit" button without filling in any information in the form
       
		driver.findElement(By.xpath("//button[.='Submit']")).click();

        // Assert that the "Please fill out the field" error message is displayed
          
           WebElement submit = driver.findElement(By.id("name"));
		   submit.getAttribute("name");
		if (submit.getAttribute("name").equals("Please fill out this field")) {
            System.out.println("Error message is displayed correctly.");
        } else {
            System.out.println("Error message is not displayed correctly.");
        }

        // Fill in the form fields
        driver.findElement(By.name("name")).sendKeys("John");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abcd@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567890");
        driver.findElement(By.id("company")).sendKeys("ABC");
        driver.findElement(By.name("website")).sendKeys("www.abc.com");
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("India");
        driver.findElement(By.name("city")).sendKeys("Anytown");
        driver.findElement(By.id("inputAddress1")).sendKeys("42 Street");
        driver.findElement(By.id("inputAddress2")).sendKeys("Cox Town");
        driver.findElement(By.id("inputState")).sendKeys("Delhi");
        driver.findElement(By.id("inputZip")).sendKeys("110066");
        	
        // Click the "Submit" button again
    
        driver.findElement(By.xpath("//button[.='Submit']")).click();

        // Verify that the success message is displayed
        WebElement successText = driver.findElement(By.xpath("//p[@class='success-msg hidden']"));
        
        if (successText.getText().equals("Thanks for contacting us, we will get back to you shortly.")) {
            System.out.println("Form submission test passed!");
        } else {
            System.out.println("Form submission test failed.");
        }

        // Close the browser
        driver.quit();
    }
}
	
