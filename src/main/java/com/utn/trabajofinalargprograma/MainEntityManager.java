/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utn.trabajofinalargprograma;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Cliente;
import modelo.Especialidad;
import org.hibernate.Query;

/**
 *
 * @author Gerardo
 */
public class MainEntityManager {

    private static EntityManager manager;
    private static EntityManagerFactory managerFactory;

    
    public static void main(String[] args) {
        managerFactory = Persistence.createEntityManagerFactory("TrabajoFinalArgPrograma");
	manager = managerFactory.createEntityManager();
        
        /*Especialidad esp = new Especialidad();
        esp.setDenominacion("Java");
        manager.getTransaction().begin();
        manager.persist(esp);
        manager.getTransaction().commit();
        esp = new Especialidad();
        esp.setDenominacion("Linux");
        manager.getTransaction().begin();
        manager.persist(esp);
        manager.getTransaction().commit();
        esp = new Especialidad();
        esp.setDenominacion("Windows");
        manager.getTransaction().begin();
        manager.persist(esp);
        manager.getTransaction().commit();*/
        
        List<Especialidad> especialidades = manager.createQuery("SELECT esp FROM Especialidad esp").getResultList();
        for(Especialidad e : especialidades){
            System.out.println(e.getDenominacion());
        }
        System.out.println("-----------");
        
        Especialidad espEncontrada = manager.getReference(Especialidad.class, 1L);
        if(espEncontrada != null)
            System.out.println(espEncontrada.getDenominacion());
        
         
    }
    
}
