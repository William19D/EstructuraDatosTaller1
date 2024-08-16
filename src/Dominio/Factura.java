package Dominio;

public class Factura {

    private double valorTotal;

    public Factura(){
        valorTotal =0;
    }

    public Factura(double valorTotal){
        this.valorTotal=valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
