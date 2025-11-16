import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radius, volume;
        radius = scanner.nextDouble();
        volume = (4.00/3) * 3.14159 * (radius * radius * radius);
        System.out.printf("VOLUME = %.3f\n", volume);
        scanner.close();
    }
}
