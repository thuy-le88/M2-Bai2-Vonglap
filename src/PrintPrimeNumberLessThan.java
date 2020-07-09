import java.util.Scanner;

public class PrintPrimeNumberLessThan {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter numbers: ");
        int number = scanner.nextInt();
        System.out.printf("Prime numbers less than %d are: \n", number);
        int N = 2;
        while (N < number) {
            if (isPrimeNumber(N)) {
                System.out.println(" Prime number is: "+N);
            }
            N++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <=Math.pow(n,0.5); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
