package co.com.sura.screenplay.helpers.Utils;

import co.com.sura.screenplay.helpers.Date;
import java.io.File;
import java.nio.file.*;


public class Reporte {


    static PropertyLoader loadproperty = new PropertyLoader();
    public static void  reporteDeSerenity()  {

        File file = new File(String.valueOf(Paths.get(System.getProperty("user.dir") + loadproperty.loadProperties().getProperty("rutaOrigen"))));
        file.renameTo (new File(String.valueOf(Paths.get(System.getProperty("user.dir") +  loadproperty.loadProperties().getProperty("rutaDestino") + Date.convertirFechaConHora()+ "_reporte_index.html"))));
    }

}
