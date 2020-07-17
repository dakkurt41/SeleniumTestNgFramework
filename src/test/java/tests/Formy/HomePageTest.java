package tests.Formy;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;
import utils.ReusableMethods;

import static utils.ReusableMethods.clickOnTheDesiredLink1;

public class HomePageTest {


    @Test
    public void Test1(){

        // what is page object from formhomepage class
        //in order to initialize a class with constructor with new objects
// 1-step creating an object to access variable, locators or methods from homepage class
        //class name  // anyName      // creating object // constructor
        FormyHomePage formyHomePage = new FormyHomePage();
        System.out.println(formyHomePage.url);

        //2- step opening from chrome and navigate to url
        //selenium method
        Driver.get().get(formyHomePage.url);

        // 3 step - Validation
        //comparing webpage and our data
        //UI vs hardcoded data  // not recomended
        // Ui vs database sql
        //UI vs api
        // database vs api
        //UI vs database vs api

        Assert.assertEquals(formyHomePage.title.getText(),formyHomePage.homePageTitle, "Title is not matching" );
        Assert.assertEquals(formyHomePage.paragraf.getText(), formyHomePage.homePageParagraf, " Text does not mathch ");
        Assert.assertTrue(formyHomePage.paragraf.getText().contains("components"));
        Driver.get().quit();
    }



    @Test
    public void Test2(){

        FormyHomePage formyHomePage = new FormyHomePage();

        Driver.get().get(formyHomePage.url);

        Assert.assertEquals(formyHomePage.title.getText(),formyHomePage.homePageTitle, "Title is not matching" );
        Assert.assertEquals(formyHomePage.paragraf.getText(), formyHomePage.homePageParagraf, " Text does not mathch ");
        Assert.assertTrue(formyHomePage.paragraf.getText().contains("components"));

        Driver.get().quit();
        ///less code and more reusable methods - not time methods more clean code
    }


    @Test
    public void Test3() throws InterruptedException {


        FormyHomePage formyHomePage = new FormyHomePage();

        Driver.get().get(formyHomePage.url);

        clickOnTheDesiredLink1("Modal");

        Assert.assertTrue(Driver.get().getCurrentUrl().contains("modal"), "The endopoint did not match ");

        Driver.get().quit();
       // Driver.get().quit();
    }



}
