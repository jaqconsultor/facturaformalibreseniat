package com.embebidas;
 
import javax.persistence.*;

import lombok.*;
 
@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter @Setter
public class DatosDeContactoCliente {
 
    @Column(length = 150) // Los miembros se anotan igual que en las entidades
    String nombreDelContactoC1;
 
    @Column(length = 50)
    Long telefonoContactoC1;
    
    @Column(length = 50)
    Long celularContactoC1;

    @Column(length = 150) // Los miembros se anotan igual que en las entidades
    String nombreDelContactoC2;
    
    @Column(length = 50)
    Long telefonoContactoC2;
    
    @Column(length = 50)
    Long celularContactoC2;
    
}