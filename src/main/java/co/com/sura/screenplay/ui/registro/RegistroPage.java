package co.com.sura.screenplay.ui.registro;

import co.com.sura.screenplay.helpers.Constant;
import co.com.sura.screenplay.helpers.DateUtils;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroPage extends PageObject {

    /**
     * Localizadores formulario datos personales
     */

    public static final Target TEXT_INFORMACION_PERSONAL = Target.the("Valida que este en el formulario para crear la cuenta")
            .located(By.cssSelector(".account_creation:nth-child(1) > .page-subheading"));

    public Target CHECKBUTTON_SELECCIONE_TITULO = Target.the("" + Constant.EL_USUARIO +" "+ Constant.MR_ROBOT + "  debera escoger el titulo de acuerdo a su tipo de genero o como el se indentifique")
            .located(By.xpath("//*[@id='uniform-id_gender" + DateUtils.seleccionarTitulo() + "']"));

    public static final Target INPUT_NOMBRES = Target.the("" + Constant.EL_USUARIO +" "+ Constant.MR_ROBOT + "  debera ingresar sus nombres completos")
            .located(By.id("customer_firstname"));

    public static final Target INPUT_APELLIDOS = Target.the("" + Constant.EL_USUARIO +" "+ Constant.MR_ROBOT + "  debera ingresar sus apellidos completos")
            .located(By.id("customer_lastname"));

    public static final Target INPUT_EMAIL = Target.the("" + Constant.EL_USUARIO +" "+ Constant.MR_ROBOT + "  tomara este correo para validar si el mismo que ingreso inicialmente")
            .located(By.xpath("//input[@id='email']"));

    public static final Target INPUT_PWD = Target.the("" + Constant.EL_USUARIO +" "+ Constant.MR_ROBOT + "  debera ingresar una contraseña de preferencia y que cumpla con las condiciones minimas de seguridad")
            .located(By.id("passwd"));

    public Target DATE_DIA = Target.the("" + Constant.EL_USUARIO +" "+ Constant.MR_ROBOT + "  selecciona el dia de nacimiento")
            .located(By.xpath("//*[@id='days']//*[contains(text(),'" + DateUtils.dateDia() + "')]"));

    public Target DATE_MES = Target.the("" + Constant.EL_USUARIO +" "+ Constant.MR_ROBOT + "  selecciona el mes de nacimiento")
            .located(By.xpath("//*[@id='months']//*[contains(text(),'" + DateUtils.dateMes() + "')]"));

    public Target DATE_YEAR = Target.the("" + Constant.EL_USUARIO +" "+ Constant.MR_ROBOT + "  selecciona el año de nacimiento")
            .located(By.xpath("//*[@id='years']//*[contains(text(),'" + DateUtils.dateyear() + "')]"));


    public static final Target CHECK_BUTTON_TYC_BOLETIN = Target.the("" + Constant.EL_USUARIO +" "+ Constant.MR_ROBOT + "  acepta terminos y condiciones")
            .located(By.id("newsletter"));

    public static final Target CHECK_BUTTON_OFERTAS = Target.the("" + Constant.EL_USUARIO +" "+ Constant.MR_ROBOT + "  acepta que le lleguen ofertas al correo")
            .located(By.id("optin"));


    /**
     * Localizadores formulario datos de direcciones
     */

    public static final Target INPUT_EMPRESA = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " ingresa el nombre de la empresa")
            .located(By.id("company"));

    public static final Target INPUT_DIRECCION_PRINCIPAL = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " ingresa la direccion principal")
            .located(By.id("address1"));

    public static final Target INPUT_DIRECCION_SECUNDARIA = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " ingresa la direccion secundaria")
            .located(By.id("address2"));

    public static final Target CLICDONWLIST_ESTADO = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " selecciona el estado")
            .located(By.id("id_state"));

    public Target SELECTDONWLIST_ESTADO = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " seleccion el estado al cual pertenece")
            .located(By.xpath("//*[@id='id_state']/option[" + DateUtils.seleccionaEstadoUS() + "]"));

    public static final Target INPUT_CIUDAD = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " ingresa la ciudad")
            .located(By.id("city"));

    public static final Target INPUT_CODIGO_POSTAL = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " ingresa el codido postal ya determinado por el mismo sistema")
            .located(By.id("postcode"));

    public static final Target SELECTDONWLIST_PAIS = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " selecciona el pais que aparece en la lista desplegable")
            .located(By.xpath("//*[@id='id_country']/option[2]"));

    public static final Target INPUT_COMENTARIOS = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " ingresa los comentarios")
            .located(By.id("other"));

    public static final Target INPUT_TELEFONO = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " ingresa el numero de telefono")
            .located(By.id("phone"));

    public static final Target INPUT_TELEFONO_MOVIL = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " ingresar el numero de telefono movil")
            .located(By.id("phone_mobile"));

    public static final Target INPUT_ALIAS_DIRECCION = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " ingresa un punto de referencia de la direccion o un alias")
            .located(By.id("alias"));

    public static final Target BUTTON_CREAR_CUENTA = Target.the("" + Constant.EL_USUARIO + Constant.MR_ROBOT + " presiona el boton summit para crear la cuenta")
            .located(By.id("submitAccount"));


}
