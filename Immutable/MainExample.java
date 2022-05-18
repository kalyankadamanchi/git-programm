package Immutable;

public class MainExample {
    public static void main(String[] args) {
        ImmutabilityExample immu =new ImmutabilityExample("kalyan",25,"9876543210");
        System.out.println(immu.getName());
        System.out.println(immu.getAge());
        System.out.println(immu.getPhoneNo());
    }
}
