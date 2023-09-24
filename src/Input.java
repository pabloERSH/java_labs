import java.util.Scanner;

public class Input {
    static int num_int() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                return Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода!");
            }
        }
    }

    static double num_double() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                return Double.parseDouble(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода!");
            }
        }
    }
}
