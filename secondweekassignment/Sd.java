package secondweekassignment;
import java.util.Scanner;

public class Sd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Railway Reservation:");
        System.out.print("Source:");
        String Source = scanner.next();
        System.out.print("Destination:");
        String Destination = scanner.next();
        System.out.println(Source + " to " + Destination);

        System.out.print("Enter passenger name :");
        String name = scanner.next();
        System.out.print("Gender:");
        String gender = scanner.next();
        System.out.print("Age:");
        int age = scanner.nextInt();
        System.out.print("MobileNumber:");
        long mobilenumber = scanner.nextLong();
        System.out.print("Email:");
        String email = scanner.next();

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(mobilenumber);
        System.out.println(email);

        String destination;
        System.out.print("Enter location : ");
        destination = scanner.next();
        switch (destination) {
            case "Warangal":
                System.out.println("General:"+100);
                System.out.println("Sleeper:" + 150);
                System.out.println("Ac:" + 200);
                break;
            case "Mumbai":
                System.out.println("General:" + 120);
                System.out.println("Sleeper:" + 180);
                System.out.println("Ac:" + 280);
                break;
            case "Tirupati":
                System.out.println("General:" + 200);
                System.out.println("Sleeper:" + 390);
                System.out.println("Ac :" + 450);
                break;
            case "Nizamabad":
                System.out.println("General :" + 100);
                System.out.println("Sleeper :" + 160);
                System.out.println("Ac :"+ 250);
                break;
            case "Khammam":
                System.out.println("General :" + 120);
                System.out.println("Sleeper:" + 250);
                System.out.println("Ac :" + 390);
                break;
        }
            System.out.print("enter the amount:");
            int accountbalance = scanner.nextInt();
            if (accountbalance >=100) {
                System.out.println("Ticket is confirmed");
            } else {
                System.out.println("Ticket is  not confirmed");
            }
        }
    }

