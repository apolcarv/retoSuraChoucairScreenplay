package co.com.sura.screenplay.task.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.sura.screenplay.ui.home.HomePage.BUTTON_LOGIN;

public class IngresarASingIn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(BUTTON_LOGIN));
    }
    public static Performable sign_In(){
        return Tasks.instrumented(IngresarASingIn.class);
    }
}
