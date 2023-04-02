package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PagarProductos extends PageObject {
    public static final Target BOTONIRAPAGAR = Target.the("BOTONIRAPAGAR")
            .located(By.xpath("//a[@href='#/orderform']"));
    public static final Target NOMBRE = Target.the("NOMBRE")
            .located(By.id("client-first-name"));
    public static final Target APELLIDO = Target.the("APELLIDO")
            .located(By.id("client-last-name"));
    public static final Target CELULAR = Target.the("CELULAR")
            .located(By.id("client-phone"));
    public static final Target CC = Target.the("CC")
            .located(By.id("client-new-document"));
    public static final Target CONTINUAR = Target.the("CONTNUAR")
            .located(By.id("go-to-shipping"));
    public static final Target BOTONELIGEFECHA = Target.the("BOTONELIGEFECHA")
            .located(By.xpath("//div[@class='']"));
    public static final Target BOTONFECHA = Target.the("BOTONFECHA")
            .located(By.xpath("(//div[contains(text(),'3')])[4]"));

    public static final Target BOTONCONTINUAR = Target.the("BOTONCONTINUAR")
            .located(By.id("btn-go-to-payment"));//a[@data-name='Pago contra entrega']
    public static final Target PAGOCONTRAENTREGA = Target.the("PAGOCONTRAENTREGA")
            .located(By.xpath("//a[@data-name='Pago contra entrega']"));
    public static final Target BOTONPAGAR= Target.the("BOTONPAGAR")
            .located(By.id("payment-data-submit"));
    public static final Target MENSAJERECIBIDO= Target.the("MENSAJERECIBIDO")
            .located(By.xpath("//p[contains(text(),'Pedido recibido')]"));
}
