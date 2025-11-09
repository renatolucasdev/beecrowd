import java.util.Scanner;

public class BEE1005 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        double A, B, MEDIA;
        A = kb.nextDouble();
        B = kb.nextDouble();
        MEDIA = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        kb.close();
    }
}
