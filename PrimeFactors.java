import java.util.Scanner;

/**
 * Created by saiteja on 7/20/16.
 */
public class PrimeFactors {
    public static boolean CheckIsPrime(int i)
    {
        for(int j=2;j<i/2;j++)
            if(i%j==0)
                return false;
        return true;
    }

    public static void generate(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                if(CheckIsPrime(i))
                    System.out.println(i);
        }

    }

    public static void main(String args[])
    {
        Scanner read  = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = read.nextInt();
        generate(n);
    }
}
