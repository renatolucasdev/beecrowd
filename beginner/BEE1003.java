import java.util.Scanner;

public class BEE1003 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int A, B, SOMA;
        A = kb.nextInt();
        B = kb.nextInt();
        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
        kb.close();
    }

}
