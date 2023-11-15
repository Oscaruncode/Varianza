package ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOperacion extends JPanel implements ActionListener{
    private GraphicInferfaz panelPrincipal;
    private static final String calcularBtn = "Calcular";
    private static final String resetBtn = "reset";
    private JLabel lblDatos,lblImagen;
    private JTextField txtDatos;

    public PanelOperacion(GraphicInferfaz parametroPanelPrincipal, String titulo){

        panelPrincipal = parametroPanelPrincipal;

        setLayout( new BorderLayout( ) );

        JPanel panelDatos = new JPanel( );
        add( panelDatos, BorderLayout.CENTER );

        panelDatos.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
        setBorder( new TitledBorder( titulo ) );

        panelDatos.setLayout( new GridLayout( 5, 1, 0, 5 ) );

        lblDatos = new JLabel( "Datos: " );
        txtDatos = new JTextField( 15 );
        txtDatos.setEditable( true );
        lblImagen = new JLabel( );
        add( lblImagen, BorderLayout.WEST );
        panelDatos.add(lblDatos);
        panelDatos.add(txtDatos);


        ImageIcon icono = new ImageIcon("C:\\Users\\elger\\IdeaProjects\\Varianza\\data\\imagenes\\lapiz.png");
        lblImagen.setIcon( icono );
    }

    public void actionPerformed( ActionEvent pEvento ){
        String comando = pEvento.getActionCommand( );
        if( comando.equals( "x" ) ){System.out.println("aaa");}
    }
}







