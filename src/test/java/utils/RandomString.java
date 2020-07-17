package utils;

import com.github.javafaker.Faker;
import com.mifmif.common.regex.Generex;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.UUID;

public class RandomString {


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


    static String printRandomString(int n) {
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
        email = temp.substring(0, temp.length() - 9) + "@gmail.com";
        return email;
    }

    public static String emailGenerater() {

        String regex = "\\w{10}\\@gmail\\.com";
        return new Generex(regex).random();
    }

    public static String getUniqueId() {
        return String.format("%s_%s", UUID.randomUUID().toString().substring(0, 5), System.currentTimeMillis() / 1000);
    }


    public static String generateMailinatorEmail() {
        return String.format("%s@%s", getUniqueId(), "gmail.com");
    }

    public static String randomEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String randomName(int n) {

        Faker faker1 = new Faker(new Random(n));
        return faker1.name().firstName();
    }
    public static String randomLastName(int n) {

        Faker faker1 = new Faker(new Random(n));
        return faker1.name().lastName();
    }

    public static String randomStreetName() {
        Faker faker = new Faker();
        return faker.address().streetName();
    }

    public static String randomBuildingNumber() {
        Faker faker = new Faker();
        return faker.address().buildingNumber();
    }

    public static String randomCity() {
        Faker faker = new Faker();
        return faker.address().city();
    }

    public static String randomCountry() {
        Faker faker = new Faker();
        return faker.address().country();
    }


    public static String getEmailGenerater(int a, int b ){
        return String.format("%s@%s", randomName(a)+"_"+randomLastName(b), "gmail.com");
    }

    @Test
    public void Test1() {
        // Get the size n
        int n = 5;
        // Get and display the alphanumeric string
        System.out.println("1 " + getAlphaNumericString(n));

        System.out.println("2 " + printRandomString(n));

        System.out.println("3 " + generateRandomEmail(20));
        System.out.println("4 " + emailGenerater());
        System.out.println("5 " + generateMailinatorEmail());
        System.out.println("6 " + randomEmail());
        System.out.println("7 " + randomName(5));
        System.out.println("8 " + getEmailGenerater(2,3));
        System.out.println("9 " + randomStreetName());


    }


}
