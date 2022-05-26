package StaticClassesEnumsExceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {


    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
        String soccerFile = "Soccer.txt";
        String hockeyFile = "Hockey.txt";
        String rugbyFile = "Rugby.txt";


        switch (game) {
            case SOCCER:
                Game.createFile(soccerFile);
                Game.writeToFile("11");
                break;
            case HOCKEY:
                Game.createFile(hockeyFile);
                Game.writeToFile("6");
            break;
            case RUGBY:
                Game.createFile(rugbyFile);
                Game.writeToFile("15");
            break;
        }
    }

    public static void createFile (String filename){
            File file = new File(filename);
        }
        public static void writeToFile (String filetxt){
            try {
                FileWriter fileWriter = new FileWriter (filetxt);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}













