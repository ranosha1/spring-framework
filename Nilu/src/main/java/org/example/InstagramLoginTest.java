package org.example;

public class InstagramLoginTest {

    public static void main(String[] args) {
        // Set the path to the Chrome driver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Instagram
        driver.get("https://www.instagram.com");

        // Find the username and password fields and enter incorrect credentials
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        usernameField.sendKeys("incorrect_username");
        passwordField.sendKeys("incorrect_password");
        passwordField.submit();

        // Find the error message element and verify its text
        WebElement errorMessage = driver.findElement(By.xpath("//p[@class='izU2O']"));
        String expectedErrorMessage = "Sorry, your password was incorrect. Please double-check your password.";
        String actualErrorMessage = errorMessage.getText();
        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Error message is correct");
        } else {
            System.out.println("Error message is incorrect");
        }

        // Close the browser
        driver.quit();
    }
}

