import java.util.Scanner;

public class Prime_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHập số lượng số nguyên tố cần in ra");
        int number = scanner.nextInt();
        int index = 0;
        int i = 0;
        while (i < number) {
            if (checkPrime(index)) {
                i++;
                System.out.println(index);
            }
            index++;
        }
    }

    public static boolean checkPrime(int num) {
        if (num < 2) {
          return false;
        }
        for (int i = 2; i <= Math.sqrt(num);i++) {
            if (num % i  == 0 ) {
                return false;
            }
        }
        return true;
    }
}
