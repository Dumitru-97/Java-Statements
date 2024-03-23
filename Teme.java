import java.util.Scanner;

public class Teme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int number = scanner.nextInt();
        if (number > 10) {
            System.out.println("Numarul este mai mare decat 10 ");
        }
    }
}
