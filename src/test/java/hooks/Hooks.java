package hooks;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    public static WebDriver driver;

    @Before("@UI")
    public void setUp() {
        System.out.println("************ Starting Browser ************");
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    // 🔹 API Hook (NO Browser)
    @Before("@API")
    public void apiSetup() {
        System.out.println("******** Starting API Test ********");
        // No driver initialization here
    }

    @After("@UI")
    public void tearDown() {

        if (driver != null) {
            driver.quit();
            System.out.println("************* Driver closed ****************");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}






