import java.util.Scanner;
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

public class q5_sumn
{
    public static void main(String[] args)
    {
        int i=1;
        int sum=0;
        Scanner input = new Scanner(System.in);

        while (i!=0)
        {
            System.out.print("Enter a number or enter 0 to exit:");
            i = input.nextInt();
            sum=sum+i;

        }

        System.out.println(sum);

    }
}
