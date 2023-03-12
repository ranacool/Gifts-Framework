package Payment;

import URL.Firefox;
import org.testng.annotations.Test;

public class firefoxPay {

    Firefox firefox = new Firefox();

    @Test
    public void AddToCartFire() {

        firefox.fireFox();
        firefox.foxTeardown();

    }

}
