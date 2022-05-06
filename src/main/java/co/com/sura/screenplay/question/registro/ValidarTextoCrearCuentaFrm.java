package co.com.sura.screenplay.question.registro;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sura.screenplay.ui.registro.RegistroPage.TEXT_INFORMACION_PERSONAL;

public class ValidarTextoCrearCuentaFrm implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TEXT_INFORMACION_PERSONAL, WebElementStateMatchers.containsText(Constant.TEXTO_PAG_REGISTRO))
                .forNoMoreThan(Constant.INTERMEDIATE).seconds());
        return true;
    }
    public static ValidarTextoCrearCuentaFrm validartextoCrearRegistro(){
        return  new ValidarTextoCrearCuentaFrm();
    }
}
