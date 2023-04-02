package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionRegistro.MENSAJE_CONFIRMACION;
import static com.sofkau.ui.PagarProductos.MENSAJERECIBIDO;

public class MensajeConfirmacion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJERECIBIDO.resolveFor(actor).getText();
    }
    public static MensajeConfirmacion mensajeConfirmacion(){
        return new MensajeConfirmacion();
    }
}
