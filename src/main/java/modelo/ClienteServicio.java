/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gerardo
 */
@Entity
@Table(name = "arg_prog_cliente_servicio")
@Getter @Setter
public class ClienteServicio extends EntidadId{
    
    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "idservicio")
    private Servicio servicio;
}
