package hackerrank;

import java.util.Arrays;
import java.util.List;

public class BreakingRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        Integer max=scores.get(0);
        Integer min=scores.get(0);
        int maxChangeCnt=0;
        int minChangeCnt=0;
        for(int i=1;i<scores.size();i++){
            if(scores.get(i)>max){
                max=scores.get(i);
                maxChangeCnt++;
            }
            if(scores.get(i)<min){
                min=scores.get(i);
                minChangeCnt++;
            }
        }
        return Arrays.asList(maxChangeCnt,minChangeCnt);
    }

    public static void main(String[] args) {
        List<Integer> input=Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
        System.out.println("breakingRecords "+breakingRecords(input));
    }
}
