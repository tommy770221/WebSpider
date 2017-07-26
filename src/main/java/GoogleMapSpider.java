import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by tommy on 2017/4/12.
 */
public class GoogleMapSpider {


    public static void main(String args[]) throws InterruptedException {


        WebDriver driver;
        String baseUrl;
        boolean acceptNextAlert = true;
        StringBuffer verificationErrors = new StringBuffer();

        System.setProperty("webdriver.gecko.driver", "/Users/tommy/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com.tw/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl + "/maps/search/%E6%8B%89%E9%BA%B5/@25.0409727,121.5197265,16z/data=!3m1!4b1");
        driver.findElement(By.id("searchbox-searchbutton")).click();
        driver.findElement(By.id("section-pagination-button-next")).click();
        List<WebElement> webElementList=driver.findElements(By.xpath("//*[@id=\"pane\"]/div/div[2]/div/div"));
        for(WebElement webElement:webElementList){
            List<WebElement> webElements= webElement.findElements(By.xpath("div"));
            for(WebElement webElement2:webElements){
                List<WebElement> webElements2= webElement.findElements(By.cssSelector("div.section-result"));
                for(WebElement webElement1:webElements2){
                    try {
                        // System.out.println(webElement.findElement(By.cssSelector("div.section-result-text-content > div.section-result-header > div.section-result-title-container")).getText());
                        System.out.println(webElement1.findElement(By.cssSelector("div.section-result-text-content")).getText());
                        // System.out.println(webElement.findElement(By.cssSelector("div.section-result-text-content > div.section-result-detail-container > span.section-result-location")).getText());
                        // System.out.println(webElement.findElement(By.cssSelector("div.section-result-text-content > div.section-result-opening-hours")).getText());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }


        }


      //  driver.findElement(By.id("sb_cb50")).click();
        driver.quit();
      //  String verificationErrorString = verificationErrors.toString();



    }
}
