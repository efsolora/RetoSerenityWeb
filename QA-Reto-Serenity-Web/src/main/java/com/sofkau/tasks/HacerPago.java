package com.sofkau.tasks;

import com.sofkau.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.ComprarProductos.FILTRO;
import static com.sofkau.ui.PagarProductos.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class HacerPago implements Task {
    Usuario usuario = new Usuario();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTONIRAPAGAR),
                Scroll.to(CONTINUAR),
                WaitUntil.the(NOMBRE, isClickable()),
                Enter.theValue(usuario.getNombre()).into(NOMBRE),
                WaitUntil.the(NOMBRE, isClickable()),
                Enter.theValue(usuario.getApellido()).into(APELLIDO),
                Enter.theValue(usuario.getNombre()).into(NOMBRE),
                Enter.theValue(usuario.getApellido()).into(APELLIDO),
                Enter.theValue(usuario.getNombre()).into(NOMBRE),
                Enter.theValue(usuario.getApellido()).into(APELLIDO),
                Enter.theValue(usuario.getNombre()).into(NOMBRE),
                Enter.theValue(usuario.getApellido()).into(APELLIDO),
                Enter.theValue(usuario.getCelular()).into(CELULAR),
                Enter.theValue(usuario.getCc()).into(CC),
                WaitUntil.the(CONTINUAR, isClickable()),
                Click.on(CONTINUAR),
                WaitUntil.the(BOTONELIGEFECHA, isClickable()),
                Click.on(BOTONELIGEFECHA),
                Click.on(BOTONFECHA),
                Scroll.to(BOTONCONTINUAR),
                Click.on(BOTONCONTINUAR),
                Click.on(PAGOCONTRAENTREGA),
                Scroll.to(BOTONPAGAR),
                Click.on(BOTONPAGAR)
        );
    }
        public static HacerPago hacerPago(){
        return new HacerPago();
    }
}
