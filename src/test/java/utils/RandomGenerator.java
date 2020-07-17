package utils;

import com.github.javafaker.Faker;

public class RandomGenerator {

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










}
