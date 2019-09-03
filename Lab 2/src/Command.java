import java.io.Serializable;

/*
 	           Author Name : Nirali Hirpara
     Professor's full name : Prof. Tevin Apenteng
	Assignment Description : Lab 2 - RMI Application using Serializable class
         Class Description : Command serializable class to be invoked by Calculator class.
           Submission Date : 22 Jan 2019
*/

public class Command implements Serializable {

    private double num1;
    private char operator;
    private double num2;


    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
