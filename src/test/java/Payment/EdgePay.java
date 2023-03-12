package Payment;

import URL.Edge;
import org.testng.annotations.Test;


public class EdgePay {

    Edge browser = new Edge();

    @Test
    public void AddToCart(){

        browser.edge();  //error because edge not installed in device
        browser.edgeTeardown();

    }


}
