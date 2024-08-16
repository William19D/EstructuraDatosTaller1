package Ejecutable;

import Dominio.Factura;
import Library.Request;

public class ExecFactura {

    public static void main(String[] args) {

        int tam = Request.requestInt("Ingrese el tamaño de la Matriz");

        Factura[][] matriz = new Factura[tam][tam];
        int cont = 0;
        for (int i = 0; i < tam; i++) {

            for (int j = 0; j < tam; j++) {
                cont++;
                matriz[i][j] = new Factura(Request.requestInt("Ingrese el valor de la Factura " + cont));
            }
        }

        Request.showMessage("El Promedio de las facturas es: " + obtenerPromedio(matriz));

    }

    public static double obtenerPromedio(Factura[][] matriz){
        double promedio = 0;
        int tam = (matriz.length + matriz[1].length);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                promedio += matriz[i][j].getValorTotal();
            }
        }
        promedio = (promedio/tam);
        return  promedio;
    }
}
