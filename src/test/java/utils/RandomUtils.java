package utils;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;



public class RandomUtils {
    public static void main(String[] args) {
        System.out.println(randomString(10));
    }
    public static String randomString(int len){
        final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static String randomEmail() {
        return randomString(10) + "@tut.by";
    }

    public static String randomInt(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        String numToReturn = randomNum + "";
        return numToReturn;
    }

    public static String randomMonth() {
        String[] values = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int index = Integer.parseInt(randomInt(0 , values.length -1));
        return values[index];
    }
}
