import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 	           Author Name : Nirali Hirpara
     Professor's full name : Prof. Tevin Apenteng
	Assignment Description : Lab 2 - RMI Application using Serializable class
         Class Description : Class to invoke Calculator class
           Submission Date : 22 Jan 2019
*/


public class CalculatorImpl extends UnicastRemoteObject implements Calculator {


    protected CalculatorImpl() throws RemoteException {
    }

    @Override
    public double calculate(Command cmd) throws RemoteException {

        double num1 = cmd.getNum1();
        char operator = cmd.getOperator();
        double num2 = cmd.getNum2();
        double result = 0;

        if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '/') {
            result = num1 / num2;
        }

        return result;
    }
}
