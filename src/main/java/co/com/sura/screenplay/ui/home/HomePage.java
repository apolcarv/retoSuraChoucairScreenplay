package co.com.sura.screenplay.ui.home;

import co.com.sura.screenplay.helpers.Constant;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target TXT_HOME = Target.the(""+Constant.EL_USUARIO +" "+ Constant.MR_ROBOT +" valida que este en la pantalla home")
            .located(By.xpath("//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//a[contains(text(),'Women')]"));

    public static final Target BUTTON_LOGIN = Target.the(""+Constant.EL_USUARIO +" "+ Constant.MR_ROBOT +" pulsa el boton login")
            .located(By.xpath("//*[@class='login']"));

    public static final Target TXT_CUENTA_CREADA_EXITOSA = Target.the(""+Constant.EL_USUARIO +" "+ Constant.MR_ROBOT +" valida que se haya creado la cuenta exitosamente")
            .located(By.xpath("//*[@id='center_column']/p"));


}
