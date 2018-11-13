/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempleado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author admin
 */
public class DialogoTerminadorEmpleado implements IVistaTerminadorEmpleado, ActionListener{
    IControladorTerminadorEmpleado modelo;
    ICosas1 modelo2;
    
    JFrame marco;
    JPanel panel;
    JList lista;
    DefaultListModel array;
    JButton borrar, escoger;
    boolean permiso;
    String escogido;
    
    public DialogoTerminadorEmpleado(){
        marco = new JFrame();
        marco.setSize(700, 700);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel();
        panel = (JPanel)marco.getContentPane();        
        array = new DefaultListModel();
        lista = new JList(array);
        borrar = new JButton("BORRAR");
        escoger = new JButton("ESCOGER");
        panel.add(lista);
        panel.add(borrar);
        panel.add(escoger);
        
        panel.setLayout(null);
        
        lista.setBounds(50, 50, 300, 500);
        borrar.setBounds(400, 50, 100, 75);
        borrar.setActionCommand("B");
        borrar.addActionListener(this);
        escoger.setBounds(400, 200, 100, 75);
        escoger.setActionCommand("E");
        escoger.addActionListener(this);
        
        
        
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
       
        array.removeElement( modelo.seleccionCambiada(escogido));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand()=="E"){
           escogido = (String)lista.getSelectedValue();
        }
        if(ae.getActionCommand()=="B"){            
            borraSeleccion();
            modelo.termina();
        }
    }
    
}
