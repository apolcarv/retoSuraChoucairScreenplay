package stepDefinition;

import co.com.sura.screenplay.helpers.Constant;
import co.com.sura.screenplay.helpers.TestInfo;
import co.com.sura.screenplay.question.home.ValidarTextoHome;
import co.com.sura.screenplay.question.preRegistro.ValidaTextoCrearCuenta;
import co.com.sura.screenplay.question.registro.ValidarTextoCrearCuentaFrm;
import co.com.sura.screenplay.question.registro.ValidarTextoCuentaCreada;
import co.com.sura.screenplay.task.abrirNavegadorWeb.Abrir;
import co.com.sura.screenplay.task.home.IngresarASingIn;
import co.com.sura.screenplay.task.preRegistro.PreRegistro;
import co.com.sura.screenplay.task.registro.FrmCrearCuentaDatosPersonales;
import co.com.sura.screenplay.task.registro.FrmCrearCuentaDatosSusDirecciones;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStep {

    private TestInfo testInfo;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("que el usuario ingresa a la pagina web para la creacion de una cuenta en automationpractice {string} {string}")
    public void queElUsuarioIngresaALaPaginaWebParaLaCreacionDeUnaCuentaEnAutomationpractice(String escenario, String funcionalidad) {
        TestInfo testInfo = new TestInfo(escenario,funcionalidad);
        theActorCalled(Constant.MR_ROBOT).attemptsTo(Abrir.navegadorWebURL());
        theActorInTheSpotlight().should(seeThat(ValidarTextoHome.estoyEnElHome()));
        theActorCalled(Constant.MR_ROBOT).attemptsTo(IngresarASingIn.sign_In());
        theActorInTheSpotlight().should(seeThat(ValidaTextoCrearCuenta.estoyEnLaInterfazCrearCuenta()));
        theActorCalled(Constant.MR_ROBOT).attemptsTo(PreRegistro.ingresarCorreoElectronico());
        theActorInTheSpotlight().should(seeThat(ValidarTextoCrearCuentaFrm.validartextoCrearRegistro()));
    }

    @Cuando("ingresa el modulo de registro y llena todo el formulario de datos personas y direccion")
    public void ingresaElModuloDeRegistroYLlenaTodoElFormularioDeDatosPersonasYDireccion() {
        theActorCalled(Constant.MR_ROBOT).attemptsTo(FrmCrearCuentaDatosPersonales.llenarFormularioInformacionPersonal());
        theActorCalled(Constant.MR_ROBOT).attemptsTo(FrmCrearCuentaDatosSusDirecciones.llenarFormularioDeDirecciones());
    }

    @Entonces("el usuario crea su cuenta automationpractice con exito")
    public void elUsuarioCreaSuCuentaAutomationpracticeConExito() {
        theActorInTheSpotlight().should(seeThat(ValidarTextoCuentaCreada.cuentaCreadaConExito()));
    }

}
