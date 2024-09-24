package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.HashMap;

import static stepDefinitions.Hooks.height;
import static stepDefinitions.Hooks.width;

public class Driver {

    // Thread-safe driver instance
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    // Private constructor to prevent instantiation
    private Driver() {
    }

    // Method to get the WebDriver instance
    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            synchronized (Driver.class) {
                String browserType = ConfigurationReader.getProperty("browser");
                boolean isHeadless = Boolean.parseBoolean(ConfigurationReader.getProperty("headless"));
                boolean isFullScreen = Boolean.parseBoolean(ConfigurationReader.getProperty("fullscreen"));

                switch (browserType.toLowerCase()) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver(setChromeOptions(isHeadless)));
                        break;

                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver(setFirefoxOptions(isHeadless)));
                        break;

                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        driverPool.set(new EdgeDriver(setEdgeOptions()));
                        break;

                    case "safari":
                        if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                            throw new WebDriverException("Safari is only supported on macOS");
                        driverPool.set(new SafariDriver());
                        break;

                    default:
                        throw new IllegalArgumentException("Browser type not supported: " + browserType);
                }

                // Window management
                if (isFullScreen) {
                    driverPool.get().manage().window().maximize();
                } else {
                    Dimension dimension = new Dimension(width, height);
                    driverPool.get().manage().window().setSize(dimension);
                }

                driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            }
        }
        return driverPool.get();
    }

    // Close the driver and remove it from the thread-local pool
    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }

    // Chrome options configuration
    private static ChromeOptions setChromeOptions(boolean isHeadless) {
        ChromeOptions chromeOptions = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.default_directory", System.getProperty("user.dir") + "/target");
        chromeOptions.setExperimentalOption("prefs", chromePrefs);

        if (isHeadless) {
            chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
        }

        chromeOptions.addArguments("use-fake-ui-for-media-stream", "--disable-gpu", "--remote-allow-origins=*");
        return chromeOptions;
    }

    // Firefox options configuration
    private static FirefoxOptions setFirefoxOptions(boolean isHeadless) {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        if (isHeadless) {
            firefoxOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
        }
        return firefoxOptions;
    }

    // Edge options configuration
    private static EdgeOptions setEdgeOptions() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("use-fake-ui-for-media-stream", "--disable-gpu", "--window-size=1920,1080");
        return edgeOptions;
    }
}
