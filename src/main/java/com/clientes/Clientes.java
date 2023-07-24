package com.clientes;
 
import javax.persistence.*;

import org.openxava.annotations.*;

import com.extensiones.*;

import lombok.*;

@Entity @Getter @Setter
@View(name="Simple", // Esta vista solo se usará cuando se especifique “Simple”
members="id, descripcion" // Muestra únicamente numero y nombre en la misma línea
)
public class Clientes extends Incrementable2 {
	
	@Column(length = 6)
	@DefaultValueCalculator(CalculadorConsecutivoClientes.class) // A�o actual	//@ReadOnly // El usuario no puede modificar el valor
	@ReadOnly 	
	@SearchKey
	int numero;
	
	String rif;
	
	String direccion1;
	
	String direccion2;
	
	String telefono1;
	
	String telefono2;
	
		
}





