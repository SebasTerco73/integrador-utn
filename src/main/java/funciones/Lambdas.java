/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import modelo.DatosContacto;
import modelo.Especialidad;
import modelo.Tecnico;
import modelo.TecnicoEspecialidad;

/**
 *
 * @author Gerardo
 */
public class Lambdas {
    
    public static void main(String[] args) {
        
        Especialidad esp1 = new Especialidad("Hardware");
        Especialidad esp2 = new Especialidad("Software");
        Especialidad esp3 = new Especialidad("Windows");
        Especialidad esp4 = new Especialidad("Linux");
        List<Especialidad> especialidades =new ArrayList<Especialidad>();
        especialidades.add(esp1);
        especialidades.add(esp2);
        especialidades.add(esp3);
        especialidades.add(esp4);
        
        
        DatosContacto  datosContacto = new DatosContacto(4258596, 321654987, "usuario@mail.com");
        
        Tecnico tec1 = new Tecnico("Alonso", "David", 60102, datosContacto);
        Tecnico tec2 = new Tecnico("Garcia", "Pedro", 32654, datosContacto);
        Tecnico tec3 = new Tecnico("Gonzales", "Juan", 4852, datosContacto);
        
        List<TecnicoEspecialidad> tecnicoEspecialidades = new ArrayList<TecnicoEspecialidad>();
        TecnicoEspecialidad tecnicoEsp = new TecnicoEspecialidad(tec1, esp1);
        tecnicoEspecialidades.add(tecnicoEsp);
        tecnicoEsp = new TecnicoEspecialidad(tec1, esp3);
        tecnicoEspecialidades.add(tecnicoEsp);
        tecnicoEsp = new TecnicoEspecialidad(tec2, esp2);
        tecnicoEspecialidades.add(tecnicoEsp);
        tecnicoEsp = new TecnicoEspecialidad(tec2, esp3);
        tecnicoEspecialidades.add(tecnicoEsp);
        tecnicoEsp = new TecnicoEspecialidad(tec3, esp2);
        tecnicoEspecialidades.add(tecnicoEsp);
        tecnicoEsp = new TecnicoEspecialidad(tec3, esp4);
        tecnicoEspecialidades.add(tecnicoEsp);
        
        
        System.out.println("------------------------------------");
        //forEach
        System.out.println("----------forEach----------");
        tecnicoEspecialidades.forEach(tecEsp -> System.out.println(tecEsp.getTecnico().getNombreCompleto()));
        tecnicoEspecialidades.forEach(tecEsp -> {
                                                System.out.print(tecEsp.getTecnico().getNombreCompleto() + " ");
                                                System.out.println(tecEsp.getEspecialidad().getDenominacion());
                                                });
        //anyMatch
        System.out.println("-------anyMatch---------");
        boolean espLinux = tecnicoEspecialidades.stream().anyMatch(tecEsp -> tecEsp.getEspecialidad().getDenominacion().equals("Linux"));
        System.out.println("Esp Linux " + espLinux);
        boolean espJava = tecnicoEspecialidades.stream().anyMatch(tecEsp -> tecEsp.getEspecialidad().getDenominacion().equals("Java"));
        System.out.println("Esp JAVA " + espJava);
        
        //allMatch
        System.out.println("-------allMatch---------");
        boolean resultado = tecnicoEspecialidades.stream().allMatch(tecEsp -> tecEsp.getTecnico().getLegajo() > 0);
        System.out.println("Resultado " + resultado);
        
        //map
        System.out.println("-------map---------");
        Set<String> nombresCompletoTecnico = tecnicoEspecialidades.stream().map((tecEsp) ->tecEsp.getTecnico().getNombreCompleto()).collect(Collectors.toSet());
        nombresCompletoTecnico.forEach(nombreComp -> System.out.println(nombreComp));
        
        //Collections.min()
        System.out.println("-------min---------");
        TecnicoEspecialidad tecnicoMenorLegajo = Collections.min(tecnicoEspecialidades);
        System.out.println(tecnicoMenorLegajo.getTecnico().getNombreCompleto());
        
        //Collections.max()
        System.out.println("-------max---------");
        TecnicoEspecialidad tecnicoMayorLegajo = Collections.max(tecnicoEspecialidades);
        System.out.println(tecnicoMayorLegajo.getTecnico().getNombreCompleto());
        
        //IntStream.sum()
        System.out.println("-------sum---------");
        int suma = tecnicoEspecialidades.stream().mapToInt(espTec->espTec.getTecnico().getLegajo()).sum();
        System.out.println("SUMA " + suma);
        
        //Collectors.joining()
        System.out.println("-------joining---------");
        String listaEspecialidades = especialidades.stream().map(esp->esp.getDenominacion()).collect(Collectors.joining(", "));
        System.out.println(listaEspecialidades);
        
        System.out.println("------------------------------------");
    }
    
}
