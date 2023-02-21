import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LambdaTestScenario_2 {
    
    public static void main(String[] args) throws InterruptedException {
        
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishali.Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        
        
        // Open the LambdaTest Selenium Playground page
        driver.get("https://www.lambdatest.com/selenium-playground/");
        
        // Click the "Drag & Drop Sliders" button
        driver.findElement(By.linkText("Drag & Drop Sliders")).click();
        
       
        // WebElement from which slider needs to be hold 
		// WebElement slider = driver.findElement(By.xpath(""));
		 
				 
		// Find the slider element and use Actions to drag it to 95
		WebElement slider = driver.findElement(By.xpath("//input[@value='15']"));
		 action.dragAndDropBy(slider, 95, 0).build().perform();

		 // Verify that the range value shows 95
		 String rangeValue = driver.findElement(By.id("range")).getAttribute("value");
		 if (rangeValue.equals("95")) {
		 System.out.println("Slider test passed!");
		 } 
		 else 
		 {
		  System.out.println("Slider test failed.");
		 }

		 // Close the browser
			driver.quit();
		 }
	}
				