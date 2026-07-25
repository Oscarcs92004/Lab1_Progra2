/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class Ticket {

    private String nombre;
    private double montoFinal;
    private double montoInicio;
    private boolean esPalindromo;

    public Ticket(String nombre, double montoOriginal, double montoFinal, boolean palindromo) {
        this.nombre = nombre;
        this.montoInicio = montoOriginal;
        this.montoFinal = montoFinal;
        this.esPalindromo = palindromo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public double getMontoInicio() {
        return montoInicio;
    }

    public boolean isEsPalindromo() {
        return esPalindromo;
    }
    
    public void print(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Monto pagado: "+this.montoFinal);
        System.out.println("Monto original: "+this.montoInicio);
        System.out.println("Aplico descuento por palindromo? "+(this.esPalindromo ? "Si":"No") );
    }
}
