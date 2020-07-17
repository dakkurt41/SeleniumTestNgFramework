package utils;

import com.github.javafaker.Faker;
import com.mifmif.common.regex.Generex;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

public class RandomGenerator {



    public static String getAlphaNumericString(int n) {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }


    public static String printRandomString(int n) {
        int MAX = 26;
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z'};

        String res = "";
        for (int i = 0; i < n; i++)
            res = res + alphabet[(int) (Math.random() * 10 % MAX)];

        return res;
    }

    public static String generateRandomEmail(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 1) + "@gmail.com";
        return email;
    }





    public static String randomEmail(){
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String randomPassword(){
        Faker faker = new Faker();
        return faker.internet().password();
    }

    public static String randomFirstName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String randomLastName(){
        Faker faker = new Faker();
        return faker.name().lastName();
    }

    // partialy faker and hardcoded genereator
    public static String generateEmail(){
        return String.format("%s@%s",randomFirstName(),"gmail.com" );
        // helly@gmail.com

    }

    public static String getUniqueId() {
        return String.format("%s_%s", UUID.randomUUID().toString().substring(0, 5), System.currentTimeMillis() / 1000);
    }

    // no faker with unigue id
    public static String generateEmail2(){
        return String.format("%s@%s",getUniqueId(),"gmail.com" );
        // helly@gmail.com

    }

    // partialy faker and hardcoded genereator
    public static String generateEmail3(){
        return String.format(randomFirstName()+"_"+ randomLastName() + "@gmail.com");
    }

    public static String generateEmail4() {

        String regex = "\\w{10}\\@gmail\\.com";
        return new Generex(regex).random();
    }


    //without faker
    public static String generateEmail5(int a){
        return String.format(getAlphaNumericString(a) + "@gmail.com");
    }

    //without faker
    public static String generateEmail6(int a){
        return String.format(printRandomString(a) + "@gmail.com");
    }

    //without faker
    public static String generatePassword5(int a){
        return String.format(getAlphaNumericString(a));
    }
    //without faker
    public static String generatePassword6(int a){
        return String.format(printRandomString(a));
    }










}
