package Pages;

public class PagesMain {
    public static void main(String[] args) {

      //  Page loginScreen = new Page("Login", 1, "www.legionIt.com/login");
        //loginScreen.pageId = 1;
        // loginScreen.pageName = "Login";
        // loginScreen.URL = "www.legionIt.com/login";

   //     loginScreen.openPage();
    //    loginScreen.clickButton("Login");
     //   loginScreen.closePage();


    //    Page aboutScreen = new Page();
    //    aboutScreen.setPageId(2);
     //   System.out.println(aboutScreen.getPageId());
     //   aboutScreen.setPageName("About");
     //   aboutScreen.setURL("www.legionIt.com/about");
     //   aboutScreen.openPage();
     //   aboutScreen.clickButton("exit");
     //   aboutScreen.closePage();


     //   LoginPage loginPage = new LoginPage();
     //   loginPage.setPageName("LoginPage");
      //  loginPage.setURL("http://....");

     //   loginPage.openPage();
      //  loginPage.setUserName("name");
      //  loginPage.setPassword("123454");
      //  loginPage.populateCredentials();


   //     Page page = new Page();
    //    page.getDeveloperName();

     LoginPage loginPage = new LoginPage();
        loginPage.getDeveloperName();
        loginPage.setPageId(1);
        loginPage.setPageName("Login");

        AboutPage aboutPage = new AboutPage();
        aboutPage.getDeveloperName();



    }
}
