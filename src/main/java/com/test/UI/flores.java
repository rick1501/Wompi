package com.test.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class flores extends PageObject {
    public static final Target BTNMAS = Target.the("BTNMAS")
            .located(By.xpath("//h2[.='Évora – 24 rosas']"));


    public static final Target BTNADDTOCART = Target.the("BTNADDTOCART")
            .located(By.xpath("//button[normalize-space()='Añadir al carrito']"));
}
