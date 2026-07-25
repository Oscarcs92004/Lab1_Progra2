 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author oscar
 */
public class Principal extends JFrame implements MouseListener {
    JButton[] botonAsientos;
    JTextField textoNombre;
    JButton botonVender;
    JButton botonCancelar;
    JButton botonDespachar;
    JButton botonImprimir;
    JButton botonIngresos;
    JButton botonBuscar;
    JTextArea textoMensajes;
    
    public void crearTodo(){
        setLayout(new BorderLayout());
        JPanel panelAsientos = new JPanel(new GridLayout(6,5,5,5));
        
        botonAsientos = new JButton[30];
        for(int i = 0; i < 30; i++){
            botonAsientos[i] = new JButton(" "+(i+1));
            botonAsientos[i].setBackground(Color.GREEN);
            panelAsientos.add(botonAsientos[i]);
        }
        add(panelAsientos,BorderLayout.CENTER);
        JPanel panelOpciones = new JPanel();
        panelOpciones.setLayout(new GridLayout(8,1,5,5));
        
        textoNombre = new JTextField();
        botonVender = new JButton("Vender Ticket");
        botonCancelar = new JButton("Cancelar Ticket");
        botonDespachar = new JButton("Despachar");
        botonImprimir = new JButton("Imprimir Pasajeros");
        botonIngresos = new JButton("Imprimir Ingresos");
        botonBuscar = new JButton("Buscar Pasajero");
        
        panelOpciones.add(new JLabel("Nombre pasajero"));
        panelOpciones.add(textoNombre);
        panelOpciones.add(botonVender);
        panelOpciones.add(botonCancelar);
        panelOpciones.add(botonDespachar);
        panelOpciones.add(botonImprimir);
        panelOpciones.add(botonIngresos);
        panelOpciones.add(botonBuscar);
        
        add(panelOpciones, BorderLayout.EAST);
        
        textoMensajes = new JTextArea();
        textoMensajes.setEditable(false);
        JScrollPane scroll = new JScrollPane(textoMensajes);
        scroll.setPreferredSize(new Dimension(0,75));
        add(scroll,BorderLayout.SOUTH);
    }
    
    public Principal(){
        super("Sistema de Boletos");
        setSize(1100, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        crearTodo();
        setVisible(true);
    }
    
    public static void main(String args[]){
        Principal p = new Principal();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
