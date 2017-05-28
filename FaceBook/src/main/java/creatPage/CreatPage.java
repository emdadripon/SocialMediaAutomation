package creatPage;

import Base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by smhoque on 5/27/17.
 */
public class CreatPage extends CommonAPI {
    public void page(){
        mouseHoverByCSS("#navItem_2530096808 > a:nth-child(1) > div:nth-child(2)");
    }
}
