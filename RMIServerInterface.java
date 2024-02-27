package depot3 ;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIServerInterface extends Remote {
    String processString(String input) throws RemoteException;
}
