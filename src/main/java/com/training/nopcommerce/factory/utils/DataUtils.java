package com.training.nopcommerce.factory.utils;

import com.github.javafaker.Faker;

public class DataUtils {
    private static Faker faker;
    public static DataUtils getData(){
        return new DataUtils();
    }
    private DataUtils(){

        faker = new Faker();
    }
    public  static String getFirtName(){
        return faker.name().firstName();
    }
    public static  String getLastName(){

        return faker.name().lastName();
    }
    public static String getEmailAddress(){

        return faker.internet().emailAddress();
    }
    public static String getFirstNameAddress(){

        return faker.address().firstName();
    }
    public static String getPhoneNumber(){

        return faker.phoneNumber().phoneNumber();
    }
    public static String getCity(){

        return faker.address().city();
    }
    public static String getRandomDOB() {
        Faker faker = new Faker();
        String dob = faker.date().birthday().toString();
        return dob.toString();
    }
}
