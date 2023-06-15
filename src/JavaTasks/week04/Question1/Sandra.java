package JavaTasks.week04.Question1;

public class Sandra {



        public static boolean same(String str, String str2){


            str = str.toLowerCase();
            str2 = str2.toLowerCase();

            if (str.length() != str2.length()){
                return false;
            }

            for(int i = 0; i < str.length(); i++){
                if(str2.indexOf(str.charAt(i)) == -1)
                    return false;
            }
            for(int i = 0; i < str2.length(); i++){
                if(str.indexOf(str2.charAt(i)) == -1)
                    return false;
            }
            return true;

        }

    public static void main(String[] args) {

        System.out.println(same("tree", "reet"));

    }


}
