package inputprograms;

import java.util.StringTokenizer;

public class examplestringmethods {
    public static void main(String[] args) {
       /* System.out.println("Name, age ,salary, address");
        Scanner obj=new Scanner(System.in);
        String Name=obj.toString();
        int age=obj.nextInt();
        int salary=obj.nextInt();
        String address=obj.toString();
        System.out.println(""+Name);
        System.out.println(""+age);
        System.out.println(""+salary);
        System.out.println(""+address);*/

       /* StringBuffer buffer = new StringBuffer("hello");
        char[] c = new char[]{'k', 'a', 'l', 'y', 'a', 'n'};
        buffer.append(c);
        System.out.println(buffer);

        StringBuilder sb = new StringBuilder("welcome");
        char[] ch = new char[]{'j', 'a', 'v', 'a'};
        sb.append(ch);
        System.out.println(sb);*/

       /* String s1 = "I am from nizamabad";
        System.out.println(s1);
        String replaceString = s1.replace("from", "in");
        System.out.println(replaceString);
        String[] words= s1.split("\\s");
        for ( String w:words){
            System.out.println(w);
        }
        StringBuilder sb1=new StringBuilder("I am going to my home");
        sb1.append(" kammarpally");
        System.out.println(sb1);
        sb1 =sb1.delete(13,21);
        sb1.reverse();

        System.out.println(sb1);
*/

        StringTokenizer s = new StringTokenizer("Hello Everyone  Have a nice day", " ");
        while (s.hasMoreTokens()) {
            System.out.println(s.nextElement());
        }
        System.out.println(s.countTokens());
    }
}

