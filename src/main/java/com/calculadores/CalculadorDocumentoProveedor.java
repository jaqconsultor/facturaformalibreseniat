package com.calculadores; // En el paquete 'calculadores'
 
import org.openxava.calculators.*; // Para usar 'ICalculator'
 
public class CalculadorDocumentoProveedor implements ICalculator {
 
    public Object calculate() throws Exception {
        /*Query query = XPersistence.getManager().createQuery(
                "select DTYPE from " +
                " DocumentoComercial " + 
                " f ");
            String docc = (String) query.getSingleResult();
            //numero = docc == null ? "DC" : ultimoNumero + 1;
        return docc;*/
        return "FV";
    }
}