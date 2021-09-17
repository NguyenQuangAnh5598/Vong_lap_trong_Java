import java.util.Scanner;

public class Uoc_so_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = Math.abs(scanner.nextInt());
        System.out.println("Enter b: ");
        int b = Math.abs(scanner.nextInt());
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a>b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
