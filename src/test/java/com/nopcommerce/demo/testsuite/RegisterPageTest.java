package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegistrationPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage= new RegistrationPage();




@Test
    public void userShouldNavigateToRegisterPageSuccessfully () throws InterruptedException{

        //Find registration tab on the homepage and click it
    homePage.clickOnRegistrationTab();

        //Verify the text ‘Register’
    String expectedMessage = "Register";
    String actualMessage = registrationPage.getRegisterText();
    Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    //Gender
    registrationPage.clickMaleGender();
    Thread.sleep(1000);
    //First name:
    registrationPage.setFirstName("Ron");
    Thread.sleep(1000);
    //Last name
    registrationPage.setLastName("Jira");
    Thread.sleep(1000);
    //Date of birth:
    registrationPage.dateOfBirthDay("9");
    registrationPage.dateOfBirthMonth("November");
    registrationPage.dateOfBirthYear("1991");
    Thread.sleep(1000);
    //Email:
    registrationPage.addEmail("rrr123@gmail.co.uk");
    Thread.sleep(1000);
    //Password:
    registrationPage.setPassword("ron1234");
    //Confirm password
    registrationPage.setConfirmPassword("ron1234");
    Thread.sleep(1000);

//        2.21 Click on “REGISTER” Button
    registrationPage.clickRegisterButton();
    Thread.sleep(1000);

//        2.22 Verify the message “Your registration completed”
    String expectedMessage9 = "Your registration completed";
    String actualMessage9 = registrationPage.getRegistrationText();
    org.junit.Assert.assertEquals(actualMessage9, expectedMessage9);
    Thread.sleep(1000);

//        2.23 Click on “CONTINUE” tab
    registrationPage.clickContinue();


}





}
