import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by tommy on 2017/4/12.
 */
public class TaoBaoSpider {


    public static void main(String args[]) {



        WebDriver driver;
        String baseUrl;
        boolean acceptNextAlert = true;
        StringBuffer verificationErrors = new StringBuffer();

        driver = new FirefoxDriver();
        baseUrl = "https://world.taobao.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get(baseUrl + "/search/search.htm?sort=_deal&_ksTS=1491487495190_753&spm=a21bp.7806943.20151106.1&style=list&json=on&cna=6CuTDXxTCQMCAXvBeoqWnPRj&module=sortList&_input_charset=utf-8&navigator=all&s=0&q=%E8%80%81%E4%BA%BA&callback=__jsonp_cb&abtest=_AB-LR517-LR854-LR895-PR517-PR854-PR895");
        List<WebElement> elements = driver.findElements(By.className("J_AtpLog"));
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=nameStorage:?wm_referrer=https%3A%2F%2Fs.taobao.com%2Fsearch%3Fq%3D%25E8%2580%2581%25E4%25BA%25BA%26imgfile%3D%26commend%3Dall%26ssid%3Ds5-e%26search_type%3Ditem%26sourceId%3Dtb.index%26spm%3Da21bo.50862.201856-taobao-item.1%26ie%3Dutf8%26initiative_id%3Dtbindexz_20170412%26sort%3Drenqi-desc&refer_pv_id=vK41ZK | ]]
        driver.findElement(By.linkText("2")).click();

    }
}
