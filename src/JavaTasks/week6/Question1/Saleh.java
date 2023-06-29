package JavaTasks.week6.Question1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Saleh {

    public static void main(String[] args) {
       //System.out.println("isValidPassword(\"hi1Pgj\") = " + isValidPassword("hdgsajchac/jdlk1M"));
    }

    public static boolean isValidPassword(String password){

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        if (password.length() < 6 || password.contains(" ")) {
            System.err.println("Password must have 6 characters and should not contain space");
            return false;
        }


        for (char eachChar : password.toCharArray()) {
            if (Character.isUpperCase(eachChar)) {
                hasUpperCase = true;
                break;
            }
        }
            if (!hasUpperCase) {
                System.err.println("Password must contain at least one uppercase character");
                return false;
            }


        for (char eachChar : password.toCharArray()) {
            if (Character.isLowerCase(eachChar)) {
                hasLowerCase = true;
                break;
            }
        }
            if (!hasLowerCase) {
                System.err.println("Password must contain at least one lowercase character");
                return false;
            }


        for (char eachChar : password.toCharArray()) {
            if (Character.isDigit(eachChar)) {
                hasDigit = true;
                break;
            }
        }
            if (!hasDigit) {
                System.err.println("Password must contain at least one digit");
                return false;
            }

        for (char eachChar : password.toCharArray()) {
            if (!Character.isDigit(eachChar) && !Character.isLetter(eachChar)) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            System.err.println("Password must contain at least one special character");
            return false;
        }

        return true;
    }
}


/*
1. Password Validation Task:

  Write a return method that can verify if a password is valid or not. Requirements:

    1. Password MUST be at least have 6 characters and should not contain space,
    2. Password should at least contain one upper case letter,
    3. PassWord should at least contain one lowercase letter,
    4. Password should at least contain one special characters,
    5. Password should at least contain a digit.

if all requirements above are met, the method returns true, otherwise returns false.
 */