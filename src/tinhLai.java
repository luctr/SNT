import java.util.Scanner;

public class tinhLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập số tiền gửi");
        double deposits = sc.nextDouble();
        System.out.println(" tỈ lệ lãi");
        double interestRate = sc.nextDouble();
        System.out.println("số tháng đã gửi");
        int monthSent = sc.nextInt();

        double total = 0;
        for (int i = 0; i < monthSent; i++) {
            total += deposits * (interestRate / 100) / 12 * monthSent;
        }
        System.out.println(total + " số tiền lãi ");

    }
}
