package URL;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {

    public WebDriver driverChrome;

    String URL = "https://gifts-next.alpha.hamrostack.com/";
    @BeforeAll
    public WebDriver chrome() {

        WebDriverManager.chromedriver().setup();
        //ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
        driverChrome = new ChromeDriver();
        driverChrome.get(URL);

        return driverChrome;
    }

    @AfterAll
    public void chromeTeardown() {

        driverChrome.quit();

    }


}
