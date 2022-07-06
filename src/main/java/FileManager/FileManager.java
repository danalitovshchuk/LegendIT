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
fileManager.writeToFile(file, "Deep into that darkness peering,\n" +
        "\n" +
        "Long I stood there, wondering, fearing,\n" +
        "\n" +
        "Doubting, dreaming dreams no mortals\n" +
        "\n" +
        "Ever dared to dream before;\n" +
        "\n" +
        "But the silence was unbroken,\n" +
        "\n" +
        "And the stillness gave no token,\n" +
        "\n" +
        "And the only word there spoken\n" +
        "\n" +
        "Was the whispered word, \"Lenore!\"\n" +
        "\n" +
        "This I whispered, and an echo\n" +
        "\n" +
        "Murmured back the word, \"Lenore!\"\n" +
        "\n" +
        "Merely this, and nothing more.");

fileManager.readFromFile(file);
fileManager.deleteFile(file);
    }
public void createFile (String fileName){
    File file = new File(fileName);

    try {
        file.createNewFile();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public void writeToFile (String fileName, String text){
    try {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(text);
        fileWriter.close();

    } catch (IOException e) {
        System.out.println("Error, cannot write...");
        e.printStackTrace();
    }
}

public void readFromFile (String fileName){
File file = new File(fileName);
    try {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            System.out.println(row);
        }
        scanner.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

}

public void deleteFile (String fileName) {
        File file = new File(fileName);
        if (file.exists()){
            file.delete();
        }

}

}
