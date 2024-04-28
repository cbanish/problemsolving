package hackerrank;

import java.util.*;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        long min=arr.get(0);
        long max=arr.get(0);
        long sum=0;
        for(int i=0;i<arr.size();i++){
            sum =sum + arr.get(i);
            if(arr.get(i) <min){
                min=arr.get(i);
            }
            if(arr.get(i) >max){
                max=arr.get(i);
            }
        }
        long minSum=sum-max;
        long maxSum=sum-min;
        System.out.print(minSum);
        System.out.print(" ");
        System.out.print(maxSum);

    }

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        miniMaxSum(list);
    }
}
