import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int productOneUnits, productTwoUnits;
        float productOneUnitPrice, productTwoUnitPrice, valueToPay;

        scanner.nextInt();
        productOneUnits = scanner.nextInt();
        productOneUnitPrice = scanner.nextFloat();
        scanner.nextInt();
        productTwoUnits = scanner.nextInt();
        productTwoUnitPrice = scanner.nextFloat();
        valueToPay = (productOneUnitPrice * productOneUnits) + (productTwoUnitPrice * productTwoUnits);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valueToPay);
        scanner.close();

    }
}
