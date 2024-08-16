package Dominio;

import Library.Request;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;
import Library.Request;

public class Pastel extends Postre implements Personalizable {
    private double precioBase;
    private List<String> ingredientes;
    private List<Double> preciosIngredientes;

    public Pastel(double precioBase) {
        this.precioBase = precioBase;
        this.ingredientes = new ArrayList<>();
        this.preciosIngredientes = new ArrayList<>();
        ingredientes.add("Harina");
        preciosIngredientes.add(3000.0);
        ingredientes.add("Azúcar");
        preciosIngredientes.add(2500.0);
        ingredientes.add("Huevos");
        preciosIngredientes.add(1800.0);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = precioBase;
        for (double precioIngrediente : preciosIngredientes) {
            precioTotal += precioIngrediente;
        }
        return precioTotal;
    }

    @Override
    public void mostrarIngredientes() {
        String ingredientesResultado = ("Ingredientes:\n");
        for (int i = 0; i < ingredientes.size(); i++) {
            ingredientesResultado += (ingredientes.get(i)) + (" - $") +(preciosIngredientes.get(i)) + ("\n");
        }
        Request.showMessage(ingredientesResultado.toString());
    }

    @Override
    public void agregarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
        double precioIngrediente = Request.requestDouble("Ingrese el precio del ingrediente " + ingrediente + ":");
        preciosIngredientes.add(precioIngrediente);
    }
    public void personalizarPastel() {
        boolean seguirPersonalizando = true;
        while (seguirPersonalizando) {
            String ingrediente = Request.requestString("Ingrese un ingrediente para agregar o 'fin' para terminar:");
            if (ingrediente.equalsIgnoreCase("fin")) {
                seguirPersonalizando = false;
            } else {
                agregarIngrediente(ingrediente);
            }
        }
    }
}


