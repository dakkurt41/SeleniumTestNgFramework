package pages.SuperHero_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPageForSuperHero {


    // 4 category

    // variables
    // hard coded variable
    // goal try dynamic
//    String email = "sample23@gmail.com";
//    String password = "1235567844";


    // constructor
    public LoginPageForSuperHero() {
        PageFactory.initElements(Driver.get(), this);
    }




    // locators

    @FindBy(id = "loginEmail")
    public WebElement emailInputBox;

    @FindBy(id = "loginPassword")
    public WebElement passwordInputBox;


    @FindBy(css = "#form-login > button")
    public WebElement submitButton;



    // make reusable methods
    public void LoginHomePage(String email, String password) throws InterruptedException {
        emailInputBox.sendKeys(email);
        Thread.sleep(3000);
        passwordInputBox.sendKeys(password);
        Thread.sleep(3000);
        submitButton.click();
        Thread.sleep(3000);
    }





}
