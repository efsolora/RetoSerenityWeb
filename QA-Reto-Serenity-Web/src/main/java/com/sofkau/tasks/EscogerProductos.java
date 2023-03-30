package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Key;
import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.ui.ComprarProductos.*;
import static com.sofkau.ui.ConfirmacionRegistro.MENSAJE_CONFIRMACION;
import static com.tigervnc.rfb.Keysyms.Select;

public class EscogerProductos implements Task {

    static WebDriver webDriver;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUTBUSCAR),
                Enter.theValue("Leche entera").into(INPUTBUSCAR),
                Click.on(BUSCAR),

                Enter.keyValues("Medellin").into(CIUDAD),
                Click.on(ALMACEN),
                Enter.theValue("EXITO colombia").into(ALMACEN),
                Click.on(CONFIRMARDOMICILIO),
                Click.on(FILTRO),
                Click.on(MAYORPRECIO)
        );

    }

    public static EscogerProductos escogerProductos() {
        return new EscogerProductos();
    }


}


