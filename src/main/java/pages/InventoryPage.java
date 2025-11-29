package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    WebDriver driver;

    By addBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.id("shopping_cart_container");

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    public void addToCartBackpack() {
        driver.findElement(addBackpack).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}