package co.com.sura.screenplay.ui.preRegistro;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PreRegistroPage extends PageObject {

    public static final Target TEXT_CREAR_CUENTA = Target.the(""+Constant.EL_USUARIO +" "+ Constant.MR_ROBOT +" valida que se encuentre en la pagina de crear la cuenta")
            .located(By.cssSelector("#create-account_form > .page-subheading"));

    public static final Target INPUT_CORREO_ELECTRONICO = Target.the(""+Constant.EL_USUARIO +" "+ Constant.MR_ROBOT +" ingresar un correo electronico para su respectiva validacion")
            .located(By.id("email_create"));

    public static final Target BUTTON_CREAR_CUENTA = Target.the(""+Constant.EL_USUARIO +" "+ Constant.MR_ROBOT +" pulsa el boton para confirmar el  ingreso de correo valido")
            .located(By.id("SubmitCreate"));
}
