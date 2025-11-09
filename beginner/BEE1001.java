import java.util.Scanner;

public class BEE1001 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int A, B, X;
        A = kb.nextInt();
        B = kb.nextInt();
        X = A + B;
        System.out.println("X = " + X);
        kb.close();
    }    
}
