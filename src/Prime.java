import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 số vào đây: ");
        int number = scanner.nextInt();
        int count = 0;
        if (number < 2) {
            System.out.println(number + " không phải là số nguyên tố");
        }
        for (int i = 2; i < Math.sqrt(number);i++) {
            if (number % i  == 0 ) {
                System.out.println(number + " không phải số nguyên tố");
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(number + " là số nguyên tố");
        }

    }
}
