package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.BaseTest;

public class CheckoutTest extends BaseTest {

    @Test
    public void testSuccessfulCheckout() {

        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        InventoryPage inventory = new InventoryPage(driver);
        inventory.addToCartBackpack();
        inventory.goToCart();

        CartPage cart = new CartPage(driver);
        cart.clickCheckout();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.fillInformation("Florida", "Septysia", "99999");
        checkout.clickContinue();
        checkout.clickFinish();

        CheckoutCompletePage complete = new CheckoutCompletePage(driver);

        Assert.assertEquals(
                complete.getSuccessMessage(),
                "Thank you for your order!"
        );
    }
}
