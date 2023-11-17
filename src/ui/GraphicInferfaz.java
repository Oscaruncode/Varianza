package ui;

import java.awt.*;

import javax.swing.*;

public class GraphicInferfaz extends JFrame {

    private PanelImagen panelImagen;
    private PanelOperacion panelOperacion1,panelOperacion2,panelOperacion3;
    private PanelOpciones panelOpciones;

    public GraphicInferfaz( )
    {
        setTitle( "Estadistica" );
        setSize( 800, 720 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLayout( new BorderLayout( ) );
        setLocationRelativeTo( null );
        setResizable( true );

        //Panel North
        panelImagen = new PanelImagen();
        add( panelImagen, BorderLayout.NORTH );

        //Panel Center
        JPanel panelCentro = new JPanel( );
        panelCentro.setLayout( new GridLayout( 2, 2 ) );

        panelOperacion1 = new PanelOperacion(this, "Mediana");
        panelCentro.add( panelOperacion1 );
        panelOperacion2 = new PanelOperacion(this,"Moda");
        panelCentro.add( panelOperacion2 );
        panelOperacion3 = new PanelOperacion(this,"Varianza");
        panelCentro.add( panelOperacion3 );
        add( panelCentro, BorderLayout.CENTER );

        //Panel South
        panelOpciones = new PanelOpciones( this );
        add( panelOpciones, BorderLayout.SOUTH );


    }



}
