/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmidemo;
import java.rmi.*;
import java.rmi.server.*;
public class FactorialRemote extends UnicastRemoteObject implements Factorial {
    FactorialRemote()throws RemoteException{
        super();
    }
    public int fact(int x)
    {
        if(x==0){
             return 1;
            
        }
        else{
            return (x*fact(x-1));
        }
    }
    
}