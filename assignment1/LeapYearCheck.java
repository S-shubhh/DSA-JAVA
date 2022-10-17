import java.util.Scanner;

//Enter a year and check whether a year is leap year or not
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();

//                conditions
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year / 100 != 0) {
            System.out.println(" Year is a Common year");
        } else {
            System.out.println(" Year is a Common year");
        }

    }
}
