package acceptAFriendRequest;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

/**
 * Created by smhoque on 5/28/17.
 */
public class AcceptAFriendRequest extends CommonAPI {

    @FindBy(how = How.CSS, using = "._2n_9")
    public static WebElement friendRequest;

    @FindBy(how = How.CSS, using = "._42ft._4jy0._4jy3._4jy1.selected._51sy")
    public static WebElement confirm;

    public void confirmFriendRequest()  {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        friendRequest.click();
        clickVisibleButton(".//*[@id='u_u_d']/div/button[1]");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        confirm.click();
    }

}
