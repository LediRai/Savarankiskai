package Exercise.Test;
import Exercise.DriveriaiSavarankiskai;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Registration extends DriveriaiSavarankiskai {
    public Registration(WebDriver driver){
        super(driver);
    }
    private static final By signupLogin = By.cssSelector("a[href='/login']");
    private static final By nameInput = By.cssSelector("input[placeholder='Name']");
    private static final By emailInput = By.cssSelector("input[data-qa='signup-email']");
    private static final By signupButton = By.cssSelector("input[data-qa='signup-button']");

    public static void registration() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement signupLink = wait.until(ExpectedConditions.elementToBeClickable(signupLogin));
            signupLink.click();

            WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(nameInput));
            nameField.sendKeys("LediRai");

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
            emailField.sendKeys("pumabera@gmail.com");

            WebElement signupBtn = wait.until(ExpectedConditions.elementToBeClickable(signupButton));
            signupBtn.click();
        } catch (Exception e) {
            System.out.println("Registracija nebuvo sėkminga: " + e.getMessage());
        }

}
}
