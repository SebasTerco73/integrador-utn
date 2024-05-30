/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Date;
import java.util.List;
import persistencia.ConfigHibernate;

/**
 *
 * @author Gerardo
 */
public class GestorReporteIncidencia extends Gestor {

    public GestorReporteIncidencia() {
        if(sesion == null || !sesion.isOpen())
            sesion = ConfigHibernate.openSession();
    }
    
    
    public List<Object> getReportesXFiltro(Date fechaDesde, Date fechaHasta, String estadoReporte, Long idEspecialidad){
    
        
       return null; 
    
    }
    
}
