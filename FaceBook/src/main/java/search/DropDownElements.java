package search;

import Base.CommonAPI;
import utility.reporting.TestLogger;

import java.util.List;

/**
 * Created by smhoque on 5/27/17.
 */
public class DropDownElements extends CommonAPI {
    public void typeOnInputSearch(List<String> data)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for(int i=0; i<5; i++) {
            typeByCss("._1frb", data.get(i));
            input();
            sleepFor(2);
            clearBox();
        }
    }

    public void input() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        keysInput("._1frb");
    }
    public void clearBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clearInput("._1frb");
    }
}
