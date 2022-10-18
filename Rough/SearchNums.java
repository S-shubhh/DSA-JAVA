public class SearchNums
{
    public static void main(String[] args)
    {
        int n= 4234383;
        int count =0;
        int rem;
        while(n>0)
        {
            rem = n % 10;
            if (rem == 3)
            {
                count++;
            }

                n = n / 10;


        }
        System.out.println("No of times 3 is present in number is :" + count);

    }
}
