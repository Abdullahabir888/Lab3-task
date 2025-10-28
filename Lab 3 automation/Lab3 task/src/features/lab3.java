package features;

import java.awt.*;
import java.io.IOException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab3 {
    public static void main(String[] args)  {
        // Set the path to your Gecko WebDriver executable
        System.setProperty("Webdriver.chrome.driver", "D:\\resourse\\chrome-win64");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Restaurant360 login page
        driver.get("http://localhost:5173/login");
        driver.manage().window().maximize();

        // Locate the email/username input field and enter your credential
        WebElement emailField = fluentWait(driver, By.id("email"));
        emailField.sendKeys("abdullahabir888gmail.com");

        // Locate the password input field and enter your password
        WebElement passwordField = fluentWait(driver, By.id("login-form_password"));
        passwordField.sendKeys("password");

        // Login
        WebElement.sendKeys(Keys.ENTER);

        // Turn on/off dark mode and light mode
        WebElement settings = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/a[2]/span"));
        settings.click();

        // Turn on/off dark mode and light mode
        WebElement modeSwitch = fluentWait(driver, By.xpath("/html/body/div/div/main/div/div[2]/div[1]/div/div[1]/button"));
        modeSwitch.click();

    }
 driver.quit();

}



