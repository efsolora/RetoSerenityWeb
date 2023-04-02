package com.sofkau.tasks;

import io.cucumber.java.it.Ma;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Key;
import static com.sofkau.ui.ComprarProductos.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import net.serenitybdd.screenplay.waits.WaitUntil;

public class EscogerProductos implements Task {

    static WebDriver webDriver;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUTBUSCAR),
                Enter.theValue("Leche entera").into(INPUTBUSCAR),
                Click.on(BUSCAR),
                WaitUntil.the(CIUDAD, isClickable()),
                Click.on(CIUDAD),
                Enter.theValue("Medellin").into(CIUDAD),
                Hit.the(Keys.ENTER).into(CIUDAD),
                WaitUntil.the(FILTRO, isClickable()),
                Click.on(ALMACEN),
                Enter.theValue("san antonio").into(ALMACEN),
                Hit.the(Keys.ENTER).into(ALMACEN),
                Click.on(CONFIRMARDOMICILIO),
                WaitUntil.the(FILTRO, isClickable()),
                Click.on(BOTONX),
                Click.on(FILTRO),
                WaitUntil.the(MAYORPRECIO, isClickable()),
                Click.on(MAYORPRECIO),
                WaitUntil.the(AGREGARPRODUCTOLECHE, isClickable()),
                Click.on(AGREGARPRODUCTOLECHE),
                WaitUntil.the(AGREGARCARRITO, isClickable()),
                Click.on(AGREGARCARRITO),
                WaitUntil.the(CARRITO, isClickable()),
                Click.on(CARRITO)
        );

    }

    public static EscogerProductos escogerProductos() {
        return new EscogerProductos();
    }
}


