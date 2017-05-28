package page;

import Base.CommonAPI;
import creatPage.CreatPage;
import loginToFaceBook.LoginToFaceBook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by smhoque on 5/27/17.
 */
public class Page extends CommonAPI {
    @Test
    public void creatFaceBookPage(){
        ApplicationLog.epicLogger("");
        LoginToFaceBook loginToFaceBook = PageFactory.initElements(driver, LoginToFaceBook.class);
        loginToFaceBook.sendInfo();
        CreatPage creatPage = PageFactory.initElements(driver, CreatPage.class);
        creatPage.page();
    }
}
