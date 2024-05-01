package hackerrank;

import java.util.*;

public class MoneySpent {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxMoney=0;
       for(int i=0;i<keyboards.length;i++){
           for(int j=0;j<drives.length;j++){
               int sum=keyboards[i]+drives[j];
               if(sum<=b && sum>maxMoney){
                   maxMoney=sum;
               }
           }
       }
       if(maxMoney==0){
           return -1;
       }
     return maxMoney;
    }

    public static void main(String[] args) {
        int[] keyboards={3,1};
        int[] drives={5,2,8};
        getMoneySpent(keyboards,drives,10);
    }
}
