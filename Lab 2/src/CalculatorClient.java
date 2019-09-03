import java.rmi.Naming;
import java.io.*;
import java.util.Scanner;

/*
 	           Author Name : Nirali Hirpara
     Professor's full name : Prof. Tevin Apenteng
	Assignment Description : Lab 2 - RMI Application using Serializable class
         Class Description : Client class to make request for calculation
           Submission Date : 22 Jan 2019
*/

public class CalculatorClient {


    public static void main(String[] args) throws IOException {

        double num1;
        char sign;
        double num2;
        double result;
        String choice = "Yes";
        Scanner scan = new Scanner(System.in);

        //create commant object
        Command obj = new Command();

        CalculatorClient calculatorClient = new CalculatorClient();

        while (choice.equalsIgnoreCase("Yes")) {
            //User enter 1st number
            System.out.println("Enter 1st number :");
            num1 = scan.nextDouble();
            System.out.println();

            //User enter 2nd number
            System.out.println("Enter 2nd number :");
            num2 = scan.nextDouble();
            System.out.println();

            //User enter the operator
            System.out.println("Enter the operator :");
            sign = scan.next().charAt(0);
            System.out.println();

            //set the command object
            obj.setNum1(num1);
            obj.setOperator(sign);
            obj.setNum2(num2);

            result = calculatorClient.action(obj);

            //check if result is infinite
            if (Double.isInfinite(result)) {
                System.out.println("a number cannot be divided by 0");
            } else {
                System.out.println("Result: " + result);
                System.out.println();
            }

            System.out.println("Continue (Yes/No)?");
            choice = scan.next();
            System.out.println();

        }

        System.out.println("Client Stopped.");
    }

    // "obj" is the identifier that we'll use to refer
    // to the remote object that implements the "Calculator"
    // interface

    public double action(Command cmd) {
        Calculator cal = null;
        double answer = 0;
        try {
            cal = (Calculator) Naming.lookup("rmi://localhost:1299/CalculatorServer");
            answer = cal.calculate(cmd);
        } catch (Exception e) {
            System.out.println("Calculator Applet exception: " + e);
        }
        return answer;
    }


}
