package lesson2;

public class Assignment2 {
    public static void main(String[] args) {
        Assignment2 exercise1 = new Assignment2();
        exercise1.checkNumbers(0, 10);
   //     exercise1.checkNumber(3);
   //     exercise1.checkNumber(12);
   //     exercise1.checkNumber(2);
    }
    public void checkNumbers(int start, int end){

        for (int a = start; a<=end; a++){

            if(a % 2 == 0 && a % 3 == 0) {
                System.out.println("The number " + a + " is divisible by two and three");
            }
            else if (a % 3 == 0){
                System.out.println("The number " + a + " is divisible by three");}
        else if (a % 2 == 0){
            System.out.println("The number " + a + " is odd"); }

        if (a % 2 == 1){
            System.out.println("The number " + a + " is even");}

    }

 }}

 //   public static void main(String[] args) {
//   //    for (int a = 1; a>=0; a++);{
//     //     for (int b = 3; a<=b; b++)
//       //   int result = a + b;{
//       // System.out.println(result); }

       // int b = 3;
       // int result = a + b;
        //while (a <= b) ;
       // a++;
       // System.out.println(result);
 //  }



 //   public static void main(String[] args) {
  //     for (int i = 7; i>=0; i--){
 //       for (int j = 0; j<=i; j++){
   //         System.out.print(j + " ");}
   //         System.out.println( );
  //      }
  //  }














