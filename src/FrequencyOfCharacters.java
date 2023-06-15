public class FrequencyOfCharacters {


    public static void main(String[] args) {

// String -- Frequency of Characters
//Write a return method that can find the frequency of characters
//Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        System.out.println(frequencyOfCharacters("AAABBCDD"));


    }

    public static String frequencyOfCharacters(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch){
                    count++;
                }
            }

            if (result.contains(""+ch)){
                continue;
            }

            result += "" + ch + count;
        }


        return result;
    }

}
