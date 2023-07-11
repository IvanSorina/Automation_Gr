package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;


public class RegisterTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";
    String fname = "Sorina";
    String lname = "Ivan";
    String adress = "Str.Teiului,nr.2, jud.Sibiu, Fagaras";
    String emailaddress = "sorinaivan17@gmail.com";
    String phone = "0767456321";
    String language = "Romanian";
    String skill = "Java";
    String country = "India";
    String year = "1992";
    String month = "February";
    String day = "14";
    String firstPassword = "BlaBla";
    String secondPassword = "BlaBla";


    @Test
    public void register() {
        driver.get(newUrl);

        LOG.info("Complete the First name and Last name");
        registerPage.firstNameField(fname);
        registerPage.lastNameField(lname);
        sleep(3000);

        LOG.info("Complete the Adress");
        registerPage.adressField(adress);


        LOG.info("Complete the Email Address");
        registerPage.emailAddressField(emailaddress);


        LOG.info("Complete the Phone");
        registerPage.phoneField(phone);


        LOG.info("Click gender radio button");
        registerPage.clickMaleGender();
        sleep(3000);

        LOG.info("Click gender radio button");
        registerPage.clickFeMaleGender();


        LOG.info("Click checkbox button");
        registerPage.clickCricket();
        sleep(3000);

        LOG.info("Click checkbox button");
        registerPage.clickMovies();


        LOG.info("Click checkbox button");
        registerPage.clickHockey();
        sleep(3000);

        LOG.info("Click languages radio button");
        registerPage.selectLanguage(language);


        LOG.info("Click skill dropdown button");
        registerPage.selectSkill(skill);

        LOG.info("Click 'Select Country'");
        registerPage.clickSelectCountry(country);

        LOG.info("Select Birth Date");
        registerPage.birthDate(year, month, day);


        LOG.info("Confirm Password Fields");
        registerPage.confirmPasswordFields(firstPassword, secondPassword);
        sleep(2000);
        LOG.info("Uploading file");
        registerPage.uploadFile();
        sleep(2000);
        LOG.info("Click 'submit' button");
        registerPage.submitButton();
        sleep(2000);

    }
}