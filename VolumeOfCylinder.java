import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println(Math.PI * radius * radius * height);
    }
}
