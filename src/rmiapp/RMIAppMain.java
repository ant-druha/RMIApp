/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiapp;

/**
 *
 * @author Andrey
 */
public class RMIAppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(System.getProperty("java.class.path"));
        //System.out.println(System.getProperty("java.rmi.codebase"));
        //RMIServerForm.main(args);
        RMIServerForm f = new RMIServerForm();
        f.setVisible(true);
        f.createRemote();
//        RMIClientForm cl = new RMIClientForm();
//        cl.setVisible(true);
//        cl.makeRemoteCall();
        RMIClientForm.main(args);
    }
}
