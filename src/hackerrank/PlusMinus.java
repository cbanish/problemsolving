package hackerrank;

import java.util.*;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int n = arr.size();
        for (Integer item : arr) {
            if (item > 0) {
                positive++;
            } else if (item < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        double p = (double)positive / n;
        double neg = (double)negative / n;
        double z = (double)zero / n;
        System.out.printf("%.6f\n",p);
        System.out.printf("%.6f\n",neg);
        System.out.printf("%.6f\n",z);

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(-10);
        arr.add(-20);
        arr.add(20);
        arr.add(0);
        plusMinus(arr);
    }

}

