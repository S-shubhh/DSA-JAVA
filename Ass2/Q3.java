import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal amount : ");
        int Prin = input.nextInt();
        System.out.print("Enter Rate of Intrest : ");
        float Rate = input.nextFloat();
        System.out.print("Enter Time Period : ");
        int Time = input.nextInt();

        System.out.println("Simple intrest is  " + (Prin*Rate*Time)/100);
    }
}
