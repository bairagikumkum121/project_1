import java.util.Scanner;
//   prime Number 

public class prime_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int f = 0;
        int i = 0;
        System.out.println("Enter your digit");
        number = sc.nextInt();
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                f = f + 1;
            }
        }
        if (f == 1) {
            System.out.println(("number is  prime"));
        } else {
            System.out.println("number is  not prime");
        }

    }

}
