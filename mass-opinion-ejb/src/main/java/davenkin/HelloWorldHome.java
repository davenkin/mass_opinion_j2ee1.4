package davenkin;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

public interface HelloWorldHome extends EJBHome
{
    public HelloWorldRemote create() throws RemoteException,CreateException;

}
