package ex6_swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Elin on 20.11.2017.
 */
public class MyWindow extends JFrame{
    public MyWindow() {
        setSize(400, 300);
        setTitle("Hello, Java!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea jTextArea;
        jTextArea = new JTextArea();
        add(jTextArea);

        for (int i = 0; i < 20; i++) {
           jTextArea.append("Welcome to Khasang!\n");
        }

        setVisible(true);
    }
}
