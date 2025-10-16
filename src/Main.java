import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        //task1.

        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("enter second number");
        int num2 = input.nextInt();
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println(num1 + "mod" + num2 + "=" + (num1 / num2));

        //task2.
        System.out.println("input number");
        int number = input.nextInt();
        System.out.println("multiplication" + number);
        for (int i = 1; i <= number; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
        //task3.

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println(perimeter);
        System.out.println(area);

        //task4.
        System.out.println("enter integer number");
        int count = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.println("enter integer  number");
            int num = input.nextInt();
            sum += number;
        }
        double averge = sum / count;
        System.out.println("averge: " + averge);


        //task5.

        System.out.println("enter first number: ");
        int number1 = input.nextInt();
        System.out.println("enter second number:");
        int number2 = input.nextInt();
        System.out.println("enter three number: ");
        int number3 = input.nextInt();
        boolean result = (number1 + number2 == number3);
        System.out.println("result: " + result);

        //task6.
        System.out.println("enter word");
        String word = input.next();
        String Reverse = " ";
        for (int i = 0; i < word.length(); i++) {

            Reverse += word.charAt(i);
            System.out.println(Reverse);
        }
        //task7.
        System.out.println("enter number");
        int numberr = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        //task8.
        System.out.println("enter temperature");
        double temperature = input.nextDouble();
        double Fahrenheit = (temperature * 9 / 5) + 32;
        System.out.println("fahrenheit " + Fahrenheit);

        //task9.

        System.out.print("enter a string: ");
        String userString = input.nextLine();
        System.out.print("enter a number: ");
        int index = input.nextInt();
        if (index >= 0 && index < userString.length()) {
            char resultt = userString.charAt(index);
            System.out.println("Character at index " + index + " is: " + result);
        } else {
            System.out.println("Error: Index out of bounds!");


            //task10
            double width = 5.5;
            double height = 8.5;
            double erea = width * height;
            double Perimeter = 2 * (width * height);
            System.out.println("erea: " + erea);
            System.out.println("Perimeter: " + Perimeter);
            //task11
            System.out.println("enter number");
            int numbr = input.nextInt();
            int numm1 = input.nextInt();
            int numm2 = input.nextInt();
            {
            }
            if (num1 < num2) {
                System.out.println(num1 + "<" + num2);
            }
            if (num1 <= num2) {
                System.out.println(num1 + "<=" + num2);
            }
            if (num2 != num1) {
                System.out.println(num2 + "!=" + num1);
            }
            //task12.

            System.out.print("Input seconds: ");
            int totalSeconds = input.nextInt();
            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;
            System.out.println(hours);
            System.out.println(minutes);
            System.out.println(seconds);


            //task13
            System.out.println("enter  number1");
            int nuumber1 = input.nextInt();
            System.out.println("enter  number2");
            int nuumber2 = input.nextInt();
            System.out.println("enter  number3");
            int nuumber3 = input.nextInt();
            if (number1 == number2 && number2 == number3) {

                System.out.println("number is equal  ");
            } else {
                System.out.println("number is not equal");
            }
            //task14
            System.out.println("enter number");
            int numbber = input.nextInt();
            if (number < 0) {
                System.out.println("positive");
            } else if (number > 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }

            //task15
            System.out.println("enter number");
            int nummber = input.nextInt();
            int positave = 1;
            int negetive = -1;
            int zero = 0;
            if (positave > 0) {
                System.out.println("the positive number");
            } else if (negetive < 0) {
                System.out.println("the negative number");
            } else if (zero < 0) {
                System.out.println("the zero number");
            }
            //task16.

            System.out.print("Enter integer: ");
            int numbeer = input.nextInt();
            int reversed = 0;

            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }

            System.out.println("Reversed number: " + reversed);
            //tasl17.

            int nnumber;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while (true) {
                System.out.print("Enter  number (enter -999 to stop): ");
                number = input.nextInt();
                if (number == -999) {
                    break;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
            System.out.println(max);
            System.out.println(min);
            //task18

            System.out.println("enter string");
            String input2 = Scanner.nextLine();

            int countt = 0;
            for (int i = 0; i < input2.length(); i++) {
                if (input2.charAt(i) == 'a' || input2.charAt(i) == 'A') {
                    count++;
                }
            }
            System.out.println("number of" + count);
        }
    }
}









