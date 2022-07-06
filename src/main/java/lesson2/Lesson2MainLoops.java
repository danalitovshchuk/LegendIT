package lesson2;

public class Lesson2MainLoops {
    public static void main(String[] args) {
Lesson2MainLoops loops = new Lesson2MainLoops();
//loops.countnumbers(1);
//       loops.countNumbers();
        loops.numbersTemplate(9);
    }
public void countnumbers (int I){

    //System.out.println(I);
    //System.out.println(I+1);
    //System.out.println(I+2);
    while (I<=10){
        System.out.println(I);
        I=I+1;
    }

}
 public void countNumbers (){
        for(int i = 1; i<=100; i++){
            System.out.println(i);
        }


 }

 public void numbersTemplate (int rows) {
        for (int i=1; i<=rows; i++){
          if(i % 2 == 0){
              continue;
          }
            if(i==7){
                break;
            }
        for (int j=1; j<=i; j++){
            System.out.print(j+" "); }
            System.out.println();
        }

 }
}
