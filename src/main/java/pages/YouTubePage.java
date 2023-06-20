package pages;

import data.VideoObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class YouTubePage {
    String mainVideo = "//ytd-search-pyv-renderer[contains(@class,\"ytd-item-section-renderer\")]";

    @FindBy(id = "search")
    WebElement searchField;
    @FindBy(xpath = "//ytd-video-renderer[contains(@class,\"ytd-item-section-renderer\")]")
    List<WebElement> webElementList;

     static WebDriver driver;

    public YouTubePage(WebDriver driver) {
        YouTubePage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searcH(String word) {
        driver.navigate().to("https://www.youtube.com/results?search_query="+word);
    }

    public List<VideoObject> getListYouTubeSearch() {
        List<VideoObject> videoObjectList = new ArrayList<>();
        for (WebElement l : webElementList) {
            videoObjectList.add(
                    new VideoObject(
                            l.findElement(By.tagName("a")).getAttribute("href"),
                            l.findElement(By.tagName("img")).getAttribute("src"),
                            l.findElement(By.id("video-title")).getAttribute("title")
                    ));
        }
        return videoObjectList;
    }
}
