package co.com.sura.screenplay.task.preRegistro;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Locale;
import java.util.Random;

import static co.com.sura.screenplay.ui.preRegistro.PreRegistroPage.BUTTON_CREAR_CUENTA;
import static co.com.sura.screenplay.ui.preRegistro.PreRegistroPage.INPUT_CORREO_ELECTRONICO;

public class PreRegistro implements Task {

    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());
    public String correo;

    @Override
    public <T extends Actor> void performAs(T actor) {
        correo = faker.internet().emailAddress().replace(" ", "_");
        actor.attemptsTo(Enter.theValue(correo).into(INPUT_CORREO_ELECTRONICO));
        actor.attemptsTo(Click.on(BUTTON_CREAR_CUENTA));
    }
    public static Performable ingresarCorreoElectronico(){
        return Tasks.instrumented(PreRegistro.class);
    }
}
