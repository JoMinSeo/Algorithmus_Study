import java.util.*;

public class CipherPassword {

    public static String cipherPassword(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++){
            int item = s.charAt(i);

            if(Character.isLowerCase(item)){
                item = item + n;
                if(item > 'z'){
                    item = item - 26;
                }
            }else if(Character.isUpperCase(item)){
                item = item + n;
                if(item > 'Z'){
                    item = item - 26;
                }
            }

            char item2 = (char)item;
            answer = answer.concat(Character.toString(item2));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(cipherPassword("z", 1));
    }
}
