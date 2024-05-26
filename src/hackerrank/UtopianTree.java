package hackerrank;

public class UtopianTree {
    public static int utopianTree(int n) {
     int height=1;
     int i=1;
        while(i<=n){
            if(i%2 !=0)
                height=height*2;
            else
                height=height+1;
            i++;
        }
    return height;
    }

    public static int utopianTreeRecursive(int n) {
        return recursiveCalculation(5,1,1);
    }

    private static int recursiveCalculation(int n, int height, int i){
        if(i>n){
         return height;
        }
        if(i%2 !=0)
            height=height*2;
        else
            height=height+1;
        return recursiveCalculation(n,height,++i);
    }



    public static void main(String[] args) {
        int cycles=5;
        System.out.println("Utopian tree height after "+cycles+" is "+utopianTreeRecursive(cycles));
    }
}
