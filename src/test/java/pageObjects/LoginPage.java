package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The LoginPage class represents the page object model for the login page.
 * It provides methods to interact with and verify elements on the login page.
 */
public class LoginPage {
    WebDriver driver;

    /**
     * The WebElement representing the username input field.
     * Located using the "id" attribute with the value "username".
     */
    @FindBy(id = "username")
    WebElement txtUsername;

    /**
     * The WebElement representing the password input field.
     * Located using the "id" attribute with the value "password".
     */
    @FindBy(id = "password")
    WebElement txtPassword;

    /**
     * The WebElement representing the login button.
     * Located using the "id" attribute with the value "loginBtn".
     */
    @FindBy(id = "loginBtn")
    WebElement btnLogin;

    /**
     * Constructor to initialize the LoginPage object.
     * It uses the PageFactory to initialize WebElements.
     *
     * @param driver The WebDriver instance used to interact with the web page.
     */
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Logs in to the application by entering the username and password
     * and clicking the login button.
     *
     * @param user The username to be entered in the username field.
     * @param pass The password to be entered in the password field.
     */
    public void login(String user, String pass) {
        txtUsername.sendKeys(user);
        txtPassword.sendKeys(pass);
        btnLogin.click();
    }
}