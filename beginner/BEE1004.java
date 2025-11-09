import java.util.Scanner;

public class BEE1004 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int x,y, PROD;
        x = kb.nextInt();
        y = kb.nextInt();
        PROD = x * y;
        System.out.println("PROD = " + PROD);
        kb.close();
    }
}
