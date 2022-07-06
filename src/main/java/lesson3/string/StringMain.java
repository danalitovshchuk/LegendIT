package lesson3.string;

public class StringMain {
    public static void main(String[] args) {
StringMain stringMain = new StringMain();
int res = stringMain.sumOfTwoNumbers(2, 4);
        System.out.println("The result is " + res);
        System.out.println(stringMain.getText());
    }
public int sumOfTwoNumbers (int num1, int num2){
        int result = num1 + num2;
        return result;
}
public String getText (){
        return "Hello";
}
}
