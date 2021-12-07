import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest{
    @Step("Texbox <field> alanına <veri> gönderilir")
    public void textAlan(String field,String veri) throws InterruptedException {
        Thread.sleep(100);
        appiumDriver.findElement(By.id(field)).sendKeys(veri);
    }

    @Step("Sayfadan bir onceki sayfaya gitmek icin <geri> tusuna basılır")
    public void geriTıkla(String geri) throws InterruptedException {
        Thread.sleep(100);
        appiumDriver.findElement(By.id(geri)).click();
        logger.info("Sayfadan geri tusu ile bir önceki sayfaya gidilir");
    }

}
