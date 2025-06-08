package Ejercicioparahacer;
          //Atributos: numero (int), tipo (String), precioBase (double)
public class Habitacion {
              private int numero;
              private String tipo;
              private double precioBase;

              public Habitacion(int numero, String tipo, double precioBase) {
                  this.numero = numero;
                  this.tipo = tipo;
                  this.precioBase = precioBase;
              }

              public double getprecioBase() {
                  return this.precioBase;
              }



              public double CalcularPrecioFinal(int dias) {
                  return dias * precioBase;
              }

              public void mostrarDetalle() {
                  System.out.println("Numero de habitación; " + numero);
                  System.out.println("Tipo de habitación; " + tipo);
                  System.out.println("Precio base; " + precioBase);
              }
          }
