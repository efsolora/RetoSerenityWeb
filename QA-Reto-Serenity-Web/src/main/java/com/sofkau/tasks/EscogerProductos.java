package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.ui.ComprarProductos.*;

public class EscogerProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Leche entera").into(INPUTBUSCAR),
                Click.on(FILTRO),
                Click.on(MAYORPRECIO)
        );

    }

    public static EscogerProductos escogerProductos(){
        return new EscogerProductos();}
}
