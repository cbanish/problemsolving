package hackerrank;

public class RecursiveCalculation {
    public static int chocolateFeast(int n, int c, int m) {
        int initialChoc=n/c;
        return calculate(initialChoc,m,initialChoc);
    }

    private static int calculate(int initialChoc, int m, int total){
        if(initialChoc<m){
            return total;
        }
        int additionalChoc = initialChoc/m;
        int remainderWrapper = additionalChoc+initialChoc%m;
        total=total+additionalChoc;
        return calculate(remainderWrapper,m,total);
    }

    public static void main(String[] args) {
        System.out.println("Total chocolates "+chocolateFeast(12,4,4));
    }
}
