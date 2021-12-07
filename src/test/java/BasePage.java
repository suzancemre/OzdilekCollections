import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends BaseTest {
    @Step("Ansayfaya gidilir <wait> kadar beklenir")
    public void openPage(int wait) throws InterruptedException {
        Thread.sleep(wait * 1000);
    }

    @Step("Anasayfanin <adres> alanında <istenilen> kontrol edilir")
    public void openPageCurrent(String adres,String istenilen) throws InterruptedException {
  //      Thread.sleep(1000);
        waiter.until(ExpectedConditions.elementToBeClickable(By.id(adres)));

        String result = appiumDriver.findElement(By.id(adres)).getText();
        Assert.assertEquals(istenilen,result);
    }

    @Step("AlişverişeTıkla <buton> tıklanır")
    public void butonaTıkla(String buton) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(buton)).click();
        logger.info("alisveris butonuna tiklanir");
    }
    @Step("Alisverise tıkla <alısveristıkla> da <categori> olması kontrol edilir")
    public void openPageClickCurrent(String alısverisetıkla,String categori) throws InterruptedException {
        Thread.sleep(2000);
        String current=appiumDriver.findElement(By.id(alısverisetıkla)).getText();
        Assert.assertEquals(categori,current);
    }

    @Step("Giris yap <giris> alanında <login>alanı varmı dogrulanir")
    public void girisYapTıkla(String giris,String login) throws InterruptedException {
        Thread.sleep(1000);
        String gelecekdeger=appiumDriver.findElement(By.id(giris)).getText();
        Assert.assertEquals(gelecekdeger,login);
    }

}
