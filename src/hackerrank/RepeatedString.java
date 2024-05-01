package hackerrank;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        long repeatedCount=0L;
       int len=s.length();
       long quotient =n/len;
       int rem = (int) (n%len);
        int count=countLetters(s,'a');

        repeatedCount=count*quotient+ countLetters(s.substring(0,rem),'a');
     return repeatedCount;
    }
    private static int countLetters(String s, char find){
        char[] ch=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==find){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("repeated string count: "+repeatedString("abcac",12));
    }
}
