package com.embebidas;
 
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter @Setter
public class DireccionDelCliente {
 
    @Column(length = 255)
    String direccionC1;
    
    @Column(length = 255)
    String direccionC2;
 
    @Telephone
    @Column(length = 50)
    Long telefonoC1;
 
    @Telephone
    @Column(length = 50)
    Long telefonoC2;
    
    @Telephone
    @Column(length = 50)
    Long celularC1;

    @Telephone
    @Column(length = 50)
    Long celularC2;
	/*
    @ManyToOne( // La referencia se almacena como una relación en la base de datos
            fetch=FetchType.LAZY, // La referencia se carga bajo demanda
            optional=false) // La referencia puede estar sin valor
        @DescriptionsList // Así la referencia se visualiza usando un combo
        Regiones regionC; // Una referencia Java convencional

    @ManyToOne( // La referencia se almacena como una relación en la base de datos
            fetch=FetchType.LAZY, // La referencia se carga bajo demanda
            optional=false) // La referencia puede estar sin valor
        @DescriptionsList // Así la referencia se visualiza usando un combo
        Provincias provinciaC; // Una referencia Java convencional
	
    @ManyToOne( // La referencia se almacena como una relación en la base de datos
            fetch=FetchType.LAZY, // La referencia se carga bajo demanda
            optional=false) // La referencia puede estar sin valor
        @DescriptionsList // Así la referencia se visualiza usando un combo
        Distritos distritosC; // Una referencia Java convencional

    @ManyToOne( // La referencia se almacena como una relación en la base de datos
            fetch=FetchType.LAZY, // La referencia se carga bajo demanda
            optional=false) // La referencia puede estar sin valor
        @DescriptionsList // Así la referencia se visualiza usando un combo
        Barrios barriosC; // Una referencia Java convencional
*/
    
}