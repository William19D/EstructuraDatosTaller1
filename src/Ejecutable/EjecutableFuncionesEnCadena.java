package Ejecutable;

import Library.Request;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjecutableFuncionesEnCadena {

    public static void main(String[] args) {

        saludar();



    }

    public static void saludar(){

        Request.showMessage("Hola");
        mostrarDia();
    }

    public static void mostrarDia(){
        LocalDate ahora = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DayOfWeek dia = ahora.getDayOfWeek();
        String fecha = ahora.format(formato);
        String diaSemana = formatearEspanol(dia);

        Request.showMessage("La fecha de hoy es " + fecha + " y es " + diaSemana );
        mostrarHora();
    }

    private static String formatearEspanol(DayOfWeek diaSemana) {
        switch (diaSemana) {
            case MONDAY:    return "Lunes";
            case TUESDAY:   return "Martes";
            case WEDNESDAY: return "Miércoles";
            case THURSDAY:  return "Jueves";
            case FRIDAY:    return "Viernes";
            case SATURDAY:  return "Sábado";
            case SUNDAY:    return "Domingo";
        }
        return null;
    }

    public static void mostrarHora(){
        LocalTime ahora = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hora = ahora.format(formato);

        Request.showMessage("La hora actual es: " + hora);

    }
}
