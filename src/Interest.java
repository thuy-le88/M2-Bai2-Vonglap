import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        double money=0;
        int month=1;
        double interest_rate=1.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số tiền cho vay: ");
        money=sc.nextDouble();
        System.out.println("Nhập vào số tháng cho vay: ");
        month=sc.nextInt();
        System.out.println("Nhập vào lãi suất theo năm: ");
        interest_rate=sc.nextDouble();
        double total_interest=0;
        //total_interest=money*month*interest_rate/100/12;
        for (int i=0;i<month;i++) {
            total_interest=money*interest_rate/100/12*month;
        }
        System.out.println("Tổng tiền lãi cho vay là: "+total_interest);
    }
}
