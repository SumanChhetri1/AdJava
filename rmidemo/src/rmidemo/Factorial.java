/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmidemo;

import java.rmi.*;
public interface Factorial extends Remote{
    public int fact(int x)throws RemoteException;
}
