package URL;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox {


    WebDriver driver;
    String URL = "https://gifts.alpha.hamrostack.com/";

    @BeforeAll
    public void fireFox() {

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriverManager.firefoxdriver().setup();
        firefoxOptions.setBinary("/snap/firefox/current/usr/lib/firefox/firefox");
        driver = new FirefoxDriver(firefoxOptions);

        driver.get(URL);

    }

    @AfterAll
    public void foxTeardown() {

        driver.quit();

    }

}
