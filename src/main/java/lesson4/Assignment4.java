package lesson4;
import java.util.*;

public class Assignment4 {

//    public static void main(String[] args) {
//        Assignment4 getDay = new Assignment4();
//        getDay.getDay(1);
//        getDay.getDay(0);
//        getDay.getDay(8);
//        getDay.getDay(-1);
//    }
//    public String getDay(int day) {
//        ArrayList<String> days  = new ArrayList<String>();
//        days.add("Sunday");
//        days.add("Monday");
//        days.add("Tuesday");
//        days.add("Wednesday");
//        days.add("Thursday");
//        days.add("Friday");
//        days.add("Saturday");
//
//       if (day > days.size() || day < 1) {
//            System.out.println("Error");
//            return null;
//            }
//
//            System.out.println(days.get(day-1));
//
//
//        return days.get(day-1);
//
//    }
//}


//    public static void main(String[] args) {
//        Assignment4 assignment4 = new Assignment4();
//
//        ArrayList<String> city = new ArrayList<>();
//        city.add("London");
//        city.add("Berlin");
//        city.add("Paris");
//
//        ArrayList<String> country = new ArrayList<>();
//        country.add("England");
//        country.add("Germany");
//        country.add("France");
//
//        assignment4.buildCountryCityHashMap(city, country);
//
//        Scanner scanner = new Scanner(System.in);
//// ask the question
//        System.out.print("Enter your city: ");
//// get  input as a String
//        String input = scanner.next();
//        if (input == null || input.isBlank() || input.isEmpty()) {
//            System.out.println("Error");
//        }
//        HashMap<String, String> locations = assignment4.buildCountryCityHashMap(city, country);
//        System.out.println("The country match is: " + locations.get(input));
//    }
//    public HashMap<String, String> buildCountryCityHashMap (ArrayList<String> city, ArrayList<String> country) {
//
//
//       HashMap<String, String> locations = new HashMap<>();
//
//       for (int i = 0; i < city.size(); i++) {
//           locations.put(city.get(i), country.get(i));
//       }
//       System.out.println(locations);
//        return locations;
//    }





    public static void main(String[] args) {
ArrayList <String> list = new ArrayList<>(Arrays.asList("Steve", "Tim", "Lucy", "Steve", "Pat", "Angela", "Tom", "Tim", "Anna", "Lucy")
);
        System.out.println("Arraylist with duplicates: " + list);

ArrayList <String> newList = removeDuplicates(list);
        System.out.println("Arraylist with duplicates removed: " + newList);

    }
public static <String> ArrayList <String> removeDuplicates (ArrayList <String> list){
    ArrayList <String> newList = new ArrayList<String>();
    for (String element: list) {
        if (!newList.contains(element)) {
            newList.add(element);
        }
    }
    return newList;
    }

}



























