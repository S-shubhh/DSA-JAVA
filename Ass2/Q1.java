//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int check = input.nextInt();

        if (check%2==0)
        {
            System.out.println("Number is even");
        }

            else
                System.out.println("Number is odd");


    }

}

