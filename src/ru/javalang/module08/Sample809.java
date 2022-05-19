package ru.javalang.module08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Date;

public class Sample809 {
    static ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            System.out.println("Текущее время: " + date);
            Toolkit.getDefaultToolkit().beep();
        }
    };

    public static void main(String[] args) {

        Timer timer = new Timer(10000, actionListener);
        timer.start();
        JOptionPane.showMessageDialog(null,"Exit");
        System.exit(0);
    }
}
