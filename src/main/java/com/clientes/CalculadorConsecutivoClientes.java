package com.clientes; // En el paquete 'calculadores'
 
import javax.persistence.*;

import org.openxava.calculators.*; // Para usar 'ICalculator'
import org.openxava.jpa.*;
 
public class CalculadorConsecutivoClientes implements ICalculator {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Object calculate() throws Exception {
    	int numero;
        Query query = XPersistence.getManager().createQuery(
                "select max(f.numero) from " +
                " Clientes " + 
                " f ");
            Integer ultimoNumero = (Integer) query.getSingleResult();
            numero = ultimoNumero == null ? 1 : ultimoNumero + 1;
        return numero;
    }
}