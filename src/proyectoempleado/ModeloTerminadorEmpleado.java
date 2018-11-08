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
public class ModeloTerminadorEmpleado implements IControladorTerminadorEmpleado, ICosas1{
    
    IVistaTerminadorEmpleado vista;
    ArrayList <String> empleado2;
    public String empleadoseleccionado;
    
    public void inicializar (ArrayList <String> a){
        empleado2 = a;
        
        ;
    }

    @Override
    public String seleccionCambiada(String empleado) {
        
        for ( int i = 0; i< empleado2.size(); i++){
            if (empleado2.get(i)== empleado){
               empleadoseleccionado = empleado; 
            }
        }
        return empleadoseleccionado;
    }

    @Override
    public void termina() {
        empleado2.remove(empleadoseleccionado);
    }

    @Override
    public int getSize() {
        return empleado2.size();
    }

    @Override
    public String get(int posicion) {
        return empleado2.get(posicion);
    }

    @Override
    public String getempleado() {
        return empleadoseleccionado;
    }
    
}
