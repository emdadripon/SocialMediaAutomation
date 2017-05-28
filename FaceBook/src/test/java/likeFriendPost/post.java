package likeFriendPost;

import Base.CommonAPI;
import likeAPost.LikeAPost;
import loginToFaceBook.LoginToFaceBook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by smhoque on 5/27/17.
 */
public class post extends CommonAPI {
    @Test
    public  void likePost(){
        ApplicationLog.epicLogger("");
        LikeAPost likeAPost = PageFactory.initElements(driver, LikeAPost.class);
        LoginToFaceBook loginToFaceBook = PageFactory.initElements(driver, LoginToFaceBook.class);
        loginToFaceBook.sendInfo();
        //likeAPost.mouseHoverByCSS("#js_27j");
        likeAPost.likeaPost();
    }
}
