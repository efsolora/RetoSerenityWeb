package com.sofkau.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class NavegarProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        );
    }
    public static NavegarProductos navegarProductos(){
        return new NavegarProductos();
    }
}
