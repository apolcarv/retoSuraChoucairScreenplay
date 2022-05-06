package co.com.sura.screenplay.question.preRegistro;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sura.screenplay.ui.preRegistro.PreRegistroPage.TEXT_CREAR_CUENTA;


public class ValidaTextoCrearCuenta implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TEXT_CREAR_CUENTA, WebElementStateMatchers.containsText(Constant.TEXTO_PAG_CREAR_CUENTA))
                .forNoMoreThan(Constant.INTERMEDIATE).seconds());
        return true;
    }
    public static ValidaTextoCrearCuenta estoyEnLaInterfazCrearCuenta(){
        return  new ValidaTextoCrearCuenta();
    }
}
