package logOutFaceBook;

import Base.CommonAPI;
import logOutFromFaceBook.LogOutFromFaceBook;
import loginToFaceBook.LoginToFaceBook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by smhoque on 5/27/17.
 */
public class LogoutFaceBook extends CommonAPI {
    @Test
    public void faceBookLogout(){
        ApplicationLog.epicLogger("Epic: Metro EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-8> GREEN-8 </a>");
        LoginToFaceBook loginToFaceBook = PageFactory.initElements(driver, LoginToFaceBook.class);
        loginToFaceBook.sendInfo();
        LogOutFromFaceBook logOutFromFaceBook = PageFactory.initElements(driver, LogOutFromFaceBook.class);
        logOutFromFaceBook.logout();

    }
}
