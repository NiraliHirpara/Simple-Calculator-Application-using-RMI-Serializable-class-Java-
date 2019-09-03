
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 	           Author Name : Nirali Hirpara
     Professor's full name : Prof. Tevin Apenteng
	Assignment Description : Lab 2 - RMI Application using Serializable class
         Class Description : Class to invoke Command Serializable class.
           Submission Date : 22 Jan 2019
*/


public interface Calculator extends Remote{

    public double calculate (Command cmd) throws RemoteException;

}
