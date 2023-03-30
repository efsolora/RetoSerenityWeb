package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.LlenarRegistro.llenarRegistro;
import static com.sofkau.tasks.LlenarRegistro.nombreUsuario;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class InicioSesionStepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(InicioSesionStepDefinitions.class);
    @Dado("que el usuario esta en la pagina de inicio")
    public void que_el_usuario_esta_en_la_pagina_de_inicio() {
        configurarNavegador();

        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaInicial()
        );
    }

    @Cuando("iniciar sesion")
    public void iniciar_sesion() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
        );
    }



    @Cuando("escoge el producto de mayor valor")
    public void escoge_el_producto_de_mayor_valor() {

    }

    @Entonces("se ve un mensaje finaizar compra")
    public void se_ve_un_mensaje_finaizar_compra() {

    }

}