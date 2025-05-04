package utils;

import org.openqa.selenium.WebDriver;

/**
 * The DriverFactory class provides a thread-safe mechanism to manage WebDriver instances.
 * It uses a ThreadLocal to ensure each thread has its own WebDriver instance.
 */
public class DriverFactory {
    // ThreadLocal variable to store WebDriver instances for each thread
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    /**
     * Retrieves the WebDriver instance associated with the current thread.
     *
     * @return The WebDriver instance for the current thread, or null if not set.
     */
    public static WebDriver getDriver() {
        return driver.get();
    }

    /**
     * Sets the WebDriver instance for the current thread.
     *
     * @param webDriver The WebDriver instance to be associated with the current thread.
     */
    public static void setDriver(WebDriver webDriver) {
        driver.set(webDriver);
    }
}