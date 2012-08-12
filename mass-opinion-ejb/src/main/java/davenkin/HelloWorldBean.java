package davenkin;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;

public class HelloWorldBean implements SessionBean
{
    public String sayHelloWorld(String name) throws RemoteException
    {
        return "Hello World from " + name;
    }


    public void ejbCreate() throws EJBException, RemoteException
    {
    }

    public void ejbActivate() throws EJBException, RemoteException
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ejbPassivate() throws EJBException, RemoteException
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ejbRemove() throws EJBException, RemoteException
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
