import java.util.Scanner;

public class BEE1007 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;
        A = kb.nextInt();
        B = kb.nextInt();
        C = kb.nextInt();
        D = kb.nextInt();
        DIFERENCA = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
        kb.close();
    }
}
