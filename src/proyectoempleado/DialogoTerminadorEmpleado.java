/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempleado;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class DialogoTerminadorEmpleado implements IVistaTerminadorEmpleado{
    IControladorTerminadorEmpleado modelo;
    ICosas1 modelo2;
    
    JFrame marco;
    JPanel panel;
    JList lista;
    DefaultListModel array;
    JButton borrar;
    boolean permiso;
    
    public DialogoTerminadorEmpleado(){
        marco = new JFrame();
        marco.setSize(700, 700);
        marco.setVisible(true);
        panel = new JPanel();
        panel = (JPanel)marco.getContentPane();        
        array = new DefaultListModel();
        lista = new JList(array);
        borrar = new JButton("BORRAR");
        panel.add(lista);
        panel.add(borrar);
        
        panel.setLayout(null);
        
        lista.setBounds(50, 50, 100, 500);
        borrar.setBounds(300, 50, 100, 75);
        
        
        
    }

    @Override
    public void permiteTermina() {
        permiso = true;        
    }

    @Override
    public void ponListaEmpleado(ArrayList empleados) {
        for (int i = 0; i<empleados.size(); i++){
            array.addElement(empleados.get(i));
        }
    }

    @Override
    public void borraSeleccion() {
        array.removeElement(modelo2.getempleado());
    }
    
}
