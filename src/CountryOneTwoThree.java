import java.util.*;

public class CountryOneTwoThree {
    public static String countryOneTwoThree(int n) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";

        while (n > 0) {
            answer = numbers[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(countryOneTwoThree(1));
        System.out.println(countryOneTwoThree(2));
        System.out.println(countryOneTwoThree(3));
        System.out.println(countryOneTwoThree(4));
    }
}
