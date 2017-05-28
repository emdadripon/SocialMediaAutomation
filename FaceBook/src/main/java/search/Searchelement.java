package search;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

import java.io.IOException;

/**
 * Created by smhoque on 5/27/17.
 */
public class Searchelement extends CommonAPI {

    @FindBy(how = How.CSS, using = "._1frb")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = "._42ft._4jy0._4w98._4jy3._517h._51sy")
    public static WebElement searchSubmit;

    public void searchFor(String item) {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()+": " + item));
        searchInput.sendKeys(item, Keys.ENTER);
    }

    public void clearSearchInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchInput.clear();
    }
    public void getDataFromExcelFileAndSearch()throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //Create instance of Excel file reader class
        ElementsToBeSearched elementsToBeSearched = new ElementsToBeSearched();
        //Page Factory class init
        Searchelement searchelement = PageFactory.initElements(driver, Searchelement.class);
        //Read data from Excel File.
        String[] value = elementsToBeSearched.getDataFromExcelFile();
        //Running for each loop
        for (int i = 1; i < value.length; i++) {
            searchelement.searchFor(value[i]);
            sleepFor(2);
            searchelement.clearSearchInput();
        }
    }
}

