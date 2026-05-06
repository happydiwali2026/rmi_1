import java.rmi.*;
import java.rmi.registry.*;

public class SearchServer
{
    public static void main(String args[])
    {
        try
        {
            Search obj = new SearchQuery();

            LocateRegistry.createRegistry(1900);

            Naming.rebind("rmi://localhost:1900/geeksforgeeks", obj);

            System.out.println("Server Ready");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}