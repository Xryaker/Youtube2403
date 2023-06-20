package steps;

import conf.BaseClass;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.ast.Y;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.YouTubePage;
import util.WorkWithFile;

import java.io.IOException;

public class YoutubeSteps extends BaseClass {
    static final String YouTubeURL = "https://www.youtube.com/";

    YouTubePage youTubePage;
    @Before("@YOUTUBE")
    public void start() {
        if (driver == null) {
            BaseClass.BeforParent();
        }
        youTubePage=new YouTubePage(driver);
    }

    @Before("@START")
    public void openP() {
        if (!driver.getCurrentUrl().contains(YouTubeURL)) {
            driver.get(YouTubeURL);
        }

    }

    @When("I send search word {string} in youtube main search")
    public void iSendSearchWordInYoutubeMainSearch(String searchWord) {
youTubePage.searcH(searchWord);
    }



    @Then("Write file {string}  most popular search results")
    public void writeFileMostPopularSearchResults(String fileName) throws IOException {
        System.out.println(youTubePage.getListYouTubeSearch());
        WorkWithFile.writeFile(youTubePage.getListYouTubeSearch(),fileName);
    }
}
