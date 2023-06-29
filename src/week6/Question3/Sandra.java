package week6.Question3;

public class Sandra {

    public static int sumOfTheDigits(String str){

        int sum = 0;


        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))){
                sum = sum+Character.getNumericValue(str.charAt(i));
            }else{
                continue;
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfTheDigits("A3322v15"));
    }

}
