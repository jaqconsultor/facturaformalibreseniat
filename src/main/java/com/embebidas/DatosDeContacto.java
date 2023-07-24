package com.embebidas;
 
import javax.persistence.*;

import lombok.*;
 
@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter @Setter
public class DatosDeContacto {
 
    @Column(length = 150) // Los miembros se anotan igual que en las entidades
    String nombredelcontacto1;
 
    @Column(length = 50)
    Long telefonocontacto1;
    
    @Column(length = 50)
    Long celularcontacto1;

    @Column(length = 150) // Los miembros se anotan igual que en las entidades
    String nombredelcontacto2;
    
    @Column(length = 50)
    Long telefonocontacto2;
    
    @Column(length = 50)
    Long celularcontacto2;
    
}