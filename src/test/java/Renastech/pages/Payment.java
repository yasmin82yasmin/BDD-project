package Renastech.pages;

import Renastech.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment extends BrowserUtils {
    public Payment(){
        PageFactory.initElements(driver,this);}

    @FindBy(id="card_number")
    private WebElement cardNumber;
    @FindBy(id="month")
    private WebElement month;
    @FindBy(id="year")
    private WebElement year;
    @FindBy(id="cvv_code")
    private WebElement cvvCode;
    @FindBy(xpath = "//input[@value='pay $20.00]")
    private WebElement payButton;

    public void setCardNumber(String CardNumber){
        staticWait(1);
        cardNumber.sendKeys(CardNumber);
    }
    public void setMonth(String Month){
        staticWait(1);
        month.sendKeys(Month);
    }
    public void setYear(String Year){
        staticWait(1);
        year.sendKeys(Year);
    }
    public void setCvvCode(String CvvCode){
        staticWait(1);
        cvvCode.sendKeys(CvvCode);

    }
    public void setPayButton(){

        payButton.click();
    }



}

