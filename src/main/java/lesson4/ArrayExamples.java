package lesson4;

import java.util.*;

public class ArrayExamples {
public void stringsArray(){
    String [] buttons = {"Ok", "Cancel", "Login", "Signup"};
//    buttons [2] = "Exit";
    int length = buttons.length;
    System.out.println(buttons[2]);
    System.out.println("length: " + length);

//    for (int i=0; i<buttons.length; i++){
//    System.out.println(buttons[i]); }

    for (String button: buttons){
        System.out.println(button);

    }
}

    public void stringsArrayWithSize(){
    String [] array = new String[5];
    array[0]="Ok";
        array[1]="Cancel";
        array[2]="Login";
        array[3]="Signup";
        array[4]="Exit";
        System.out.println("length: " + array.length);
    }

    public void integerArrays(){
    int [] ids = {12, 5, 4, 0};
        System.out.println(ids[2]);
    }

    public void arrayListExamples() {
        ArrayList<String> buttons = new ArrayList<String>();
        buttons.add("OK");
        buttons.add("Cancel");
        buttons.add("Login");
        buttons.add("Exit");

        for (int i = 0; i < buttons.size(); i++) {
            System.out.println(buttons.get(i));
        }

//        System.out.println(buttons.get(0));

//        for (String button: buttons){
//            System.out.println(button);
//    }
//        System.out.println("The size of the list: " + buttons.size());
//
//        buttons.add("Signup");
//        for (String button: buttons){
//            System.out.println(button);
//}
//        System.out.println("The size of the list: " + buttons.size());
//
//        buttons.remove("Exit");
//        for (String button: buttons){
//            System.out.println(button);
//        }
//        System.out.println("The size of the list: " + buttons.size());
//        System.out.println();
//
//        buttons.clear();
//        System.out.println(buttons.size());
    }
        public void arrayListSortingExample(){
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            arrayList.add(234);
            arrayList.add(1);
            arrayList.add(45);
            arrayList.add(5);

            Collections.sort(arrayList);
            for (Integer i: arrayList) {
                System.out.println(i);
            }

}

public void HashMapExamples(){
    HashMap<String,String> hashMap = new HashMap<String,String>();
    hashMap.put("John", "Toronto");
    hashMap.put("Kate", "Moscow");
    hashMap.put("Moisha", "Tel Aviv");
    hashMap.put("Moisha", "Jerusalem");
    System.out.println(hashMap);

    System.out.println(hashMap.get("Moisha"));

    hashMap.remove("John");

    System.out.println(hashMap.size());
}

public void hashSetExample(){
    HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("John");
    hashSet.add("Kate");
    hashSet.add("Moisha");
    System.out.println(hashSet);

    List<String> list = new ArrayList<String>(hashSet);
    Collections.sort(list);
    System.out.println(list);


}
}


