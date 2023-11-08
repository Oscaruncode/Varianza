package ui;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOpciones extends JPanel implements ActionListener {
    private final String[] opciones = new String[]{"Media","Mediana","Moda","Mostrar Tabla","Varianza","Desviación Estandar"};
    private JButton[] buttons = new JButton[opciones.length];
    private GraphicInferfaz panelPrincipal;
    public PanelOpciones(GraphicInferfaz parametroPanelPrincipal){
        panelPrincipal= parametroPanelPrincipal;
        setBorder( new TitledBorder( "Opciones" ) );
        setLayout( new GridLayout( 2, 3 ) );

        for (int i = 0; i < opciones.length; i++) {
            buttons[i] = new JButton(opciones[i]);
            buttons[i].setActionCommand(opciones[i]);
            buttons[i].addActionListener( this );
            add(buttons[i]);
        }

    }

    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand();
        switch (comando) {
            case "Media":
                System.out.println("Media");
                break;
            case "Mediana":
                System.out.println("Mediana");
                break;
            case "Moda":
                System.out.println("Moda");
                break;
            case "Mostrar Tabla":
                System.out.println("Mostrar");
                break;
            case "Varianza":
                System.out.println("Varianza");
                break;
            case "Desviación Estandar":
                System.out.println("Desviación");
                break;
            default:
                System.out.println("Boton Desconocido");
        }

    }
}

