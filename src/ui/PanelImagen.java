package ui;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelImagen extends JPanel {

    private JLabel lblImagen;
    private String titulo = "Derivadas";

    public PanelImagen() {

        setLayout(new BorderLayout()); // Establecer un diseño de borde para colocar la imagen en el centro del panel.
        Icon imagen = new ImageIcon("C:\\Users\\elger\\IdeaProjects\\Varianza\\data\\imagenes\\Encabezado.png");

        lblImagen = new JLabel(imagen);
        add(lblImagen, BorderLayout.CENTER);

        if (titulo != null && !titulo.isEmpty()) {
            TitledBorder border = BorderFactory.createTitledBorder(titulo);
            border.setTitleJustification(TitledBorder.CENTER);
            setBorder(border);
        }
    }
}