/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempleado;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ProyectoEmpleado {

    /**
     * @param args the command line arguments
     */
       
    
    public static void main(String[] args) {
        ArrayList <String> empleado;
        empleado = new ArrayList();
        
        empleado.add("Victor");
        empleado.add("Miguel");
        empleado.add("Marcos");
        ModeloTerminadorEmpleado m = null;
        DialogoTerminadorEmpleado d = null;
        
        d.modelo = m;
        m.vista = d;
        m.inicializar(empleado);
        
        
        
        
      
    }
    
}
