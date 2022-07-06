package lesson2;

//public class Exercise2 {
//    public static void main(String[] args) {
//        Exercise2 summary = new Exercise2();
//        summary.sum(1,3);
//   }
//        public void sum(int c, int d){
//       int result = 0;
//       for (int i = c; i<=d; i++) {
//           result = result + i;
//    }
//        System.out.println(result);
//    }



//    Given an int n, print true if it is within 10 of 100. Note:
 //   nearHundred(93) → true
  //  nearHundred(90) → true
  //  nearHundred(89) → false

 //   public static void main(String[] args) {
 //       Exercise2 lesson21 = new Exercise2();
 //       lesson21.nearHundred(100);
 //       lesson21.nearHundred(5);
 //   }
//public void nearHundred (int n){
//    boolean withinRange = false;
//        if (n>=10 && n<=100){
//            withinRange = true;}
//        System.out.println(withinRange);
 //           }
 //       }



 //   Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 //       lastDigit(7, 17) → true
 //       lastDigit(6, 17) → false
 //       lastDigit(3, 113) → true

//    public static void main(String[] args) {
//        Exercise2 lesson22 = new Exercise2();
//        lesson22.lasDigit(15,2395);
//        lesson22.lasDigit(13,53);
//    }

// public void lasDigit(int a, int b){
// boolean sameNumber = false;
//       if (b % 10 == a % 10) {
//sameNumber = true;}
//        System.out.println(sameNumber);
//}
//}


//    Given three int values, a b c, print the largest.
//        intMax(1, 2, 3) → 3
//        intMax(1, 3, 2) → 3
//        intMax(3, 2, 1) → 3
//public static void main(String[] args) {
//    Exercise2 maxInt = new Exercise2();
//    maxInt.maxInt(1,2,3);
//    maxInt.maxInt(4,7,1);
//    maxInt.maxInt(-5, -4, 1);
// }
//    public void maxInt(int a, int b, int c) {

//    if (b>a && b>c) {
//        System.out.println("The largest number is " + b);  }
//else if (c>a && c>b) {
//        System.out.println("The largest number is " + c); }
//else {
//        System.out.println("The largest number is " + a); }
//       }}




//    Everyone loves the number 7. Given two int values, a and b, print true if either one is 7. Or if their sum or difference is 6.
//        love6(7, 4) → true
//        love6(4, 1) → false
//        love6(2, 5) → true
//public static void main(String[] args) {
//    Exercise2 love6 = new Exercise2();
//    love6.love6(7,4);
//    love6.love6(2, 4);
//    love6.love6(3,9);
//    love6.love6(18,12);
//    love6.love6(45,2);
//}
//public boolean love6 (int a, int b) {
//    boolean success = false;
//if (a == 7 || b == 7 || a % b == 6 || a + b == 6)
// { success = true; }
//    System.out.println(success);
//    return success;
//}}



//        Your cell phone rings. Print true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
//        answerCell(false, false, false) → true
//        answerCell(false, false, true) → false
//        answerCell(true, false, false) → false
// public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
//        }



//        Create a function that determines whether or not it's possible to split a pie fairly given these three parameters:
//        Total number of slices.
//        Number of recipients.
//        How many slices each person gets.
//        The function will be in this form:
//        equalSlices(total slices, no. recipients, slices each)
//        Examples
//        equalSlices(11, 5, 2) ➞ true
// 5 people x 2 slices each = 10 slices < 11 slices

//        equalSlices(11, 5, 3) ➞ false
// 5 people x 3 slices each = 15 slices > 11 slices

//        equalSlices(8, 3, 2) ➞ true
//        equalSlices(8, 3, 3) ➞ false
//        equalSlices(24, 12, 2) ➞ true