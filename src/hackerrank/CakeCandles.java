package hackerrank;

import java.util.*;

public class CakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int max = 0;
        for (Integer candle : candles) {
            int count=1;
            max =Math.max(max,candle);
            if(map.containsKey(candle)){
                map.put(candle,map.get(candle)+1);
            }else{
                map.put(candle,count);
            }
        }
        return map.get(max);
    }

    public static void main(String[] args) {
        List<Integer> candles=Arrays.asList(4,4,1,3);
       int result= birthdayCakeCandles(candles);
    }
}
