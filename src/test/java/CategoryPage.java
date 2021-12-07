import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class KategorilerPage extends BaseTest {


    @Step("Kategori <alan> butonuna  tıklanır")
    public void categoriesclick (String alan) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(alan)).click();
        logger.info("Kategoriler sekmesine tiklanir");
    }
    @Step("Katagori <categorybuton> alanınada <categoryisim> yer alıyor mu")
    public void categoryClickCurrent(String categorybuton,String categoryisim) throws InterruptedException {
        Thread.sleep(1000);
        String expected=appiumDriver.findElement(By.xpath(categorybuton)).getText();
        Assert.assertEquals(expected,categoryisim);
    }
    @Step("Menuden <secenek> secenek alanına tıklanır")
    public void clickSecenek(String secenek) throws InterruptedException {
        Thread.sleep(2000);
        appiumDriver.findElement(By.xpath(secenek)).click();
        logger.info("Menuden istenilen secenege tiklanir");
    }
}
