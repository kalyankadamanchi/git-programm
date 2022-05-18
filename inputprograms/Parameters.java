package inputprograms;

public class Parameters {
    public static void main(String[] args) {
        Parameters obj=new Parameters();
        obj.sum(100,200);

        float x;
        x=add(2.30f,30.24f);
        System.out.println(""+x);

        doublex(5.102,2.145);

    }
    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    public static float add(float c,float d){
         float add=c+d;
        return add;
    }
    public static void doublex(double p,double q){
        double  f= p%q;
        System.out.println(""+f);

        
    }
}
