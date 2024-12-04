package com.test.UI;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ingresodatos extends PageObject {
    public static final Target FIRST_NAME_FIELD = Target.the("First Name field")
            .located(By.id("billing_first_name"));
    public static final Target LAST_NAME_FIELD = Target.the("Last Name field")
            .located(By.id("billing_last_name"));

    public static final Target CEDULA = Target.the("CEDULA")
            .located(By.id("billing_document_id"));

    public static final Target MOBILE_FIELD = Target.the("Mobile field")
            .located(By.id("billing_phone"));

    public static final Target EMAIL_FIELD = Target.the("Email field")
            .located(By.id("billing_email"));

    public static final Target BTNADD2 = Target.the("BTNADD2")
            .located(By.xpath("//button/span[@class=\"cuw-offer-cta-text\"]"));

    public static final Target BTNCANT = Target.the("BTNCANT")
            .located(By.xpath("//div/span[@class='cuw-plus']"));




}
