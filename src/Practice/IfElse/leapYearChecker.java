package Practice.IfElse;

public class leapYearChecker {
    public static void main(String[] args) {

        int year = 1904;

        if (year % 4 == 0) {

            System.out.println("This year is Leap Year");
        } else {
            System.out.println("This year is not a Leap Year");
        }
    }
}