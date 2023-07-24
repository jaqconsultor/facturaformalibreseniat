package com.calculadores; // En el paquete 'calculadores'
 
import org.openxava.calculators.*; // Para usar 'ICalculator'

import com.modelo.*;
 
public class CalculadorPorcentajeIVA implements ICalculator {
 
    public Object calculate() throws Exception {
        return PreferenciasFacturacion.getPorcentajeIVADefecto();
    }
}