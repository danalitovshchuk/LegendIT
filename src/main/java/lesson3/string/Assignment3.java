package lesson3.string;

import jdk.jfr.Category;

import java.util.Locale;

public class Assignment3 {
//    public static void main(String[] args) {
//        Assignment3 compareStrings = new Assignment3();
//        compareStrings.compareStrings(" ", "cat");
//        compareStrings.compareStrings("cat", "cat");
//        compareStrings.compareStrings("catalog", "cat");
//        compareStrings.compareStrings(null, null);
//        compareStrings.compareStrings("cat", null);
//    }
//
//    public void compareStrings(String a, String b){
//
//        if (a == null || b == null) {
//            System.out.println("Cannot compare Strings");
//        }
//        else if (a.equalsIgnoreCase(b)) {
//            System.out.println("The Strings are the same");
//        }
//       else if (b.contains(a)){
//            System.out.println(a + " is the part of " + b);}
//        else if (a.contains(b)) {
//            System.out.println(b + " is the part of " + a);
//        }
//        else if (a.isBlank() || b.isBlank()){
//            System.out.println("String is blank");
//        }
//    }}

    public static void main(String[] args) {
        Assignment3 compareStrings = new Assignment3();
        boolean success = compareStrings.isPalindrome ("racecalr");
        System.out.println(success);
    }

   public boolean isPalindrome(String a) {
        String result = "";
        boolean success = true;

         int lastLetter = a.length() - 1;
            {
                for (int j = lastLetter; j >= 0; j--) {
                    result = result + a.charAt(j);
                }
                if (result.equals(a)) ;
                else {
                    success = false;
                }
                return success;

            }}}


