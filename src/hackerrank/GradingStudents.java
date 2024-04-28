package hackerrank;

import java.util.*;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> outputGrades=new ArrayList<>();
        for(int i=0;i<grades.size();i++){
            int item= grades.get(i);
            int mod= item%5;
            if(mod <=2){
                outputGrades.add(item);
            }else{
                if(item>=38) {
                    item = item + (5 - mod);
                }
                outputGrades.add(item);
            }
        }
    return outputGrades;
    }

    public static void main(String[] args) {
        List<Integer> grades=Arrays.asList(73,67,38,33);
        gradingStudents(grades);
    }
}
