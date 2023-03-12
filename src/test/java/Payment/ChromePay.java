package Payment;

import URL.Chrome;
import org.testng.annotations.Test;

public class ChromePay {

    Chrome browser = new Chrome();
    @Test
    public void AddToCartChrome(){

        browser.chrome();
        browser.chromeTeardown();


    }


}
