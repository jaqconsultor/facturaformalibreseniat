package com.modelo.factura; // En el paquete 'calculadores'
 
import javax.persistence.*;

import org.openxava.calculators.*; // Para usar 'ICalculator'
import org.openxava.jpa.*;
 
public class CalculadorConsecutivo implements ICalculator {
 
    public Object calculate() throws Exception {
    	int numero;
        Query query = XPersistence.getManager().createQuery(
                "select max(f.numero) from " +
                " Facturas " + 
                " f ");
            Integer ultimoNumero = (Integer) query.getSingleResult();
            numero = ultimoNumero == null ? 1 : ultimoNumero + 1;
        return numero;
    }
}