package AddToCart;

import URL.Chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class ChromeProduct {

    Chrome initialize = new Chrome();
    @Test
    public void OneProductToCart() {

        WebDriver driver;

        //initializes chrome and sets timeout
        driver = initialize.chrome();
        Duration timeout = Duration.ofSeconds(40);
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        //finds the product from homepage and clicks on it
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = \"product-style_product__uoKQH\"])[1]")));
        WebElement product = driver.findElement(new By.ByXPath("(//div[@class = \"product-style_product__uoKQH\"])[1]"));
        product.click();

        //Clicks on 'Add To Cart'
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.productDetail_addProductBtn__OpCfm")));
        WebElement cart = driver.findElement(By.cssSelector("button.productDetail_addProductBtn__OpCfm"));
        cart.click();

        //Asserts if checkout is clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.cart_btnText__YS3Zc")));
        String complete = driver.findElement(By.cssSelector("div.cart_btnText__YS3Zc")).getText();
        Assert.assertEquals(complete,"Checkout" );

        initialize.chromeTeardown();
    }

    @Test
    public void MultipleProductToCart(){

        WebDriver driver;

        driver = initialize.chrome();
        Duration timeout = Duration.ofSeconds(40);
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        String[] names = {"Guitar","Piano","Oreo Kiwi Cake"};

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='product-style_product__uoKQH']")));
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='product-style_product__uoKQH']"));

        for(int i = 0; i < products.size(); i++){

            String name = products.get(i).getText();
            if(name.contains())

        }

    }


}
