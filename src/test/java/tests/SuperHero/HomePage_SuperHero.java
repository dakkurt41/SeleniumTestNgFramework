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

    @Test
    public void Test3() throws InterruptedException {
        lp.LoginHomePage(generateEmail4(), randomPassword());
    }

    @Test
    public void Test4() throws InterruptedException {
        lp.LoginHomePage(generateEmail5(10), generatePassword5(9));
    }

    @Test
    public void Test5() throws InterruptedException {
        lp.LoginHomePage(generateEmail6(7), generatePassword6(21));
    }

    @Test
    public void Test6() throws InterruptedException {
        lp.LoginHomePage(generateRandomEmail(11), generatePassword6(11));
    }

    @Test
    public void Test7() throws InterruptedException {
        lp.LoginHomePage(generateRandomEmail((int) (Math.random()*20)), generatePassword6((int) (Math.random()*20)));
    }


    @Test
    public void Test8() throws InterruptedException {
        lp.LoginHomePage(generateEmail7(), generatePassword7());
    }

    @Test
    public void Test9() throws InterruptedException {
        lp.LoginHomePage(generateEmail8(), generatePassword8());
    }









}
