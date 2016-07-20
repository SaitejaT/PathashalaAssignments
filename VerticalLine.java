/**
 * Created by saiteja on 7/20/16.
 */
import java.util.Scanner;
public class VerticalLine {

    public static void DrawLineWithAsterisk(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("*");
        }
    }
    public static void main(String args[])
    {
        Scanner read  = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = read.nextInt();
        DrawLineWithAsterisk(n);
    }
}
