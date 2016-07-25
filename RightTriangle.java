import java.util.Scanner;

/**
 * Created by saiteja on 7/20/16.
 */
public class RightTriangle {

  public static void DrawRightTriangle(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println(" ");
    }
  }

  public static void main(String args[]) {
    Scanner read = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = read.nextInt();
    DrawRightTriangle(n);
  }
}
