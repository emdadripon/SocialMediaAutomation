package Post;

import Base.CommonAPI;
import creatPostToFaceBook.CreatPostToFaceBook;
import loginToFaceBook.LoginToFaceBook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by smhoque on 5/26/17.
 */
public class post extends CommonAPI {
    @Test
    public void post()throws InterruptedException{
        ApplicationLog.epicLogger("Epic: Metro EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-8> GREEN-8 </a>");


       LoginToFaceBook loginToFaceBook = PageFactory.initElements(driver, LoginToFaceBook.class);
       loginToFaceBook.sendInfo();
        CreatPostToFaceBook creatPostToFaceBook = PageFactory.initElements(driver, CreatPostToFaceBook.class);
        creatPostToFaceBook.writeToPost();
    }
}
