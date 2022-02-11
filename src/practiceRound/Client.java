package practiceRound;

import java.util.Arrays;
import java.util.LinkedList;

public class Client { //class representing a client

    int ID;
    String[] likes;
    String[] dislikes;

    public Client(int id, String[] l, String[] d) {
        ID = id;
        likes = l;
        dislikes = d;

    }

    @Override
    public String toString() {
        return "Client{" +
                "ID=" + ID +
                ", likes=" + Arrays.toString(likes) +
                ", dislikes=" + Arrays.toString(dislikes) +
                "}\n";
    }
}
