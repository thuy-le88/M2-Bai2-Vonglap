import java.util.Scanner;
public class CheckPrime {
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if (num<2) {
            System.out.println(num+ " is not prime number.");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime number.");
                    break;
                }
                System.out.println(num + " is prime number.");
                break;
            }
        }
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number < 2)
            System.out.println(number + " is not a prime");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }
    }
}
