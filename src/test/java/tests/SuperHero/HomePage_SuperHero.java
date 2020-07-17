package tests.SuperHero;

import org.testng.annotations.Test;
import pages.SuperHero_Pages.LoginPageForSuperHero;
import tests.TestBase;
import utils.RandomGenerator;

import static utils.RandomGenerator.*;

public class HomePage_SuperHero extends TestBase {

    public  LoginPageForSuperHero lp = new LoginPageForSuperHero();
    public RandomGenerator generator = new RandomGenerator();
     //less code, not repeat codes , clear
    /// this for testing our
    // create object from different classes
    // call the methods and variables from other class


    @Test
    public void Test1() throws InterruptedException {
        lp.LoginHomePage("sample23@gmail.com", "12345389527");

    }

    @Test
    public void Test2() throws InterruptedException {
        lp.LoginHomePage(randomEmail(), randomPassword());

    }









}
