import java.util.Scanner;

public class BEE1006 {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        double A, B, C, MEDIA;
        A = kb.nextDouble();
        B = kb.nextDouble();
        C = kb.nextDouble();
        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);
        System.out.printf("MEDIA = %.1f\n", MEDIA);
        kb.close();
    }
}
