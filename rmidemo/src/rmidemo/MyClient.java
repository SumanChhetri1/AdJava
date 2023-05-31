/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmidemo;
import java.rmi.*;

public class MyClient {
    public static void main(String args[]){
        try{
            
            Factorial stub=(Factorial)Naming.lookup("rmi://localhost:5001/demo");
            System.out.println("The Output is: "+stub.fact(6));
        }catch(Exception e){
            System.out.println(e);

        }
    }
}
