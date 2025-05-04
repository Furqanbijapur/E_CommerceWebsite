package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

/**
 * The HomePage class represents the page object model for the home page.
 * It provides methods to interact with and verify elements on the home page.
 */
public class HomePage {
    WebDriver driver;

    /**
     * The search box WebElement used to input search queries.
     * Located using the "name" attribute with the value "search".
     */
    @FindBy(name = "search")
    WebElement searchBox;

    /**
     * The search button WebElement used to trigger the search action.
     * Located using the CSS selector "button.search-button".
     */
    @FindBy(css = "button.search-button")
    WebElement searchButton;

    /**
     * A list of WebElements representing the product results displayed after a search.
     * Located using the CSS selector ".search-results .product".
     */
    @FindBy(css = ".search-results .product")
    List<WebElement> productResults;

    /**
     * The "Add to Cart" button WebElement for the first product in the search results.
     * Located using the CSS selector ".search-results .product button.add-to-cart".
     */
    @FindBy(css = ".search-results .product button.add-to-cart")
    WebElement addToCartButton;

    /**
     * Constructor to initialize the HomePage object.
     * It uses the PageFactory to initialize WebElements.
     *
     * @param driver The WebDriver instance used to interact with the web page.
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Performs a search for a product by entering the product name in the search box
     * and clicking the search button.
     *
     * @param productName The name of the product to search for.
     */
    public void search(String productName) {
        searchBox.clear();
        searchBox.sendKeys(productName);
        searchButton.click();
    }

    /**
     * Adds the first product from the search results to the cart.
     * Throws a RuntimeException if no products are found in the search results.
     */
    public void addFirstResultToCart() {
        if (!productResults.isEmpty()) {
            addToCartButton.click();
        } else {
            throw new RuntimeException("No products found in search results");
        }
    }
}