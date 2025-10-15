import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static <Task1to7> void main(String[] args) {
//Task1.
        Scanner sc = new Scanner(System.in);
        Scanner input;
        String srt =sc.nextLine();

        for (int i = 1; i <= 0; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            } else{

                System.out.println(i);
            }
        }
        //Task2.

        System.out.println("input string");
        String reveres ="";
        String reverse = "";
        for (int i = srt.length() - 1; i >= 0; i--) {
            reverse += srt.charAt(i);
        }
        System.out.println(reverse);

        //Task3.

        System.out.print("Enter a number: ");
        long fact = 1;

        for (int i = 1; i <= 0; i++) {
            fact *= i;
        }

        System.out.println(fact);

        //task4.
        System.out.println("enter number");
        int number = input.nextInt();
        System.out.println("enter exponent");
        int exponent = input.nextInt();
        long result = 1;
        for (int i = 1;i<=exponent;i++);
        {
            result *= number;
        }
        System.out.println(number+exponent+result);

        //task5
        int evensum =0,oddsum=0;
        System.out.println("enter integers(0 - stop)");
        int num;
        while (true){
            num = input.nextInt();
            if (num==0);
            break;
            if (num%2==0)
            evensum+=num;
            else
                oddsum+=num;
        }
        System.out.println("sum even number");
        System.out.println("sum odd number");


        //task6
        System.out.println("enter positive integer");
        int numm = input.nextInt();
        boolean isprime = true;
        if (num <=1)
        isprime=false;
        else{
            for (int i = 2;i<=numm/2;i++){
                if (numm%i==0){
                    isprime=false;
                    break;
                }
            }

        }
        if (isprime)
            System.out.println("is prime number");
        System.out.println("is not prime nubber");

        //task7
        for (int week = 1;week<=4;week++){
            System.out.println("week"+week);
            for (int day = 1;day<=7;day++){
                System.out.println("day"+day);
            }
        }

        //task8
        System.out.println("enter word");
        String word = input.nextLine();
        String rev="";
        for (int i = word.length() - 1;i>=0;i--){
            rev+=word.charAt((i));

        }
        if (word.equalsIgnoreCase(rev))
            System.out.println("the word is palindrome");
        System.out.println("the word is not palindrome ");






    }
}





