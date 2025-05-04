package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * The CartPage class represents the page object model for the shopping cart page.
 * It provides methods to interact with and verify elements on the cart page.
 */
public class CartPage {
    WebDriver driver;

    /**
     * A list of WebElements representing the product titles in the cart.
     * Located using the CSS selector ".cart-item .product-title".
     */
    @FindBy(css = ".cart-item .product-title")
    List<WebElement> cartItems;

    /**
     * Constructor to initialize the CartPage object.
     * It uses the PageFactory to initialize WebElements.
     *
     * @param driver The WebDriver instance used to interact with the web page.
     */
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Checks if a product with the specified name is present in the cart.
     *
     * @param productName The name of the product to search for in the cart.
     * @return true if the product is found in the cart, false otherwise.
     */
    public boolean isProductInCart(String productName) {
        return cartItems.stream()
                .anyMatch(item -> item.getText().equalsIgnoreCase(productName));
    }
}