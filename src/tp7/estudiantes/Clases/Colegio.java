/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7.estudiantes.Clases;

import java.util.Iterator;

/**
 *
 * @author luciano.echevarne
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno pepe=new Alumno(1001,"Lopez","Martin");
        Alumno pepA=new Alumno(1002,"Martinez","Brenda");
        Materia mate=new Materia(111,"Matematica",01);
        Materia in=new Materia (222,"Ingles 1",01);
        Materia in2=new Materia (222,"Ingles 1",01);
        Materia lab=new Materia (333,"Laboratorio 1",01);
        
        pepe.agregarMateria(in);
        pepe.agregarMateria(lab);
        pepe.agregarMateria(in2);
        pepe.agregarMateria(mate);
        System.out.println(pepe.cantidadMaterias());
        Iterator<Materia> it=pepe.lista.iterator();
        while (it.hasNext()) {
            Materia m=it.next();
            System.out.println(m.nombre);
        }
    }
    
}
