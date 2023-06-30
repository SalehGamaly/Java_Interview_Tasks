package JavaTasks.week6.Question1;

public class Leena {
    /*
    Password Validation Task:
  Write a return method that can verify if a password is valid or not. Requirements:
    1. Password MUST be at least have 6 characters and should not contain space,
    2. Password should at least contain one upper case letter,
    3. PassWord should at least contain one lowercase letter,
    4. Password should at least contain one special characters,
  5. Password should at least contain a digit.

if all requirements above are met, the method returns true, otherwise returns false.
     */

    public static boolean validPassword(String password) {

        if ((password.length() < 6) ||
                (password.contains(" ")) ||
                (!password.matches(".*[A-Z].*")) ||
                (!password.matches(".*[a-z].*")) ||
                (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) ||
                (!password.matches(".*\\d.*"))) {
            return false;
        }
        return true; // if all requirements are met
    }



}
