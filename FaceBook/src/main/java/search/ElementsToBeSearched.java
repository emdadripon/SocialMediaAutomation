package search;

import Base.CommonAPI;
import utility.reader.DataReader;
import utility.reporting.TestLogger;

import java.io.IOException;

/**
 * Created by smhoque on 5/27/17.
 */
public class ElementsToBeSearched extends CommonAPI {
    DataReader dr = new DataReader();
    public String [] getDataFromExcelFile()throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       // String path = System.getProperty("user.dir")+"/Data/FaceBook1.xls";
        String path = System.getProperty("/Users/smhoque/IdeaProjects/SocialMedia/Data/FaceBook1.xls");
        String [] st = dr.fileReader(path);
        return st;
    }
}
