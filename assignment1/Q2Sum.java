import java.sql.SQLOutput;
import java.util.Scanner;

public class Q2Sum
{
    static int sum()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a =input.nextInt();
        System.out.print("Enter Second number : ");
        int b =input.nextInt();
        int Add;

        return Add=a+b;
    }

    public static void main(String[] args) {

        System.out.println("Sum is " + sum());
    }
}
