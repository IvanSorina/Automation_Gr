package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignUpTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

    @Test

    public void signUp() {

        String email = "grupa1@automation.com"; //

        LOG.info("Click button");
        signInPage.clickSkipSignInButton();

        LOG.info("Navigate Back");
        signInPage.clickBack();

        LOG.info("Click button");
        signInPage.typeInSignUpEmailField(email);


        LOG.info("Click Enter to Sign Up Button");
        signInPage.clickEnterSignUpButton();




    }
}