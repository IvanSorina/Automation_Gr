package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {

    }

    public static RegisterPage getInstance() {
        if (instance == null) {

            instance = new RegisterPage();
        }
        return instance;
    }

    private By firstNameField = By.xpath("//input[@placeholder='First Name']");
    private By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    private By adressField = By.xpath("//textarea[@ng-model='Adress']");
    private By emailAddress = By.xpath("//input[@type='email']");
    private By phoneField = By.xpath("//input[@type='tel']");
    private By genderMale = By.xpath("//input[@value='Male']");
    private By genderFeMale = By.xpath("//input[@value='FeMale']");
    private By checkboxCricket = By.xpath("//input[@value='Cricket']");
    private By checkboxMovies = By.xpath("//input[@value='Movies']");
    private By checkboxHockey = By.xpath("//input[@value='Hockey']");


    public void firstNameField(String fname) {
        LOG.info("Typing first name in 'First name' field");
        driver.findElement(firstNameField).sendKeys(fname);
    }

    public void lastNameField(String lname) {
        LOG.info("Typing last name in 'Last name' field");
        driver.findElement(lastNameField).sendKeys(lname);
    }

    public void adressField(String adress) {
        LOG.info("Typing adress in 'Adress' field");
        driver.findElement(adressField).sendKeys(adress);
    }

    public void emailAddressField(String emailaddress) {
        LOG.info("Typing email address in 'Email Address' field");
        driver.findElement(emailAddress).sendKeys(emailaddress);
    }

    public void phoneField(String phone) {
        LOG.info("Typing phone in 'Phone' field");
        driver.findElement(phoneField).sendKeys(phone)
        ;
    }

    public void clickMaleGender() {
        LOG.info("Click gender radio button 'Male'");
        driver.findElement(genderMale).click();
    }

    public void clickFeMaleGender() {
        LOG.info("Click gender radio button 'FeMale'");
        driver.findElement(genderFeMale).click();
    }

    public void clickCricket() {
        LOG.info("Click checkbox button 'Cricket'");
        driver.findElement(checkboxCricket).click();
    }

    public void clickMovies() {
        LOG.info("Click checkbox button 'Movies'");
        driver.findElement(checkboxMovies).click();
    }

    public void clickHockey() {
        LOG.info("Click checkbox button 'Hockey'");
        driver.findElement(checkboxHockey).click();
    }



}