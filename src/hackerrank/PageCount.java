package hackerrank;

public class PageCount {
    public static int pageCount(int n, int p) {
        int forwardDiff=p;
        int reverseDiff=n-p;
        int flipCount=0;
        if(forwardDiff<reverseDiff){
            int i=1;
            if(i==p)
                return flipCount;
            while(i<n){
                flipCount+=1;
                if(p==i+1 || p==i+2){
                    return flipCount;
                }
                i=i+2;
            }
        }else{
            int j=n;
            if(j==p || j-1==p)
                return flipCount;
            while(j>1){
                flipCount+=1;
                if(p==j-2 || p==j-3){
                    return flipCount;
                }
                j=j-2;
            }
        }
        return flipCount;
    }

    public static void main(String[] args) {
        System.out.println("Number of flips required is "+pageCount(6,5));
    }
}
