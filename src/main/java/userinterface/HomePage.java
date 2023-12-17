package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target LOGIN_USER = Target.the("Username input").located(By.id("identifierId"));
    public static final Target NEXT_USER = Target.the("Next button").located(By.id("identifierNext"));
    public static final Target LOGIN_PASS = Target.the("Password input").located(By.name("Passwd"));
    public static final Target LOGIN_BUTTON = Target.the("LogIn button").located(By.id("passwordNext"));
    public static final Target USER_NAME = Target.the("Username {0}").locatedBy("//a[contains(@aria-label,'{0}')]");
    public static final Target ERROR_PASS_MESSAGE = Target.the("{0}").locatedBy("//span[@jsslot and contains(text(),'{0}')]");

}
