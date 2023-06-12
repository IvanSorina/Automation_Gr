package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import static pages.BasePage.sleep;
public class SignInTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void checkIfSignInButtonIsDisplayed() {
        String email = "grupa1@automayion.com";
        String password = "12345";
        LOG.info("Check 'Sign in' in button");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Button is not displayed");
        sleep(3000);
        LOG.info("Click button");
        signInPage.clickSignInButton();
        sleep(3000);
        LOG.info("Check Logo");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        sleep(3000);
        LOG.info("Click Enter and check message");
        signInPage.clickEnterButton();
        sleep(3000);
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error msg is not displayed");
        sleep(3000);
        LOG.info("Complete the fields");
        signInPage.typeInSignInEmailField(email);
        signInPage.typeInSignInPasswordField(password);
        sleep(3000);
        LOG.info("Click Enter and check message");
        signInPage.clickEnterButton();
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(),"Error msg is not displayed");
        sleep(3000);

    }
}
