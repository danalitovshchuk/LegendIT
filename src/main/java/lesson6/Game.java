package lesson6;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static lesson6.Game.GameType.*;

public class Game {
    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }
   
    
    public static void writeNumOfPlayersPerTeam (GameType game){
        int players = 0;
        String fileName = null;
        try {
            switch (game){
                case SOCCER:
                    players = 11;
                    fileName = "Soccer.txt";
                    break;
                    
                    case HOCKEY:
                    players = 6;
                    fileName = "Hockey.txt";
                    break;
                    
                    case RUGBY:
                    players = 15;
                    fileName = "Rugby.txt";
                    break;
                    
                default:
                    players = 0;
            }    }
        catch (Exception error) {
            System.out.println("Something bad has happened");
        }
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("The number of players in the team is: " + players);
            fileWriter.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
            
        }
      
    

//    public void createGameFile(String fileName) {
//        File file = new File(fileName);
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }

    public static void main(String[] args) {

//        Game.writeNumOfPlayersPerTeam(GameType.SOCCER);
//        Game.writeNumOfPlayersPerTeam(GameType.HOCKEY);
        Game.writeNumOfPlayersPerTeam(GameType.RUGBY);
//        Game.writeNumOfPlayersPerTeam(null);
        System.out.println("New file has been created");
    }}
//    File file = new File(fileName);
//                    try {
//                            file.createNewFile();
//                            FileWriter fileWriter = new FileWriter(fileName);
//                            fileWriter.write("The number of players in the Soccer team is: " + players);
//                            fileWriter.close();
//                            } catch (IOException e) {
//                            e.printStackTrace();
//                            }
// File file2 = new File(fileName);
//                    try {
//                            file2.createNewFile();
//                            FileWriter fileWriter = new FileWriter(fileName);
//                            fileWriter.write("The number of players in the Soccer team is: " + players);
//                            fileWriter.close();
//                            } catch (IOException e) {
//                            e.printStackTrace();
//                            }

//        if (HOCKEY) {
//           String file = "Hockey.txt";
//            Game newFile = new Game();
//            newFile.createGameFile(file);
//            System.out.println("New file has been created");}
//
//        if (GameType == RUGBY) {
//            String file = "Rugby.txt";
//            Game newFile = new Game();
//            newFile.createGameFile(file);
//            System.out.println("New file has been created"); }
//
//        if (GameType == SOCCER) {
//            String file = "Soccer.txt";
//            Game newFile = new Game();
//            newFile.createGameFile(file);
//            System.out.println("New file has been created");
//
//        }

//        result = Game.writeNumOfPlayersPerTeam(GameType.HOCKEY);
//        System.out.println("The number of players in the team is: " + result);
//        result = Game.writeNumOfPlayersPerTeam(GameType.RUGBY);
//        System.out.println("The number of players in the team is: " + result);

//            Game game = new Game();
//            game.createGameFile(writeNumOfPlayersPerTeam());
//        }
//        if (result == "Hockey") {
//            String file = "Hockey.txt";
//            Game game = new Game();
//            game.createGameFile(file);
//        }
//        if (result == "Rugby") {
//            String file = "Rugby.txt";
//            Game game = new Game();
//            game.createGameFile(file);
//        }
