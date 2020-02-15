package HomeWork8;

import borderlayout.BorderLayout4;

import javax.swing.*;
import java.awt.*;

public class Task1 {
        static public class MyWindow extends JFrame {
            public MyWindow() {
                setBounds(500,200,400,400);
                setTitle("TicTacToe");
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                JButton[] jbs = new JButton[9];
                setLayout(new GridLayout(3, 3));
                for (int i = 0; i < jbs.length; i++) {
                    jbs[i] = new JButton();
                    add(jbs[i]);
                }
                setVisible(true);
            }
        }

        public static void main(String[] args) {
            new MyWindow();
        }

    }

