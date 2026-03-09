import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class VerificareTitlu {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.prydwen.gg");
    }

    @Test
    public void verificaTitlu() {
        String titlu = driver.getTitle();
        System.out.printf("Titlul este:" + "" + titlu);

        Assert.assertNotNull(titlu);
        Assert.assertFalse(titlu.contains("prydwen"), "Titlul paginii ar trebui sa contina 'prydwen'");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}