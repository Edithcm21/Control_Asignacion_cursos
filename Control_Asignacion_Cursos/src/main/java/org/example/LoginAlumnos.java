package org.example;

import javax.swing.*;
import java.awt.*;

public class LoginAlumnos extends JFrame{
    private JTextField correo;
    private JPasswordField contraseña;
    private JButton btnIngresar;
    private JPanel Panel1;
    private JFrame frame;

    public LoginAlumnos(){
        frame=new JFrame("Login Alumnos");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250,500));

        frame.setResizable(false);
        frame.add(Panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
