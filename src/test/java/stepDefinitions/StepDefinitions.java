package stepDefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utils.DriverFactory;

/**
 * The StepDefinitions class contains the step definitions for Cucumber scenarios.
 * It includes hooks for setup and teardown, as well as methods to handle Gherkin steps.
 */
public class StepDefinitions {
    // WebDriver instance managed by the DriverFactory
    WebDriver driver = DriverFactory.getDriver();

    /**
     * Hook that runs once before all scenarios.
     * Used for global setup tasks.
     */
    @BeforeAll
    public static void beforeAll() {
        // Global setup if needed
    }

    /**
     * Hook that runs before each scenario.
     * Initializes the WebDriver and maximizes the browser window.
     */
    @Before
    public void setup() {
        // Initialize WebDriver (Chrome) before each scenario
        WebDriver driver = new ChromeDriver();
        DriverFactory.setDriver(driver);
        driver.manage().window().maximize();
    }

    /**
     * Hook that runs after each scenario.
     * Quits the WebDriver and optionally captures a screenshot if the scenario fails.
     *
     * @param scenario The current scenario being executed.
     */
    @After
    public void teardown(Scenario scenario) {
        // Take screenshot on failure (example)
        if (scenario.isFailed()) {
            // ... capture screenshot
        }
        DriverFactory.getDriver().quit();
    }

    /**
     * Hook that runs before each step.
     * Can be used for logging or preparing data.
     */
    @BeforeStep
    public void beforeStep() {
        // Runs before each step (e.g. can log step names or prepare data)
    }

    /**
     * Hook that runs after each step.
     * Can be used for taking screenshots or logging.
     */
    @AfterStep
    public void afterStep() {
        // Runs after each step (e.g. take screenshots on each step)
    }

    /**
     * Step definition for navigating to the login page.
     * Opens the login page URL in the browser.
     */
    @Given("user navigates to login page")
    public void navigateToLogin() {
        DriverFactory.getDriver().get("https://example.com/login");
    }

    /**
     * Step definition for logging in with a username and password.
     * Uses the LoginPage object to perform the login action.
     *
     * @param user The username to log in with.
     * @param pass The password to log in with.
     */
    @When("user logs in with username {string} and password {string}")
    public void login(String user, String pass) {
        new LoginPage(DriverFactory.getDriver()).login(user, pass);
    }

    /**
     * Step definition for searching for a product.
     * Uses the HomePage object to perform the search action.
     *
     * @param product The name of the product to search for.
     */
    @When("user searches for product {string}")
    public void searchProduct(String product) {
        new HomePage(DriverFactory.getDriver()).search(product);
    }

    /**
     * Step definition for adding the first product from the search results to the cart.
     * Uses the HomePage object to perform the add-to-cart action.
     */
    @When("user adds the product to the cart")
    public void addToCart() {
        new HomePage(DriverFactory.getDriver()).addFirstResultToCart();
    }

    /**
     * Step definition for verifying that the cart contains a specific product.
     * Uses the CartPage object to check if the product is present in the cart.
     *
     * @param product The name of the product to verify in the cart.
     */
    @Then("the cart should contain {string}")
    public void verifyCart(String product) {
        Assert.assertTrue(new CartPage(DriverFactory.getDriver()).isProductInCart(product));
    }
}