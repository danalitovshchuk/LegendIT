package lesson4;

import lesson3.string.SelfTraining4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SelfTraining5 {


//    Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
//    has22([1, 2, 2]) → true
//    has22([1, 2, 1, 2]) → false
//    has22([2, 1, 2]) → false
//public static void main(String[] args) {
//    SelfTraining5 contain2 = new SelfTraining5();
//    contain2.has22(2, 2, 6,5);
//    contain2.has22(3, 2, 2,5);
//    contain2.has22(5,5, 2,2);
//    contain2.has22( 0, 2, 6,5);

    public boolean has22 (int a, int b, int c, int d) {
        boolean success = false;
        int[] integers = {a, b, c, d};
        if (a == 2 && b == 2 || b == 2 && c == 2 || c == 2 && d == 2) {
            success = true; }
        System.out.println(success);
        return success;
        }

//    Given an array of ints, return true if the array contains no 1's and no 3's.
//    lucky13([0, 2, 4]) → true
//    lucky13([1, 2, 3]) → false
//    lucky13([1, 2, 4]) → false
//public static void main(String[] args) {
//    SelfTraining5 noInts = new SelfTraining5();
//    noInts.noInts(1,2,3);
//    noInts.noInts(4,3,5);
//    noInts.noInts(1,7,8);
//    noInts.noInts(6,7,0);
//    noInts.noInts(7,4,2);
//}
    public boolean noInts (int a, int b, int c) {
        boolean success = true;
        int [] Integers = {a, b, c};
        if (a == 1 || a == 3 || b == 1 || b == 3 || c == 1 || c == 3)
        { success = false; }
        System.out.println(success);
        return success;
        }


//    Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
//    maxTriple([1, 2, 3]) → 3
//    maxTriple([1, 5, 3]) → 5
//    maxTriple([5, 2, 3]) → 5
//public static void main(String[] args) {
//    SelfTraining5 maxTriple = new SelfTraining5();
//    maxTriple.maxTriple();
//}
public int maxTriple () {
    ArrayList<Integer> intValues = new ArrayList<>();
    intValues.add(1);
    intValues.add(8);
    intValues.add(1);
    intValues.add(5);
    intValues.add(2);
    int max = 0;
//    Integer max = Collections.max(intValues);
//    System.out.println("ArrayList values: " + intValues);
//    System.out.println("ArrayList max value: " + max);
    if (intValues.size()<1){
        System.out.println("Error");}

    if (intValues.size()==1){
        System.out.println(intValues.get(0));
        return intValues.get(0);
    }
    else if (intValues.size()>1) {
        int first = intValues.get(0);
        int middle = intValues.get((intValues.size()+1)/2-1);
        int last = intValues.get(intValues.size()-1);
        if (first > middle && first > last) {
        System.out.println(first);
        max = first; }
     else if (middle > first && middle > last) {
        System.out.println(middle);
        max = middle; }
     else {
        System.out.println(last);
        max = last; }
    }
    return max;
    }



//    Given an array of ints, return true if one of the first 4 elements in the array is a 9.
//    The array length may be less than 4.
//    arrayFront9([1, 2, 9, 3, 4]) → true
//    arrayFront9([1, 2, 3, 4, 9]) → false
//    arrayFront9([1, 2, 3, 4, 5]) → false

    public static void main(String[] args) {
        SelfTraining5 arrayFront9 = new SelfTraining5();
        arrayFront9.arrayFront9();
    }
    public boolean arrayFront9(){
        ArrayList <Integer> nums = new ArrayList<>();
        boolean result = false;
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(3);
        nums.add(9);
        if (nums.size() == 0) {
            System.out.println("Error");
        }
        else if (nums.size()>0) {
        if (nums.get(0) == 9 || nums.get(1) == 9 || nums.get(2) == 9 || nums.get(3) == 9) {
            result = true;
        }
        else {
            result = false;
    }}
        System.out.println(result);
    return result;
}



//    Given a list of integers, return a list where each integer is multiplied with itself.
// square([1, 2, 3]) → [1, 4, 9]
// square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]



}












