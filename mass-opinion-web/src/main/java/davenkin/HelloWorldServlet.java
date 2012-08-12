package davenkin;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class HelloWorldServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        try
        {
            Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
            props.put(Context.PROVIDER_URL, "localhost:1099");
            props.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
            System.out.println("Properties ok");
            Context ctx = new InitialContext(props);
            System.out.println("context ok");
            ctx = (Context)ctx.lookup("java:comp/env");
//            HelloWorldHome home = (HelloWorldHome)ctx.lookup("helloWorldBeanJndi");
            HelloWorldHome home = (HelloWorldHome)ctx.lookup("ejb/hello");

            System.out.println("home ok");
            HelloWorldRemote remote = home.create();
            System.out.println("remote ok");
            String a = req.getParameter("text1");
            String s = remote.sayHelloWorld(a);
            System.out.println(s);
            out.println(s);
        } catch (Exception e)
        {
            System.out.println("" + e);
        }
    }
}
