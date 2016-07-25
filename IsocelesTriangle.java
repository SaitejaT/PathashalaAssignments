import java.util.Scanner;

/**
 * Created by saiteja on 7/20/16.
 */
public class IsocelesTriangle {

  public static void DrawIsocelesTriangle(int n) {
    int no_of_stars = 1, no_of_spaces = n - 1;
    for (int i = 0; i < n; i++) {
      for (int j = no_of_spaces; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = no_of_stars; k > 0; k--) {
        System.out.print("*");
      }
      no_of_stars += 2;
      no_of_spaces--;
      System.out.println();
    }
  }

  public static void main(String args[]) {
    Scanner read = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = read.nextInt();
    DrawIsocelesTriangle(n);
  }
}
