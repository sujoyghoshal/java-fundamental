import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println(2 * (length + width));
        scanner.close();
    }
}
