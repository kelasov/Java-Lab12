package Pr12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    GUI() {
        JFrame frame = new JFrame("Сила притяжения");
        JLabel planet = new JLabel("Выберите планету");
        planet.setBounds(60, 60, 150, 20);
        planet.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        frame.add(planet);

        JLabel attraction = new JLabel("Сила притяжения:");
        attraction.setBounds(60, 120, 250, 20);
        attraction.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        frame.add(attraction);

        JComboBox Box = new JComboBox();
        Box.setEditable(true);
        Box.addItem("Меркурий");
        Box.addItem("Венера");
        Box.addItem("Земля");
        Box.addItem("Марс");
        Box.addItem("Юпитер");
        Box.addItem("Сатурн");
        Box.addItem("Уран");
        Box.addItem("Нептун");
        Box.setBounds(60, 80, 150, 20);
        frame.add(Box);

        JLabel label = new JLabel("3,7 H/кг");
        label.setBounds(100, 140, 150, 40);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        frame.add(label);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        Box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Box.getSelectedIndex()==0)
                    label.setText("3,7 м/с²");
                if (Box.getSelectedIndex()==1)
                    label.setText("8,9 м/с²");
                if (Box.getSelectedIndex()==2)
                    label.setText("9,8 м/с²");
                if (Box.getSelectedIndex()==3)
                    label.setText("3,7 м/с²");
                if (Box.getSelectedIndex()==4)
                    label.setText("24,7 м/с²");
                if (Box.getSelectedIndex()==5)
                    label.setText("9 м/с²");
                if (Box.getSelectedIndex()==6)
                    label.setText("8,7 м/с²");
                if (Box.getSelectedIndex()==7)
                    label.setText("11 м/с²");
            }
        });
    }
}

