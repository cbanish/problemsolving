package hackerrank;

import java.util.*;

public class ApplesOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
       int appleCount=0;
       int orngCount=0;
        for(Integer apple: apples){
           int applePosition = a+apple;
           if(checkWithinRange(s,t,applePosition)){
               appleCount++;
           }
       }
        for(Integer orng: oranges){
            int orngPosition = b+orng;
            if(checkWithinRange(s,t, orngPosition)){
                orngCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orngCount);
    }

    private static boolean checkWithinRange(int start, int end, int number){
        if(number>=start && number<=end){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> apples= Arrays.asList(2,3,-4);
        List<Integer> oranges= Arrays.asList(3,-2,-4);
        countApplesAndOranges(7,10,4,12,apples,oranges);
    }
}
