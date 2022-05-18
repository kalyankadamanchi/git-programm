package Methodoverloadoverride;

public class Overloading {
    private void  show(float a,float b){

        System.out.println(+a  +b);
    }
     private void  show(int c, double d){

        System.out.println(+c  +d);
    }

    public static void main(String[] args) {
        Overloading ol=new Overloading();
        ol.show(2.54f,3.45f);
        ol.show(250,12.456);
    }

}
