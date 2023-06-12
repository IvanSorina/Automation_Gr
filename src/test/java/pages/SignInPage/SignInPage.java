package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();

        }
        return instance;
    }

    private By signInButton = By.id("btn1");
    private By logo = By.id("logo");
    private By signInEmailField = By.xpath("//input[@placeholder='E mail']");
    private By signInPasswordField = By.xpath("//input[@placeholder='Password']");
    private By enterButton = By.id("enterbtn");
    private By errorMsg = By.id("errormsg");

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if'Sign in' button is displayed");

        return driver.findElement(signInButton).isDisplayed();
    }

    public void clickSignInButton() {
        LOG.info("Click 'SignIn' button");
        driver.findElement(signInButton).click();
    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void typeInSignInEmailField(String email) {
        LOG.info("Typing email address in 'E mail' field");
        driver.findElement(signInEmailField).sendKeys(email);
    }

    public void typeInSignInPasswordField(String password) {
        LOG.info("Typing password address in 'Password' field");
        driver.findElement(signInPasswordField).sendKeys(password);
    }
    public void clickEnterButton(){
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();
    }
    public boolean isErrorMessageDisplayed(){
        LOG.info("Verifying if error message is displayed");
        return driver.findElement(errorMsg).isDisplayed();
    }






}



