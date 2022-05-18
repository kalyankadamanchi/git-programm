package loops;

public class Loop {
    public static void main(String[] args) {
        for ( int k =0 ; k<=5 ; k++) {
            System.out.println("the k value is" + k);
        }
        int x=3;
        while( x <= 5) {
            System.out.println("the x value is" + x);
            break;
        }
        int a=6;
        do{
            System.out.println("the a value is " +a);
        }
        while(x>7);
    }
}
