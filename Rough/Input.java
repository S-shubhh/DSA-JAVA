import java.util.Scanner;

public class Input
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
        System.out.print("Enter the first value :");
        float First = input.nextFloat();
        System.out.print("Enter the Second value : ");
        float second = input.nextFloat();

        float sum = First + second;
        System.out.println("Sum is  : " + sum);






    }
}