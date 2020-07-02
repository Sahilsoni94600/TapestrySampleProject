package sample.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tapestry5.alerts.AlertManager;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.ioc.annotations.Inject;

public class Otp {

    private static final Logger logger = LogManager.getLogger(Otp.class);

    @Inject
    private AlertManager alertManager;

    @Inject
    private Form otpForm;

    /*@InjectComponent("email")
    private TextField emailField;

    @Property
    private String email;*/

    void onValidateFromOtpForm() {
        /*if (!email.equals("sahilsoni94600@gmail.com"))
            otpForm.recordError(emailField, "Try with user: sahilsoni94600@gmail.com");*/
    }

    Object onSuccessFromOtpForm() {
        logger.info("Login successful!");
        alertManager.success("Welcome aboard!");
        return Index.class;
    }

    void onFailureFromOtpForm() {
        logger.warn("Login error!");
        alertManager.error("I'm sorry but I can't log you in!");
    }
}
