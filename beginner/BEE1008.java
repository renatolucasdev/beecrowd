import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int employeeNumber, workedHours;
        double hourlyWage, salary;
        employeeNumber = scanner.nextInt();
        workedHours = scanner.nextInt();
        hourlyWage = scanner.nextDouble();
        salary = workedHours * hourlyWage;
        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        scanner.close();
    }
}
