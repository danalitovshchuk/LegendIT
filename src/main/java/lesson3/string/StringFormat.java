package lesson3.string;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Vasiliy";
        String gender = "male";
        int age = 28;
        double salary = 5000.500d;
        System.out.println("The name is " + name + ", gender is " + gender + ", age is " + age + ", salary is " + salary);
        System.out.println(String.format("The name is %s, the gender is %s, the age is %d, the salary %f", name, gender, age, salary));
    }

}
