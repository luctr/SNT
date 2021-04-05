import java.util.Scanner;

public class soNguyenTo {
    public static void main(int number) {
//

        if (number < 2) {
            System.out.print(number + " is a not prime ");
        } else {
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
                System.out.println(number + " is a prime ");
            else
                System.out.println(number + " is not a prime ");
        }
    }

    static void s(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số kiểm tra");
        n = sc.nextInt();
        int count = 0;
        for (count=0;count<20;){

        }
    }
}
