/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiapp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Andrey
 */
public class DateTimeImpl extends UnicastRemoteObject 
implements DateTime {
    GregorianCalendar c = new GregorianCalendar();
    
    /**
     *
     * @param date
     */
    public DateTimeImpl() throws RemoteException 
    { }

    @Override
    public String getDate()  {
        c.setTime(new Date());
        return c.get(c.DAY_OF_MONTH) + "." + c.get(c.MONTH) + c.get(c.MONTH) 
                + "." + c.get(c.YEAR);
    }

    @Override
    public String getTime()  {
        c.setTime(new Date());
        return c.get(c.HOUR_OF_DAY) + ":" + c.get(c.MINUTE) + ":" + 
                            c.get(c.SECOND) + "." + c.get(c.MILLISECOND);
    }
    
    
    
}

