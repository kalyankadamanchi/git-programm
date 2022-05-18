package javaapplication;

public class Array {
    public static void main(String[] args) {
        int[] age= {25,26,25,27,24};
        System.out.println("Kalyan:" +age[0]);
        System.out.println("vamshi:" +age[1]);
        System.out.println("Naresh:" +age[2]);
        System.out.println("Bhargav:" +age[3]);
        System.out.println("Ramprasad:" +age[4]);
//by using for loop
        for( int i=0; i< age.length; i++) {
            System.out.println(age[i]);
            break;
        }
//by using for each loop
            for (int a : age) {
                System.out.println(a);
            }
        }
    }
