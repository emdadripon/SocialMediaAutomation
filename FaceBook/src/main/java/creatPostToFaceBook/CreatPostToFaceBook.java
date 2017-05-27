package creatPostToFaceBook;

import Base.CommonAPI;
import loginToFaceBook.LoginToFaceBook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by smhoque on 5/26/17.
 */
public class CreatPostToFaceBook extends CommonAPI {


    @FindBy(how = How.CSS, using = "._1mf._1mj")
    public static WebElement post;

    @FindBy(how = How.CSS, using = "._1mf7")
    public static WebElement button;

    public void writeToPost(){
        post.sendKeys("Hello faceBook");
        button.click();
    }
}
