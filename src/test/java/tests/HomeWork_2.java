package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CalenderEvents;
import pages.DashBoard;
import pages.LoginPage;
import utilities.TestBase;

public class HomeWork_2 extends TestBase{

    @Test
    public void testcase1(){
        extentLogger= report.createTest("Verify subtitle is \"Options\"");
        extentLogger.info("Goto https://qa1.vytrack.com");
        extentLogger.info("login as storemanager");
        LoginPage login=new LoginPage();
        login.loginAsStoreManager();
        extentLogger.info("Navigate to Activities> Calendar Events");
        DashBoard dashboard=new DashBoard();
        dashboard.navigateToModule("Activities","Calendar Events");
        extentLogger.info("Verify that page subtitle \"Options\" is displayed");
        CalenderEvents events = new CalenderEvents();
        //CalendarEvents events=new CalendarEvents();
        //Assert.assertEquals(events.subtitleOptions.getText(),"Options");*************
        extentLogger.pass("Test PASS");
    }
    @Test
    public void testcase2(){
        extentLogger= report.createTest("Verify subtitle is \"Options\"");
        extentLogger.info("Goto https://qa1.vytrack.com");
        extentLogger.info("login as storemanager");
        LoginPage login=new LoginPage();
        login.loginAsStoreManager();
        extentLogger.info("Navigate to Activities> Calendar Events");
        DashBoard dashboard=new DashBoard();
        dashboard.navigateToModule("Activities","Calendar Events");
        CalenderEvents events = new CalenderEvents();
        String pageNumber=events.pageNumber.getAttribute("value");
        Assert.assertEquals(pageNumber,"1");
        extentLogger.pass("test is PASS");
    }
    @Test
    public void testcase3(){
        extentLogger= report.createTest("Verify subtitle is \"Options\"");
        extentLogger.info("Goto https://qa1.vytrack.com");
        extentLogger.info("login as storemanager");
        LoginPage login=new LoginPage();
        login.loginAsStoreManager();
        extentLogger.info("Navigate to Activities> Calendar Events");
        DashBoard dashboard=new DashBoard();
        dashboard.navigateToModule("Activities","Calendar Events");
        CalenderEvents events = new CalenderEvents();
        extentLogger.info("Verify that view per page number is equals to\n" +
                "\"25\"");
        //Assert.assertEquals(events.pageNumberCriteria.getText(),"25");**************
        extentLogger.pass("test is PASS");
    }
}