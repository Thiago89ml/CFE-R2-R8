package Producto;

import java.sql.SQLOutput;

public class Electrodomestico extends Producto{

    private String clasificacion;

    public Electrodomestico(String n, int p,String c) {
        super(n, p);
        this.clasificacion = c;
    }

    void calcularPrecioFinal(){
        if(this.clasificacion.equals("A")){
            System.out.println("Precio Final: " + ("hola"));
        }
    }
}
