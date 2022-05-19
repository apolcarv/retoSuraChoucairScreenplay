package co.com.sura.screenplay.helpers.Utils;

import co.com.sura.screenplay.helpers.Date;
import co.com.sura.screenplay.helpers.ManagerLog;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.logging.Logger;

public class Reporte {

    private static final String LOG_CLASE_ERROR = "Error al ejecutar el metodo de reporteria-> ";
    private static final String LOG_CLASE_EXITOSO = "Error al ejecutar el metodo de reporteria-> ";
    static PropertyLoader loadproperty = new PropertyLoader();
    public static void  reporteDeSerenity(){
        final String METODO = " -> Reporte";


        try {
            Logger LOGGER = Logger.getAnonymousLogger();
            Path rutaOrigen = Paths.get(System.getProperty("user.dir") + loadproperty.loadProperties().getProperty("rutaOrigen"));
            Path rutaDestino = Paths.get(System.getProperty("user.dir") +  loadproperty.loadProperties().getProperty("rutaDestino"));

            Files.move(rutaOrigen,rutaDestino, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileNotFoundException ex) {
            ManagerLog.imprimirFallo(LOG_CLASE_ERROR + " " + METODO + ex );
        } catch (IOException ex) {
            ManagerLog.imprimirFallo(LOG_CLASE_ERROR + " " + METODO + ex );
        }
    }

}
