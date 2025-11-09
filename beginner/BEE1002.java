import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        double A, R, n;
        R = kb.nextDouble();
        n = 3.14159;
        A = n * (R*R);
        System.out.printf("A=%.4f\n", A);
        kb.close();
    }
    
}
