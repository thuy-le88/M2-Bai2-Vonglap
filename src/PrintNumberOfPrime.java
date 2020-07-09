import java.util.Scanner;

public class PrintNumberOfPrime {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter numbers: ");
        int number = scanner.nextInt();
        System.out.printf("%d first prime numbers are: \n", number);
        int count = 0;
        int N = 2;
        while (count < number) {
            if (isPrimeNumber(N)) {
                System.out.println(" Prime number "+(count+1)+" is: "+N);
                count++;
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
