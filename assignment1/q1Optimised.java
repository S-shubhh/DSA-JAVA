import java.util.Scanner;

public class q1Optimised
{

    static boolean checkyear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 4 == 0)
            return true;
        if (year % 100 != 0)
            return false;
        else
            return false;
    }

    public static void main(String[] args) {
        boolean check = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        System.out.println(checkyear(year)?"Leap year" :"Common year");

    }




    }

