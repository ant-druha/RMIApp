/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiapp;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Andrey
 */
public interface DateTime extends Remote {
    
    String getDate () throws RemoteException;
    String getTime () throws RemoteException;

}
