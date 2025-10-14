import java.util.Scanner;

public class Main {
    public static <Task1to7> void main(String[] args) {
//Task1.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter role");
        String role = sc.nextLine();
        String r =role.toLowerCase();
        if(r.equals("admin")){
            System.out.println("welcome admin");
        }else if(r.equals("user")){
            System.out.println("welcome user");
        }else if(r.equals("supperuser")){
            System.out.println("welcome supperuser");
        }else
            System.out.println("unavailable");

//Task2.


        System.out.print("Input 1 number: ");
        int a = sc.nextInt();
        System.out.print("Input 2 number: ");
        int b = sc.nextInt();
        System.out.print("Input   3 number: ");
        int c = sc.nextInt();

        int greatest = a;
        if (b > greatest) greatest = b;
        if (c > greatest) greatest = c;

        System.out.println("greatest: " + greatest);
        sc.close();


        //Task3.
        System.out.print("number (1-7): ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid day");
        }
        //task4.
        System.out.print("anter gread: ");
        int gread = sc.nextInt();

        switch (gread / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");

        }

        //Task5.
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 13) {
            System.out.println("You are  Child.");
        } else if (age <= 19) {
            System.out.println("You are a Teenager.");
        } else {
            System.out.println("You are  Adult.");
        }







    }
}





