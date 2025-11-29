package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {

    WebDriver driver;

    By successMessage = By.className("complete-header");

    public CheckoutCompletePage(WebDriver driver){
        this.driver = driver;
    }

    public String getSuccessMessage(){
        return driver.findElement(successMessage).getText();
    }
}
