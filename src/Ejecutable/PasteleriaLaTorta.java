package Ejecutable;

import Dominio.Pastel;
import Library.Request;

public class PasteleriaLaTorta {
    public static void main(String[] args) {
        double precioBasePastel = Request.requestDouble("Ingrese el precio base del pastel:");
        Pastel pastel = new Pastel(precioBasePastel);
        pastel.personalizarPastel();
        Request.showMessage("Precio del Pastel: $" + pastel.calcularPrecio());
        pastel.mostrarIngredientes();

    }
}

