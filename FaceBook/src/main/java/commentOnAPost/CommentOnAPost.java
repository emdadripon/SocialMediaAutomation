package commentOnAPost;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

/**
 * Created by smhoque on 5/28/17.
 */
public class CommentOnAPost extends CommonAPI {

    @FindBy(how = How.CSS, using = "._1k67 > a:nth-child(1) > span:nth-child(2)")
    public static WebElement name;

    @FindBy(how = How.CSS, using = "#u_0_2w > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1) > a:nth-child(1)")
    public static WebElement comment;


    @FindBy(how = How.CSS, using = "._1mf")
    public static WebElement writeComment;


    public void commentOnPost(){
        name.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        comment.click();
        writeComment.sendKeys("Hello FaceBook");

    }
}
