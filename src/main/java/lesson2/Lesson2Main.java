package lesson2;

public class Lesson2Main {
    public static void main(String[] args) {
     Lesson2Main lesson2 = new Lesson2Main();
   //  lesson2.printUserInfo("John Doe", 1);
        boolean isBonusAvailable = true;
        lesson2.checkScore("John Doe", 1, 30, isBonusAvailable);
        lesson2.checkScore("Mark Smith", 2, 50, isBonusAvailable);
    }
    public void printUserInfo(String userName, int userID){
        System.out.println("The userName is " + userName);
        System.out.println("The user ID is " + userID);
    }

  public void checkScore(String userName, int userID, int userScore, boolean isBonusAvailable){
      System.out.println("The userName is " + userName);
      System.out.println("The user ID is " + userID);

      if (userName.equals ("John Doe")){
          userScore = userScore + 20;
      }
      if (isBonusAvailable){
          userScore = userScore + 10;
      }
      if(userScore>100 || userScore<0){
          System.out.println("Error");
      }
      else if(userScore>=60){
          System.out.println("Pass!");
      }
      else {
          System.out.println("Fail!");
      }


  }


  }





