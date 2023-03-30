#language:es
#encoding:UTF-8
#Author:

Característica: Inicio de sesion
  yo como usuario de la pagina del Exito
  quiero iniciar sesion
  para poder comprar productos

  Antecedentes:
    Dado que el usuario esta en la pagina de inicio
    Cuando iniciar sesion

  @Compraproducto
  Escenario: Compra exitosa
    Y escoge el producto de mayor valor
    Entonces se ve un mensaje finaizar compra