package depot3 ;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Création de l'objet serveur
            RMIServerImpl server = new RMIServerImpl();

            // Export de l'objet serveur
            RMIServerInterface stub = (RMIServerInterface) UnicastRemoteObject.exportObject(server, 0);

            // Démarrage du registre RMI sur le port par défaut (1099)
            Registry registry = LocateRegistry.createRegistry(1099);

            // Publication du stub dans le registre
            registry.rebind("RMIServer", stub);

            System.out.println("Server is running...");
        } catch (RemoteException e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
