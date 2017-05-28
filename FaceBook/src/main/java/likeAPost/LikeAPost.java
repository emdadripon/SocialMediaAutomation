package likeAPost;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by smhoque on 5/27/17.
 */
public class LikeAPost extends CommonAPI {

    @FindBy(how = How.CSS, using = "._1k67 > a:nth-child(1) > span:nth-child(2)")
    public static WebElement name;

    @FindBy(how = How.CSS, using = "#u_0_2w > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
    public static WebElement like;

    public void likeaPost(){
        name.click();
        like.click();
    }
}
