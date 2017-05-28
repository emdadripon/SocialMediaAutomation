package logOutFromFaceBook;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by smhoque on 5/27/17.
 */
public class LogOutFromFaceBook extends CommonAPI {

    @FindBy(how = How.CSS, using = "#userNavigationLabel")
    public static WebElement userNavLabel;

    @FindBy(how = How.CSS, using = "li._54ni:nth-child(18) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)")
    public static WebElement logoutButton;
    public void logout(){
        userNavLabel.click();
        logoutButton.click();
    }
}
