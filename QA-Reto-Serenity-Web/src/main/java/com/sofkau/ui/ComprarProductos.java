package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ComprarProductos extends PageObject {

    public static int number;
    public static final Target INPUTBUSCAR = Target.the("INPUTBUSCAR")
            .located(By.id("downshift-0-input"));
    public static final Target FILTRO = Target.the("FILTRO")
            .located(By.xpath("//button[@class='vtex-search-result-3-x-orderByButton ph3 pv5 mv0 pointer flex items-center justify-end bg-base c-on-base t-action--small bt br bl bb-0 br2 br--top bw1 w-100 outline-0 b--transparent pl1']"));
    public static final Target MAYORPRECIO = Target.the("MAYORPRECIO")
            .located(By.xpath("//button[contains(text(),'Mayor precio primero')]"));
    public static final Target BUSCAR = Target.the("buscar")
            .located(By.xpath("//button[@class=' vtex-store-components-3-x-searchBarIcon vtex-store-components-3-x-searchBarIcon--search flex items-center pointer bn bg-transparent outline-0 pv0 pl0 pr3']"));
    public static final Target ENVIODOMICILIO = Target.the("ENVIODOMICILIO")
            .located(By.xpath("//div[contains(text(),'Sin Costo')]"));
    public static final Target CONFIRMARDOMICILIO = Target.the("PRODUCTO1")
            .located(By.xpath("//button[contains(text(),'Confirmar')]"));
    public static final Target AGREGARPRODUCTOLECHE = Target.the("AGREGARPRODUCTO")
            .located(By.xpath("//a[@href=\"/leche-en-polvo-klim-fortificada-1200g-33516/p\"]"));
    public static final Target CIUDAD = Target.the("CIUDAD")
            .located(By.xpath("(//input[@type='text'])[2]"));
    public static final Target ALMACEN = Target.the("ALMACEN")
            .located(By.xpath("(//input[@type='text'])[3]"));

    public static final Target BOTONX = Target.the("BOTONX")
            .located(By.xpath("//span[@class='exito-geolocation-3-x-cursorPointer']"));
    public static final Target CARRITO = Target.the("CARRITO")
            .located(By.xpath("//a[@class='exito-header-3-x-minicartLink']"));
    public static final Target AGREGARCARRITO = Target.the("AGREGARCARRITO")
            .located(By.xpath("(//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer w-100 '])[1]"));

    public static final Target PRECIO = Target.the("PRECIO")
            .located(By.xpath("(//span[@class='exito-vtex-components-4-x-currencyContainer'])[1]"));

}
