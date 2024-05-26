package hackerrank;

import java.util.*;
/*
Solution to find the most frequent number in a list
 */
public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
       Map<Integer,Integer> countMap=new HashMap<>();
        Integer maxFrequentId=Integer.MAX_VALUE;
        Integer maxCount=0;
       for(Integer id:arr){
           if(countMap.containsKey(id)){
               Integer newCount=countMap.get(id)+1;
               if(maxCount<=newCount){
                   maxCount=newCount;
                   if((countMap.get(maxFrequentId) !=null && maxCount>countMap.get(maxFrequentId))||(id<maxFrequentId))
                       maxFrequentId=id;
               }
               countMap.put(id, newCount);
           }else{
               countMap.put(id,1);
           }
       }

        return maxFrequentId;
    }
    public static void main(String[] args) {
        List<Integer> birdIds=Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 4, 3, 4);
        System.out.println("Result is "+migratoryBirds(birdIds));
    }
}
