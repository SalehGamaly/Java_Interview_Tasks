package week6.Question1;

public class Sandra {

    public static void main(String[] args) {

        System.out.println(validOrNot("Sandra2009*"));
    }

    public static boolean validOrNot (String input) {


        int upperLetter = 1;
        int lowerLetter = 1;
        int digits = 1;
        int special = 1;




        int upperCount = 0;
        int lowerCount = 0;
        int digitsCount = 0;
        int specialCount = 0;

        if (input.length() < 6) { // 1. Password MUST be at least have 6 characters and should not contain space,
            return false;
        }

        if (input.contains(" ")){
            return false;
        }

            for (int i = 0; i < input.length(); i++) {

                char ch = input.charAt(i);

                if (Character.isUpperCase(ch)){
                    upperCount++;
                } else if (Character.isDigit(ch)) {
                    digitsCount++;
                }else if (Character.isLowerCase(ch)){
                    lowerCount++;
                } else if (!(Character.isDigit(ch) && Character.isLetter(ch))) {
                    specialCount++;
                }

            }

            if (upperCount >= upperLetter && lowerCount >= lowerLetter && digitsCount>= digits && specialCount >= special){
                return true;
            }

            return false;
        }

        //    Password Validation Task:
        //  Write a return method that can verify if a password is valid or not. Requirements:
        //    1. Password MUST be at least have 6 characters and should not contain space,
        //    2. Password should at least contain one upper case letter,
        //    3. PassWord should at least contain one lowercase letter,
        //    4. Password should at least contain one special characters,
        //  5. Password should at least contain a digit.

        //if all requirements above are met, the method returns true, otherwise returns false.

    }
