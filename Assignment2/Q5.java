import java.util.Scanner;

public class Q5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number :");
        int a = input.nextInt();
        int b= input.nextInt();

        if(a>b)
            System.out.println("First number is greater  ");
        else
            System.out.println("Second is greater");
    }
}
