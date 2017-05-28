package searchelements;

import Base.CommonAPI;
import loginToFaceBook.LoginToFaceBook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.Searchelement;
import utility.reporting.ApplicationLog;

import java.io.IOException;

/**
 * Created by smhoque on 5/27/17.
 */
public class SearchElements extends CommonAPI {
    @Test
    public void search() throws IOException, InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");

        LoginToFaceBook loginToFaceBook = PageFactory.initElements(driver, LoginToFaceBook.class);
        loginToFaceBook.sendInfo();
        Searchelement searchelement = PageFactory.initElements(driver, Searchelement.class);
        searchelement.getDataFromExcelFileAndSearch();
    }
}
