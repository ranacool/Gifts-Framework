package URL;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    WebDriver driver;
    String URL = "https://gifts.alpha.hamrostack.com/";

    @BeforeAll
    public void edge() {

        WebDriverManager.edgedriver().setup();

        driver = new EdgeDriver();

        driver.get(URL);

    }

    @AfterAll
    public void edgeTeardown() {

        driver.quit();

    }
}
