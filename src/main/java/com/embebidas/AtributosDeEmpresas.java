package com.embebidas;
 
import java.math.*;

import javax.persistence.*;

import lombok.*;
 
@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter @Setter
public class AtributosDeEmpresas {
 
	BigDecimal porcentajeEmpresa;
	
	BigDecimal porcentajeCliente;
	
	BigDecimal porcentajeRetencion;
	
	Integer cantidadDeDias;
	
    
}