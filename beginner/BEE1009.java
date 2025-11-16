import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double fixedSalary, totalSold, finalSalary;

        scanner.nextLine();
        fixedSalary = scanner.nextDouble();
        totalSold = scanner.nextDouble();
        finalSalary = fixedSalary + (totalSold * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", finalSalary);
        scanner.close();

    }
}
