package hackerrank;

public class TimeConversion {
    public static String timeConversion(String s) {
        boolean isPM = s.endsWith("PM");

        int hours = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3, 5));
        int seconds = Integer.parseInt(s.substring(6, 8));

        if (isPM && hours != 12) {
            hours = hours+12;
        }
        else if (!isPM && hours == 12) {
            hours = 0;
        }

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        String input="11:05:45PM";
        String output=timeConversion(input);
        System.out.println(output);
    }
}
