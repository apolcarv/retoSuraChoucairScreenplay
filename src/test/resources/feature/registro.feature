# language: es
  Característica: Crear cuenta para el portal web automationpractice

    @Registro_exitoso
    Esquema del escenario: 001- Creacion de una cuenta para el porta web AutomationPractice
      Dado que el usuario ingresa a la pagina web para la creacion de una cuenta en automationpractice "<ESCENARIO>" "<FUNCIONALIDAD>"
      Cuando ingresa el modulo de registro y llena todo el formulario de datos personales y sus direcciones
      Entonces el usuario crea su cuenta automationpractice con exito

      Ejemplos:
    | ESCENARIO             | FUNCIONALIDAD                                                |
    | 001- CREAR UNA CUENTA | CREACION DE UNA CUENTA PARA EL PORTAL WEB AUTOMATIONPRACTICE |