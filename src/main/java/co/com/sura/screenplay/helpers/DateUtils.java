package co.com.sura.screenplay.helpers;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class DateUtils {
    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());


    public static int seleccionarTitulo(){
        int numTitulo = faker.number().numberBetween(Constant.DATO_MR, Constant.DATO_MRS);
        return numTitulo;
    }

    public static int dateDia(){
        int numDia = faker.number().numberBetween(Constant.DATO_DIA_INICIAL, Constant.DATO_DIA_FINAL);
        return numDia;
    }

    public static String dateMes(){
        int num = faker.number().numberBetween(Constant.DATO_MES_INICIAL, Constant.DATO_MES_FINAL);
        String numMes = Date.obtenerMes(String.valueOf(num));
        return numMes;
    }

    public static int dateyear(){
        int numYear = Date.obtenerYearActualMenos18();
        return numYear;
    }

    public static int seleccionaEstadoUS(){
        int numEstado = faker.number().numberBetween(Constant.DATO_ESTADO_INICIAL, Constant.DATO_ESTADO_FINAL);
        return numEstado;
    }
}
