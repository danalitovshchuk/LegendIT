package lesson3.string;

public class SelfTraining4 {
    public static void main(String[] args) {
SelfTraining4 addChars = new SelfTraining4();
addChars.backAround("dog");
addChars.backAround("java");
addChars.backAround ("xy");
addChars.backAround(" ");
addChars.backAround("");
addChars.backAround(null);
}
public String backAround (String str) {

    if (str == null || str.isEmpty() || str.isBlank()) {
        System.out.println("String is null or empty");
    String fail = "";
    return fail; }

  else {
      int lastLetter = str.length()-1;
    String result = "";
    System.out.println(str.charAt(lastLetter)+str+str.charAt(lastLetter));
        result = result + str.charAt(lastLetter) + str + str.charAt(lastLetter);
        return result;
}}}


//Return true if the given string begins with "max", except the 'm' can be anything, so "pax", "9ax" .. all count.
//        maxStart("max snacks") → true
//        maxStart("pax snacks") → true
//        miaStart("paz snacks") → false
//public static void main(String[] args) {
//    SelfTraining4 maxStart = new SelfTraining4();
//    maxStart.maxStart("max snacks");
 //   maxStart.maxStart("dax snacks");
 //   maxStart.maxStart("mas snacks");
 //   maxStart.maxStart(" ");
 //   maxStart.maxStart("max");
//}
 //   public boolean maxStart(String str) {
 //   if (str == null || str.isBlank() || str.isEmpty()) {
 //       System.out.println("The String is null or empty");
 //   }
 //   boolean success = false;
 //    String letter = str.length()-2;

 //   return false;

 //  if (str.endsWith("ax snacks")) {
 //      success = true; }
 //       System.out.println(success);
 //  return success;

//   }
//}
