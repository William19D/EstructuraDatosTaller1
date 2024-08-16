package Ejecutable;

import Library.Request;

import java.util.Arrays;

public class EjecutableDeclaraciones {

    public static void main(String[] args) {
        declararNumerosEnteros();
        declararNumerosDecimales();
        declararTextos();
        declararArreglos();

    }

    public static void declararNumerosEnteros(){
        int num1 = 413;
        int num2 = 156;
        int num3 = 798;
        int num4 = 292;

        int resultado = num1 * num2 * num3 * num4;
        Request.showMessage(String.valueOf(resultado));
    }
    public static void declararNumerosDecimales(){
        double num1 = 4932.2;
        double num2 = 7461.7;
        double num3 = 2986.2;
        double num4 = 1548.5;
        double resultado = num1 * num2 * num3 * num4;
        Request.showMessage(String.valueOf(resultado));

    }

    public static void declararTextos(){

        char caracter1 = '@';
        char caracter2 = ']';
        String string1 = "adios";
        String string2 = "hola";

        Request.showMessage(caracter1 + " " + caracter2);
        Request.showMessage(string2 + " " + string1);

    }

    public static void declararArreglos(){
        int [] arregloInt = {51,76,1,95};
        long [] arregloLong = {421512512,566565753,613647318};
        char [] arregloChar = {'e','h','z','k'};
        String [] arregloString = {"Manzana","Adios","Agua"};

        Request.showMessage(Arrays.toString(arregloInt));
        Request.showMessage(Arrays.toString(arregloLong));
        Request.showMessage(Arrays.toString(arregloChar));
        Request.showMessage(Arrays.toString(arregloString));

    }

}
