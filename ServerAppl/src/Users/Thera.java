package Users;

import java.net.Socket;

public class Thera {

    private Socket sock;
    //TODO Add attribut to define Skills to be able to match

    private int ID;
    private String name;

    public Thera(Socket s) {
        sock = s;

    }
}
