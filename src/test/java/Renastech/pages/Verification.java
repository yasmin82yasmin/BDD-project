package Renastech.pages;

import Renastech.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verification extends BrowserUtils {
    public Verification(){
        PageFactory.initElements(driver,this);}
    @FindBy(xpath = "//h2[.='Payment successfull']")
    WebElement verificationText;
    public void setVerificationText(String expected){
        Assert.assertEquals(verificationText.getText(),expected);

    }
}
