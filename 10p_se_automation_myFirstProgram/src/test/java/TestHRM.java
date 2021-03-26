import pageObject.LoginScreen;

public class TestHRM {
    public static void main(String[] args){

        LoginScreen ls = new LoginScreen();
        ls.openHomePage();
        String invalidText = ls.invalidCredentials("wwww","rrrr");
        if (invalidText.equalsIgnoreCase("Invalid credentials")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        ls.quitBrowser();
    }
}
