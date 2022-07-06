package Pages;

public class Pagesmain {
    public static void main(String[] args) {
//        Page loginScreen = new Page("Login", 1, "www.legionIT.com/login");
//        loginScreen.pageId = 1;
//        loginScreen.pageName = "Login";
//        loginScreen.URL = "www.legionIT.com/login";

//        loginScreen.openPage();
//        loginScreen.closePage();
//        loginScreen.clickButton("Login");
//
//        Page aboutScreen = new Page();
//        loginScreen.setPageId(2);
//        loginScreen.setPageName("About");
//        loginScreen.setURL("www.legionIT.com/login");
//
//        loginScreen.openPage();
//        loginScreen.closePage();
//        loginScreen.clickButton("Exit");

//        LoginPage loginPage = new LoginPage();
//        loginPage.setPageName("Login page");
//        loginPage.setURL("https://");
//
//        loginPage.openPage();
//        loginPage.setUserName("name");
//        loginPage.setPassword("12345");
//        loginPage.populateCredentials();

//Page page = new Page();
//page.getDeveloperName();

LoginPage loginPage = new LoginPage();
loginPage.setPageId(1);
loginPage.setPageName("login");
loginPage.getDeveloperName();

AboutPage aboutPage = new AboutPage();
aboutPage.getDeveloperName();

    }
}
