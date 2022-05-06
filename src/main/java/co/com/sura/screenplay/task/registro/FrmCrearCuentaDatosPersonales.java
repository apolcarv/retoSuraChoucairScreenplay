package co.com.sura.screenplay.task.registro;

import co.com.sura.screenplay.ui.registro.RegistroPage;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.Locale;
import java.util.Random;
import static co.com.sura.screenplay.ui.registro.RegistroPage.*;

public class FrmCrearCuentaDatosPersonales implements Task {

    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());
    private RegistroPage registroPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(registroPage.CHECKBUTTON_SELECCIONE_TITULO));
        actor.attemptsTo(Enter.theValue(faker.name().firstName()).into(INPUT_NOMBRES));
        actor.attemptsTo(Enter.theValue(faker.name().lastName()).into(INPUT_APELLIDOS));
        actor.attemptsTo(Enter.theValue(faker.internet().password()).into(INPUT_PWD));
        actor.attemptsTo(Click.on(registroPage.DATE_DIA));
        actor.attemptsTo(Click.on(registroPage.DATE_MES));
        actor.attemptsTo(Click.on(registroPage.DATE_YEAR));
        actor.attemptsTo(Click.on(CHECK_BUTTON_TYC_BOLETIN));
        actor.attemptsTo(Click.on(CHECK_BUTTON_OFERTAS));
    }
    public static Performable llenarFormularioInformacionPersonal(){
        return Tasks.instrumented(FrmCrearCuentaDatosPersonales.class);
    }
}
