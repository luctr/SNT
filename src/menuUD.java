import java.util.Scanner;

public class menuUD {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Vẽ hình tam giác");
        System.out.println("2. Vẽ hình tam giác ngược");
        System.out.println("3. Vẽ hình vuông");
        System.out.println("4. Vẽ hình chữ nhật");
        System.out.println("0. Exit");
        System.out.println("Nhập hình lựa chọn : ");
        choice = sc.nextInt();
        helo(choice);
    }

    public static void helo(int choice) {
        switch (choice) {
            case 1:
                System.out.println("1. Vẽ hình tam giác");
                for (int i = 0; i <= 5; i++) {
                    for (int j =0;j<=i;j++){
                    System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("2. Vẽ hình tam giác ngược");
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                for (int i = 0; i <= 5; i++) {
                for (int j =0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
                break;

            case 3:
                System.out.println("3. Vẽ hình vuông");
                for (int i = 0; i < 4; i++) {
                    System.out.println("* * * * * ");
                }
                break;
            case 4:
                System.out.println("4. Vẽ hình chữ nhật");
                for (int i = 0; i < 4; i++) {
                    System.out.println("**************");
                }
                break;

            case 0:
                System.exit(0);
            default:
                System.out.println("no choice!");
        }
    }
}