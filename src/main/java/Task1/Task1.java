package Task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }else {
            System.out.println("Попробуйте еще раз,число неправильное");
        }
    }
}
