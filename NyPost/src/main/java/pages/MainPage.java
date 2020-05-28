package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends CommonAPI {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open menu']")
    public WebElement BurgerButton;
   // @FindBy(xpath = "")
}