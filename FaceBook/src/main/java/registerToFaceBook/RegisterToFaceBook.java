package registerToFaceBook;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by smhoque on 5/26/17.
 */
public class RegisterToFaceBook extends CommonAPI {

    @FindBy(how = How.CSS, using = "#u_0_1")
    public static WebElement firstName;

    @FindBy(how = How.CSS, using = "#u_0_3")
    public static WebElement lastName;

    @FindBy(how = How.CSS, using = "#u_0_6")
    public static WebElement email;

    @FindBy(how = How.CSS, using = "#u_0_9")
    public static WebElement reenterEmail;

    @FindBy(how = How.CSS, using = "#u_0_d")
    public static WebElement password;

    public void sendInfo(){
        firstName.sendKeys("Steve");
        lastName.sendKeys("Chune");
        email.sendKeys("steve@gmail.com");
        reenterEmail.sendKeys("steve@gmail.com");
        password.sendKeys("12345678");

        Select selectMonth = new Select(driver.findElement(By.id("month")));
        selectMonth.selectByIndex(4);

        Select selectDay = new Select(driver.findElement(By.id("day")));
        selectDay.selectByValue("15");

        Select selectYear = new Select(driver.findElement(By.id("year")));
        selectYear.selectByIndex(10);

        clickByCss("#u_0_g");
        clickByCss("#u_0_l");

    }
}
