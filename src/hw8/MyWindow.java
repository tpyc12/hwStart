package hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWindow extends JFrame {
    public MyWindow() {
//        setTitle("Test window");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setBounds(300,300,400,400);
//        JButton button = new JButton("Button 1 (PAGE_START)");
//        add(button, BorderLayout.PAGE_START);
//        button = new JButton("Button 2 (CENTER)");
//        button.setPreferredSize(new Dimension(200,100));
//        add(button, BorderLayout.CENTER);
//        button = new JButton("Button 3 (LINE_START)");
//        add(button, BorderLayout.LINE_START);
//        button = new JButton("Long-Named Button 4 (PAGE_END)");
//        add(button, BorderLayout.PAGE_END);
//        button = new JButton("5 (LINE_END)");
//        add(button, BorderLayout.LINE_END);
//
//        setVisible(true);

//        setBounds(500, 500, 500, 300);
//        setTitle("BoxLayoutDemo");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        JButton[] jbs = new JButton[10];
////        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // одну из строк надо закомментировать
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS)); // одну из строк надо закомментировать
//        for (int i = 0; i < jbs.length; i++) {
//            jbs[i] = new JButton("#" + i);
//            jbs[i].setAlignmentX(CENTER_ALIGNMENT);
//            add(jbs[i]);
//        }
        setBounds(500, 500, 400, 300);
        setTitle("Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        add(pan);
        pan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("MousePos: " + e.getX() + " " + e.getY());
            }
        });
        setVisible(true);
    }
}
