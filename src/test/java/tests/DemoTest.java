package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.TestBase;

public class DemoTest extends TestBase {
    /*After to create pom.xml, page package, utilities package, configuration.propertise ,
    then We created the class which named DemoTest then extended the TestBase class Go on below steps;
    */

    //extens testBase first

    @Test         //first gives error then to write method disappear
    public void test(){
        LoginPage login = new LoginPage();
        login.loginAsDriver();
        System.out.println(System.getProperty("user.dir")); // it gave=> C:\Users\KONSTANTINUPOLI\IdeaProjects\Homework_2

    }

}
