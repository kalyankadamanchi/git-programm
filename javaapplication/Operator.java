package javaapplication;

public class Operator {
    public static void main(String[] args) {
        //Arithmetic
        int k=18,l=18;
        System.out.println("k+l=" +(k+l));
        System.out.println("k-l=" +(k-l));
        System.out.println("k*l="+(k*l));
        System.out.println("k%l="+(k%l));
        System.out.println("k/l="+(k/l));
        //Unary
       int a=-30;
         System.out.println("" +a);
         //Assignment
        int b=42;
        b=78;
        System.out.println("=" +b);
        //Relation
        int c=20,d=30;
        System.out.println("" +c+ ""+d );
        System.out.println(c==d);
        System.out.println(c>d);
        System.out.println(c<d);
        System.out.println(c!=d);
        System.out.println(c>=d);
        System.out.println(c<=d);
        //Logical
        System.out.println((4 > 2) && (8 < 5));
        System.out.println((4 < 2) || (10 > 5));
        System.out.println(!(5 > 3));
        //Ternary
        int februaryDays=29;
        String x;
        x =(februaryDays==29)? "a leap year" : " not a leap year";
        System.out.println(x);
    }
}
