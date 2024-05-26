package hackerrank;

import java.util.Arrays;
import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        int count=(int)a.stream().filter(item-> (item<=0)).count();
      if(count<k)
          return "YES";
      else
          return "NO";
    }

    public static void main(String[] args) {
        List<Integer> arrivalTimeList= Arrays.asList(2,1,0,1,2);
        System.out.println(angryProfessor(2,arrivalTimeList));
    }
}
