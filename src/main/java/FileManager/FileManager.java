package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {
        String file = "LegionFile.txt";

        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file,"“Once upon a midnight dreary, while I pondered, weak and weary,\n" +
                "Over many a quaint and curious volume of forgotten lore,\n" +
                "While I nodded, nearly napping, suddenly there came a tapping,\n" +
                "As of some one gently rapping, rapping at my chamber door.\n" +
                "Tis some visitor,\" I muttered, \"tapping at my chamber door —\n" +
                "Only this, and nothing more.\"");
        fileManager.readFromFile(file);
        fileManager.deleteFile(file);

    }

    public void createFile (String filename){
        File file = new File(filename);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile (String filename, String text){

        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error. cannot write....");
            e.printStackTrace();
        }

    }
    public void readFromFile (String filename){
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()){
//                String row = scanner.nextLine();
//                System.out.println(row);
//            }
            for (int i = 0; scanner.hasNextLine();i++){
                String row = scanner.nextLine();
                System.out.println(i);
                System.out.println(row);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void deleteFile(String filename) {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }

    }
}
