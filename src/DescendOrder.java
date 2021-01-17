
import java.util.Arrays;

public class DescendOrder {
    public static long descendOrder(long n) {
        long answer = 0;

        String[] array = Long.toString(n).split("");
        String sortString = new String("");

        //문자열을 작은순으로 정렬
        Arrays.sort(array);

        for(int i = array.length - 1; i >= 0; i--){
            sortString += array[i];
        }

        answer = Long.parseLong(sortString);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(descendOrder(118372));
    }
}
