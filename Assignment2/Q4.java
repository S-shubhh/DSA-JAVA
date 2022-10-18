//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two number : ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Enter operator A for + , B for -,C for * and d /");
        char ch =input.next().charAt(0);
         if (ch=='A')
             System.out.println(a+b);
         if (ch=='B')
             System.out.println(a-b);
         if (ch=='C')
             System.out.println(a*b);
          else if (ch=='D')
          {
              System.out.println(a/b);
          }

          else
             System.out.println("Enter valid character");





    }
}
