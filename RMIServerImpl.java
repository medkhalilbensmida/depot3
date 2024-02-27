package depot3;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServerImpl implements RMIServerInterface {
    protected RMIServerImpl() throws RemoteException {
        super();
    }

    @Override
    public String processString(String input) throws RemoteException {
        // Exemple de traitement simple : écho de la chaîne
        return "Server processed: " + input;
    }
}
