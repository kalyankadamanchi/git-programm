package loops;

public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            int n = (i < 8) ? i : 10 + 1 - i;
            for (int j = 1; j <= n; j++) {
                System.out.print(" ^ ");
            }
            System.out.println();
            /*for (int i = 0; i <=6; i++) {

             */
            for (int j = (7-i); j > 1; j--) {
                System.out.print(" ");
            }
            for ( int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        }
    }

