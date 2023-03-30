package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarProductos extends PageObject {

    public static int number;
    public static final Target INPUTBUSCAR = Target.the("INPUTBUSCAR")
            .located(By.xpath("//input[@placeholder='Buscar en exito.com']"));
    public static final Target FILTRO = Target.the("FILTRO")
            .located(By.xpath("//button[@class='vtex-search-result-3-x-orderByButton ph3 pv5 mv0 pointer flex items-center justify-end bg-base c-on-base t-action--small bt br bl bb-0 br2 br--top bw1 w-100 outline-0 b--transparent pl1']"));
    public static final Target MAYORPRECIO = Target.the("MAYORPRECIO")
            .located(By.xpath("//button[contains(text(),'Mayor precio primero')]"));
    public static final Target BUSCAR = Target.the("buscar")
            .located(By.xpath("//button[@class=' vtex-store-components-3-x-searchBarIcon vtex-store-components-3-x-searchBarIcon--search flex items-center pointer bn bg-transparent outline-0 pv0 pl0 pr3']"));
    public static final Target ENVIODOMICILIO = Target.the("ENVIODOMICILIO")
            .located(By.xpath("//button[@class='exito-geolocation-3-x-inactive']"));
    public static final Target CONFIRMARDOMICILIO = Target.the("PRODUCTO1")
            .located(By.xpath("//button[contains(text(),'Confirmar')]"));
    public static final Target PRODUCTO = Target.the("PRODUCTO")
            .located(By.xpath("(//span[@class='exito-vtex-components-4-x-currencyContainer'])["+ 6 + "]"));
    public static final Target CIUDAD = Target.the("CIUDAD")
            .located(By.xpath("(//div[@class='css-yiuvdt'])[1]"));
    public static final Target ALMACEN = Target.the("ALMACEN")
            .located(By.xpath("(//div[@class='css-yiuvdt'])[2]"));

    public static final Target CAR = Target.the("CAR")
            .located(By.xpath("//a[@href='/view_cart']"));
    public static final Target BUTTOMPAYMENT= Target.the("BUTTOMPAYMENT")
            .located(By.xpath("//a[@href='/payment']"));



}
