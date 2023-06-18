package Exercise.Test;

import Exercise.DriveriaiSavarankiskai;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static Exercise.DriveriaiSavarankiskai.driver;

public class TestSavarankiskai {
    public TestSavarankiskai() {
        super();
    }

    @BeforeClass
    public static void setUpChrome() {
        System.setProperty("webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        DriveriaiSavarankiskai.driver = new ChromeDriver(options);
        DriveriaiSavarankiskai.driver.manage().window().maximize();
    }
    @Test
    public void registration(){
        Registration.registration();
    }
    @AfterClass
    public static void tearDown() {

        //driver.quit();
    }
}
