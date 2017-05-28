package CommentOnPost;

import Base.CommonAPI;
import commentOnAPost.CommentOnAPost;
import loginToFaceBook.LoginToFaceBook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by smhoque on 5/28/17.
 */
public class commentOnPost extends CommonAPI {
    @Test
    public void writeComment(){
        ApplicationLog.epicLogger("Epic: Metro EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-8> GREEN-8 </a>");
        LoginToFaceBook loginToFaceBook = PageFactory.initElements(driver, LoginToFaceBook.class);
        loginToFaceBook.sendInfo();
        CommentOnAPost commentOnAPost = PageFactory.initElements(driver, CommentOnAPost.class);
        commentOnAPost.commentOnPost();

    }
}
