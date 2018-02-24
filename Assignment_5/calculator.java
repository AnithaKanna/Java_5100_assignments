import java.util.Scanner;
import javax.swing.JOptionPane;

public class javaCalculator 
{

    public static void main(String[] args) 
    {
        double num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
        num1 = input.nextInt();

        System.out.println("please enter the second number");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation");
        operation = op.next();

        if (operation == "+");
        {
            System.out.println("your answer is" + (num1 + num2));
        }
        if  (operation == "-");
        {
            System.out.println("your answer is" + (num1 - num2));
        }

        if (operation == "/");
        {
            System.out.println("your answer is" + (num1 / num2));
        }
        if (operation == "*")
        {
            System.out.println("your answer is" + (num1 * num2));
        }
        if(operation == "fahrenheit to celcius") {
            System.out.println("your answer is" + ((num1-32)*0.5556));
        }

        if (operation=="feet to inches"){
            System.out.println("your answer is" + (num1*12));
        }
         if (operation=="square the number"){
            System.out.println("your answer is" + (num1 * num1));
        }
         if (operation=="cube the number"){
            System.out.println("your answer is" + (num1 * num1 * num1));
         }
         if (operation=="square root of number"){
            System.out.println("your answer is" + (Math.sqrt(num1)));
         }


    }
}