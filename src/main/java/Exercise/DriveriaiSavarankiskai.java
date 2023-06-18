package Exercise;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class DriveriaiSavarankiskai {
    public static WebDriver driver;


    public DriveriaiSavarankiskai(WebDriver driver) {

        DriveriaiSavarankiskai.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
    }
}
