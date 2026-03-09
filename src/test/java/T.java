import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class NavigareBrowser {

    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = new ChromeDriver();

    }
    @Test

    public void navigareExample() {
        driver.get("https://x.com/i/grok?conversation=2031011934925910272");
    }
    @Test

    public void navigareApple() {
        driver.get("https://www.prydwen.gg");

    }
    @AfterMethod

    public void tearDown() {
        driver.quit();
    }
}