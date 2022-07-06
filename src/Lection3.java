import java.util.Scanner;

public class Lection3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int sum = first + second + third;
        String output = String.format("Сумма равна: %s", sum);
        System.out.println(output);

    }
}
