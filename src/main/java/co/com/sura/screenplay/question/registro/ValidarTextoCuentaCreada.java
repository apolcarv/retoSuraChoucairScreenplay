package co.com.sura.screenplay.question.registro;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sura.screenplay.ui.home.HomePage.TXT_CUENTA_CREADA_EXITOSA;

public class ValidarTextoCuentaCreada implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TXT_CUENTA_CREADA_EXITOSA, WebElementStateMatchers.containsText(Constant.TEXTO_PAG_CUENTA_CREADA_EXITOSA))
                .forNoMoreThan(Constant.INTERMEDIATE).seconds());
        return true;
    }
    public static ValidarTextoCuentaCreada cuentaCreadaConExito(){
        return new ValidarTextoCuentaCreada();
    }
}
