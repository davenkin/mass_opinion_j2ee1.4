package davenkin;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface HelloWorldRemote extends EJBObject
{
    public String sayHelloWorld(String name) throws RemoteException;
}
