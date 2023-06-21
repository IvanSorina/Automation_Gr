package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
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
    private By chooseFieldLanguage = By.id("msdd");
    String selectLanguage = "//a[contains(text(), '%s')]";
    String selectSkill = "Skills";
    private By selectCountry = By.xpath("//span[@role='combobox']");
    private By searchField = By.xpath("//input[@type='search']");
    private By birthYear = By.id("yearbox");
    private By birthMonth = By.xpath("//select[@placeholder='Month']");
    private By birthDay = By.id("daybox");
    private By firstPassword = By.id("firstpassword");
    private By secondPassword = By.id("secondpassword");


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

    public void selectLanguage(String language) {
        LOG.info("Click on language box 'Languages'");
        driver.findElement(chooseFieldLanguage).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language))).click();
    }

    public void selectSkill(String skill) {
        LOG.info("Click on skill box 'Skills'");
        Select newskill = new Select(driver.findElement(By.id(selectSkill)));
        newskill.selectByValue(skill);
    }

    public void clickSelectCountry(String country) {
        LOG.info("Select country field");
        driver.findElement(selectCountry).click();
        driver.findElement(searchField).sendKeys(country);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
    }

    public void birthDate(String year, String month, String day) {
        LOG.info("Select Birthdate");
        Select birthYearDate = new Select(driver.findElement(birthYear));
        birthYearDate.selectByValue(year);
        Select birthMonthDate = new Select(driver.findElement(birthMonth));
        birthMonthDate.selectByValue(month);
        Select birthDayDate = new Select(driver.findElement(birthDay));
        birthDayDate.selectByValue(day);
    }


    
    public void confirmPasswordFields(String password, String confirmPassword) {

        LOG.info("Enter First password");
        driver.findElement(firstPassword).sendKeys(password);
        driver.findElement(secondPassword).sendKeys(confirmPassword);

    }
}