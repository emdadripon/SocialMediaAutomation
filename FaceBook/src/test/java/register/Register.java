package register;

import Base.CommonAPI;
import loginToFaceBook.LoginToFaceBook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import registerToFaceBook.RegisterToFaceBook;
import utility.reporting.ApplicationLog;

/**
 * Created by smhoque on 5/26/17.
 */
public class Register extends CommonAPI {
    @Test
    public void faceBookRegister()throws InterruptedException{
        ApplicationLog.epicLogger("Epic: Metro EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-8> GREEN-8 </a>");
        RegisterToFaceBook registerToFaceBook = PageFactory.initElements(driver, RegisterToFaceBook.class);
        registerToFaceBook.sendInfo();
    }
}
