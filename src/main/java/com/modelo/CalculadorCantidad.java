package com.modelo; // En el paquete 'calculadores'
 
import org.openxava.calculators.*; // Para usar 'ICalculator'
 
public class CalculadorCantidad implements ICalculator {
 
    public Object calculate() throws Exception {
    	int numero;
    	numero = 1;
        return numero;
    }
}