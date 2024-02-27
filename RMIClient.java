package depot3 ;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Récupération du stub du serveur depuis le registre
            Registry registry = LocateRegistry.getRegistry("localhost");
            RMIServerInterface stub = (RMIServerInterface) registry.lookup("RMIServer");

            // Appel de la méthode distante
            String response = stub.processString("Hello from client");

            // Affichage de la réponse
            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
