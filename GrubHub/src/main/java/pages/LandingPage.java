package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends CommonAPI {


    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]")
    public WebElement letsGoButton;
    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.EditText")
    public WebElement addressBox;
    @FindBy (xpath = "//android.widget.EditText[@content-desc=\"Search Bar Field\"]")
    public WebElement searchBox;
    @FindBy (xpath = "//android.widget.ImageView[@content-desc=\"Cuisine Button\"]")
    public WebElement cuisinesButton;

    public void getLetsGoButton () {
        letsGoButton.click();
    }

    public void getAddressBox() throws InterruptedException{
        addressBox.click();
        addressBox.sendKeys("3623 15 Ave Brooklyn NY", Keys.ENTER);
        sleep(10);
    }
    public void getSearchBox () throws InterruptedException {
        //searchBox.sendKeys("pizza");
        sleep(2);
    }

    public void getCuisineButton () {
        cuisinesButton.click();
    }
}
