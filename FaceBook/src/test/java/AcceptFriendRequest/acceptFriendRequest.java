package AcceptFriendRequest;

import Base.CommonAPI;
import acceptAFriendRequest.AcceptAFriendRequest;
import loginToFaceBook.LoginToFaceBook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by smhoque on 5/28/17.
 */
public class acceptFriendRequest extends CommonAPI {
    @Test
    public void confirmRequest()  {
        ApplicationLog.epicLogger("");
        LoginToFaceBook loginToFaceBook = PageFactory.initElements(driver, LoginToFaceBook.class);
        loginToFaceBook.sendInfo();
        AcceptAFriendRequest acceptAFriendRequest = PageFactory.initElements(driver, AcceptAFriendRequest.class);
        acceptAFriendRequest.confirmFriendRequest();
    }
}
