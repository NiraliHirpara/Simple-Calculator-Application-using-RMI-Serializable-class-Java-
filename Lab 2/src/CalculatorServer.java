import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/*
 	           Author Name : Nirali Hirpara
     Professor's full name : Prof. Tevin Apenteng
	Assignment Description : Lab 2 - RMI Application using Serializable class
         Class Description : Server class to provide service for the request given by the client.
           Submission Date : 22 Jan 2019
*/


public class CalculatorServer {

    public static void main(String args[]) {

        // Create the object implemtation
        try {
            LocateRegistry.createRegistry(1299);
            Calculator obj = new CalculatorImpl();
            // Bind this object instance to the name "HelloServer"
            Naming.rebind("rmi://localhost:1299/CalculatorServer", obj);
            System.out.println("CalculatorServer bound in registry");

        } catch (Exception e) {
            System.out.println("CalculatorServer err: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
