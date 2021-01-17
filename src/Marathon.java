import java.util.Arrays;

/* 프로그래머스 : 완주하지 못한 선수 */
public class Marathon {

    public String marathon(String[] participant, String[] completion) {
        String answer = "";
        String temp = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;

        while (i < participant.length) {
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }else{
                i++;
            }
        }

        if(!temp.equals("")){
            answer = temp;
        }else{
            answer = participant[participant.length - 1];
        }

        return answer;
    }

}
