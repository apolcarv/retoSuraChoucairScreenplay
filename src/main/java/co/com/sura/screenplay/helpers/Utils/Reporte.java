package co.com.sura.screenplay.helpers.Utils;

import co.com.sura.screenplay.helpers.Date;
import co.com.sura.screenplay.helpers.ManagerLog;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;


public class Reporte {

    private static final String USER_DIR = "user.dir";
    static PropertyLoader loadproperty = new PropertyLoader();
    public static void     reporteDeSerenity()  {

        File directorio = new File(String.valueOf(Paths.get(System.getProperty(USER_DIR) + loadproperty.loadProperties().getProperty("rutaDestino")+ "Reporte_" + Date.convertirFechaConHora())));
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                ManagerLog.imprimirExito("Directorio creado");
            } else {
                ManagerLog.imprimirFallo("Error al crear directorio");
            }
        }
        File origen = new File(String.valueOf(Paths.get(System.getProperty(USER_DIR) + loadproperty.loadProperties().getProperty("rutaOrigen"))));
        File destino = new File(String.valueOf(Paths.get(String.valueOf(directorio))));
try{
    FileUtils.copyDirectory(origen,destino);
}catch (IOException e){
    ManagerLog.imprimirFallo("Se presento un error en el metodo de copiar el directorio_  "+e);
}

    }

}
