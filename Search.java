import java.rmi.*;

public interface Search extends Remote
{
    String query(String search) throws RemoteException;
}