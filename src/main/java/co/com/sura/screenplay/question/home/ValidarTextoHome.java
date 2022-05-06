package co.com.sura.screenplay.question.home;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sura.screenplay.ui.home.HomePage.TXT_HOME;


public class ValidarTextoHome implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TXT_HOME, WebElementStateMatchers.containsText(Constant.TEXTO_PAG_CARGADA_HOME))
                .forNoMoreThan(Constant.INTERMEDIATE).seconds());
        return true;
    }
    public static ValidarTextoHome estoyEnElHome(){
        return  new ValidarTextoHome();
    }
}
