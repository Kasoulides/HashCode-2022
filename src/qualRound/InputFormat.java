package qualRound;

import practiceRound.Client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputFormat {


    public static String readAllData(String filePath) throws IOException {


        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    public static Contributor[] createContributor(String fileContent) {


        String[] lines = fileContent.split("\n");

        int noOfClients = Integer.parseInt(lines[0]);

        Contributor[] contributor = new Contributor[noOfClients];

        //System.out.println(lines[3]);

        for (int i = 0; i < noOfClients; i++) {
            String[] temp1 = lines[i + 1].split(" ", 2);
            String[] temp2 = lines[i + 2].split(" ", 2);

            String[] likes;
            String[] dislikes;

            if (temp1[0].equals("0")) {
                likes = null;
            } else {
                likes = temp1[1].split(" ");
            }

            if (temp2[0].equals("0")) {
                dislikes = null;
            } else {
                dislikes = temp2[1].split(" ");
            }


           // contributor[i] = new Contributor();


        }
        return contributor;
    }
}
