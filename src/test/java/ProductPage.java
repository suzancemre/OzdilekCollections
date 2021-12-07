import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class GiyimPage extends BaseTest{
    @Step("Menuden <pantolon> sekmesine tiklanir" )
    public void pantolonaTıkla(String pantolon) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.xpath(pantolon)).click();
        logger.info("Arama alanına pantolon araması yapilir");
    }
  @Step("Sayfanin en alt kısmına kadar kaydırılır")
    public void scroll() throws InterruptedException {
        Thread.sleep(2000);
      TouchAction swipe = new TouchAction(appiumDriver).press(PointOption.point(540, 1824)) .waitAction(waitOptions(ofMillis(800))).moveTo(PointOption.point(540, 672)).release().perform();
  }
  @Step("Sayfadan rasgele urun secilir")
   public void rasgeleUrunSec() throws InterruptedException {
      List<String> rastegeleUrunler =new LinkedList<String>();
       Thread.sleep(2000);
      for(int i=0;i<4;i++){
          rastegeleUrunler.add("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[\"+(i+1)+\"]/android.view.ViewGroup/android.widget.ImageView");
      }

      Random random = new Random();

      int r = random.nextInt(4);

      appiumDriver.findElement(By.xpath(rastegeleUrunler.get(r))).click();
      logger.info("Sayfadan rasgele bir urun secilir");
      }

  }



