package co.com.sura.screenplay.task.registro;

import co.com.sura.screenplay.helpers.Constant;
import co.com.sura.screenplay.helpers.Date;
import co.com.sura.screenplay.ui.registro.RegistroPage;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.Locale;
import java.util.Random;
import static co.com.sura.screenplay.ui.registro.RegistroPage.*;

public class FrmCrearCuentaDatosSusDirecciones implements Task {
    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());
    private static Faker fakerUS = new Faker();
    private RegistroPage registroPage;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(faker.company().name()).into(INPUT_EMPRESA));
        actor.attemptsTo(Enter.theValue(faker.address().fullAddress()).into(INPUT_DIRECCION_PRINCIPAL));
        actor.attemptsTo(Enter.theValue(faker.address().fullAddress()).into(INPUT_DIRECCION_SECUNDARIA));
        actor.attemptsTo(Enter.theValue(fakerUS.address().cityName()).into(INPUT_CIUDAD));
        actor.attemptsTo(Click.on(registroPage.SELECTDONWLIST_ESTADO));
        actor.attemptsTo(Enter.theValue(Constant.CODIGO_POSTAL).into(INPUT_CODIGO_POSTAL));
        actor.attemptsTo(Click.on(SELECTDONWLIST_PAIS));
        actor.attemptsTo(Enter.theValue(Constant.FRM_DIRECCIONES_AGREGAR_COMENTARIOS + Date.obtenerFechaActual()).into(INPUT_COMENTARIOS));
        actor.attemptsTo(Enter.theValue(fakerUS.phoneNumber().cellPhone()).into(INPUT_TELEFONO));
        actor.attemptsTo(Enter.theValue(fakerUS.phoneNumber().cellPhone()).into(INPUT_TELEFONO_MOVIL).thenHit(Keys.TAB).thenHit(Keys.BACK_SPACE));
        actor.attemptsTo(Enter.theValue(faker.pokemon().name()).into(INPUT_ALIAS_DIRECCION));
        actor.attemptsTo(Click.on(BUTTON_CREAR_CUENTA));

    }
    public static Performable llenarFormularioDeDirecciones(){
        return Tasks.instrumented(FrmCrearCuentaDatosSusDirecciones.class);
    }
}
