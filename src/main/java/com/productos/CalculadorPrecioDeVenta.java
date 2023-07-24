package com.productos; // En el paquete 'calculadores'
 
import java.math.*;

import org.openxava.calculators.*; // Para usar 'ICalculator'
 
public class CalculadorPrecioDeVenta implements ICalculator {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Object calculate() throws Exception {
        BigDecimal ultimoNumero = new BigDecimal(0);
        return ultimoNumero;
    }
}