package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionInicio extends PageObject {
    public static Target MENSAJE_INICIO = Target.the("mensaje con el nombre")
            .located(By.xpath("//span[@class='exito-login-4-x-greetingsText ml2']"));
}
