import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        int count = 0;
    if (n <= 1) {
      System.out.println("Not Prime Number");
      return;
    }

    // Do a for loop
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    if (count > 1) {
        System.out.println("Not Prime Number");
    }
    else {
      System.out.println("Prime number");
    }
  }
}

