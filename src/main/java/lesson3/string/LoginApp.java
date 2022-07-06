package lesson3.string;

public class LoginApp {
    public static void main(String[] args) {
LoginApp loginApp = new LoginApp();
// boolean success = loginApp.verifyUser(null, " ");
//        System.out.println("Login success " + success);
        loginApp.stringExamples();
    }
public boolean verifyUser(String username, String password) {
    boolean success = false;
//    if (username.isEmpty() || password.isEmpty()) {
    if (username == null || password == null) {
        System.out.println("The username or password is null"); }
       else if (username.length()==0 || password.length()==0) {
        System.out.println("The username or password is empty"); }
       else if (username.isBlank() || password.isBlank()) {
        System.out.println("The username or password is blank"); }
       else {success = true;
    }
        return success;

    }


    public void stringExamples(){
        String txt1 = "dog";
        String txt2 = "catalog";

        System.out.println(txt2.contains(txt1));
        System.out.println(txt2.replace("cat", txt1));
        System.out.println(txt1.charAt(0));
        System.out.println(txt1.charAt(1));
        System.out.println(txt1.charAt(2));
        System.out.println(txt1.charAt(txt1.length()-1));
    }
}
