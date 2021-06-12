package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestBase;

public class CalenderEvents extends TestBase {

        @FindBy(xpath="(//div[@data-toggle='dropdown'])[2]")
        public WebElement options;

        @FindBy (xpath="//input[@type='number']")
        public WebElement pageNumber;

    }

