package com.embebidas;
 
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter @Setter
public class DireccionFiscal {
 
    @Column(length = 255) // Los miembros se anotan igual que en las entidades
    String razonsocial;

    @TextArea
    @Column(length = 255)
    String direccion1;

    @Telephone
    @Column(length = 50)
    Long telefono1;
 
    @Telephone
    @Column(length = 50)
    Long telefono2;
    
    @Telephone
    @Column(length = 50)
    Long celular1;

    @Telephone
    @Column(length = 50)
    Long celular2;
    
}