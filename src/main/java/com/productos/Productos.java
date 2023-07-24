package com.productos;
 
import java.math.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;

import com.extensiones.*;

import lombok.*;
 
@Entity  // Esto marca la clase Cliente como una entidad
@Getter @Setter // Esto hace los campos a continuación públicamente accesibles
@View(name="Simple", // Esta vista solo se usará cuando se especifique “Simple”
members="numero, descripcion" // Muestra únicamente numero y nombre en la misma línea
)

@Tab(name = "Productos", baseCondition = "${esServicio} = false")
@Tab(name = "Servicios", baseCondition = "${esServicio} = true")
public class Productos  extends Incrementable {
 	
	@Column(length = 6)
	@DefaultValueCalculator(CalculadorConsecutivoProducto.class) // A�o actual	//@ReadOnly // El usuario no puede modificar el valor
	@ReadOnly 	
	@SearchKey
	int numero;
	
    @Column(length=255) 
    @Required  
    String descripcion;

    @DefaultValueCalculator(CalculadorPrecioDeVenta.class) 
    @Min(0)
    BigDecimal precioDeVenta;
    
    @DefaultValueCalculator(CalculadorEsServicio.class) 
    boolean esServicio; 
    
}