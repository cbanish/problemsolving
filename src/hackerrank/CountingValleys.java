package hackerrank;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        char[] paths=path.toCharArray();
        int valley=0;
        int step=0;
        for(int i=0;i<steps;i++){
            if(paths[i]=='U'){
                step+=1;
                if(step==0){
                    valley++;
                }
            }else if(paths[i]=='D'){
                step-=1;
            }
        }
        return valley;
    }
    public static void main(String[] args) {
        String path="UDDDUDUU";
        countingValleys(8,path);
    }
}
