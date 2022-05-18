package javaapplication;

public class MyProgram {
    public static void main(String[] args) {
        int num = 123456789, rev = 0;
        while(num != 0)
        {
            int remainder = num % 10;
            rev= rev * 10 + remainder;
            num = num/10;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}
