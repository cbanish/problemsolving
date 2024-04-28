package hackerrank;

import java.util.Arrays;
import java.util.List;

public class KangarooLocation {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        int k1Position=x1+v1;
        int k2Position=x2+v2;
        if(k1Position==k2Position){
            return "YES";
        }
        for(int i=0;i<10000;i++){
            k1Position=k1Position+v1;
            k2Position=k2Position+v2;
            if(k1Position==k2Position){
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        kangaroo(0,3,4,2);
    }
}
