package loginToFaceBook;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by smhoque on 5/26/17.
 */
public class LoginToFaceBook extends CommonAPI {
    @FindBy(how = How.CSS, using = "#email")
    public static WebElement email;

    @FindBy(how = How.ID, using = "pass")
    public static WebElement pass;

    @FindBy(how = How.CSS, using = "#loginbutton")
    public static WebElement loginbutton;
    public void sendInfo(){
        email.sendKeys("emdad.ripon");
        pass.sendKeys("$Ctg1979");
        loginbutton.click();
    }
}
