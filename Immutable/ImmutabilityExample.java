package Immutable;

final class ImmutabilityExample {
   private final String name;
    private final int age;
    private final String phoneNo;

    ImmutabilityExample(String name, int age, String phoneNo){
        this.name =name;
        this.age=age;
        this.phoneNo=phoneNo;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
