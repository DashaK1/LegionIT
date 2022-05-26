package StaticClassesEnumsExceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileGame {
    public static void main(String[] args) {

        Game.writeNumOfPlayersPerTeam(Game.GameType.SOCCER);
        Game.writeNumOfPlayersPerTeam(Game.GameType.HOCKEY);
        Game.writeNumOfPlayersPerTeam(Game.GameType.RUGBY);


    }
}