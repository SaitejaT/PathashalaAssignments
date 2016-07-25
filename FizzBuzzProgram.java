/**
 * Created by saiteja on 7/20/16.
 */
public class FizzBuzzProgram {
    public static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0)
                    System.out.print("Fizz");
                if (i % 5 == 0)
                    System.out.print("Buzz");
            } else
                System.out.print(i);
            System.out.println();
        }
    }

    public static void main(String args[]) {
        FizzBuzz();
    }
}
