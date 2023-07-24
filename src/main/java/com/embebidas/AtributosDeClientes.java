package com.embebidas;
 
import java.math.*;

import javax.persistence.*;

import lombok.*;
 
@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter @Setter
public class AtributosDeClientes {
 
	BigDecimal porcentajeEmpresa;
	
	BigDecimal porcentajeCliente;
	
	Integer cantidadDeDias;
    
}