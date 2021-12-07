import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class UrunDetay extends BaseTest{
    @Step("Urun detay <bolum> sayfasında <kontrol> tıklayınca")
    public void urunDetay(String bolum,String kontrol) throws InterruptedException {
        Thread.sleep(1000);
        String sonuc=appiumDriver.findElement(By.xpath(bolum)).getText();
        Assert.assertEquals(kontrol,sonuc);
    }
    @Step("<product> favorilere eklenir")
    public void favorilereTıkla(String product) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(product)).click();
        logger.info("Sayfadan istenilen urun favorilere eklenir");
    }
    @Step("Sayfadan rasgele beden secilir")
    public void rasgeleBedenSec() throws InterruptedException {
        List<String> rastegeleUrunler =new LinkedList<String>();
        Thread.sleep(2000);
        for(int i=0;i<4;i++){
            rastegeleUrunler.add("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]");
        }

        Random random = new Random();

        int r = random.nextInt(4);

        appiumDriver.findElement(By.xpath(rastegeleUrunler.get(r))).click();
        logger.info("Rasgele bir urun secilir");
    }

    @Step("Sayfadan <ekle> butonuna tiklanir")
    public void sepeteEkle(String ekle){
        appiumDriver.findElement(By.id(ekle)).click();
        logger.info("Ekle butonuna tiklanir");
    }
}
