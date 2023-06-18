import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        WebDriver driver;
        String projectPath = System.getProperty("user.dir");
        String osName = System.getProperty("os.name");

        @BeforeClass
        public void beforeClass () {
            if (osName.contains("Windows")) {
                System.setProperty("webdriver.gecko.driver", projectPath + "\\Browser\\geckodriver.exe");
//			System.setProperty("webdriver.chrome.driver", projectPath + "\\Browser\\chromedriver.exe");
            } else {
                System.setProperty("webdriver.gecko.driver", projectPath + "/Browser/geckodriver");
//				System.setProperty("webdriver.chrome.driver", projectPath + "/Browser/chromedriver");
            }

            driver = new FirefoxDriver();
//		driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        @Test
        public void TC_01()
        {
            driver.get("https://www.facebook.com/");
        }
}

