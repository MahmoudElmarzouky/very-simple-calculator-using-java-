package calculator;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javafx.scene.layout.Border;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Calculator {

    public static double num1 = 0.0, num2 = 0.0, result = 0.0;
    public static char ope;
    public static double fact(double n){
    if (n==0)
        return 1;
    return n * fact(n-1);
    }
    public static void frame(JFrame f) throws IOException {
        f.setLocationRelativeTo(null);
        Image img = ImageIO.read(Calculator.class.getResource("123.png"));
        f.setIconImage(img);
        f.getContentPane().setBackground(Color.WHITE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) throws IOException {

        JFrame f = new JFrame("Calculator");
        f.setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(8, 4, 10, 10));
        JButton b1 = new JButton("sin");
        b1.setBackground(Color.lightGray);
        b1.setForeground(Color.RED);
        JButton b2 = new JButton("cos");
        b2.setBackground(Color.lightGray);
        b2.setForeground(Color.RED);
        JButton b3 = new JButton("tan");
        b3.setBackground(Color.lightGray);
        b3.setForeground(Color.RED);
        JButton b4 = new JButton("%");
        b4.setBackground(Color.lightGray);
        b4.setForeground(Color.RED);
        JButton b5 = new JButton("x^2");
        b5.setBackground(Color.lightGray);
        b5.setForeground(Color.RED);
        JButton b6 = new JButton("x^y");
        b6.setBackground(Color.lightGray);
        b6.setForeground(Color.RED);
        JButton b7 = new JButton("sqrt");
        b7.setBackground(Color.lightGray);
        b7.setForeground(Color.RED);
        JButton b8 = new JButton("1/x");
        b8.setBackground(Color.lightGray);
        b8.setForeground(Color.RED);
        JButton b9 = new JButton("1");
        b9.setBackground(Color.lightGray);
        b9.setForeground(Color.BLUE);
        JButton b10 = new JButton("2");
        b10.setBackground(Color.lightGray);
        b10.setForeground(Color.BLUE);
        JButton b11 = new JButton("3");
        b11.setBackground(Color.lightGray);
        b11.setForeground(Color.BLUE);
        JButton b12 = new JButton("*");
        b12.setBackground(Color.lightGray);
        b12.setForeground(Color.RED);
        b12.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        JButton b13 = new JButton("4");
        b13.setBackground(Color.lightGray);
        b13.setForeground(Color.BLUE);
        JButton b14 = new JButton("5");
        b14.setBackground(Color.lightGray);
        b14.setForeground(Color.BLUE);
        JButton b15 = new JButton("6");
        b15.setBackground(Color.lightGray);
        b15.setForeground(Color.BLUE);
        JButton b16 = new JButton("/");
        b16.setBackground(Color.lightGray);
        b16.setForeground(Color.RED);
        b16.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        JButton b17 = new JButton("7");
        b17.setBackground(Color.lightGray);
        b17.setForeground(Color.BLUE);
        JButton b18 = new JButton("8");
        b18.setBackground(Color.lightGray);
        b18.setForeground(Color.BLUE);
        JButton b19 = new JButton("9");
        b19.setBackground(Color.lightGray);
        b19.setForeground(Color.BLUE);
        JButton b20 = new JButton("-");
        b20.setBackground(Color.lightGray);
        b20.setForeground(Color.RED);
        b20.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        JButton b21 = new JButton("0");
        b21.setBackground(Color.lightGray);
        b21.setForeground(Color.BLUE);
        JButton b22 = new JButton(".");
        b22.setBackground(Color.lightGray);
        b22.setForeground(Color.RED);
        b22.setFont(new Font("Sans Serif", Font.PLAIN, 30));
        JButton b23 = new JButton("+/-");
        b23.setBackground(Color.lightGray);
        b23.setForeground(Color.RED);
        b23.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        JButton b24 = new JButton("+");
        b24.setBackground(Color.lightGray);
        b24.setForeground(Color.RED);
        b24.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        JButton b25 = new JButton("=");
        b25.setBackground(Color.lightGray);
        b25.setForeground(Color.RED);
        b25.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        JButton b26_ = new JButton("Del");
        b26_.setBackground(Color.lightGray);
        b26_.setForeground(Color.RED);
        JButton b26 = new JButton("CL");
        b26.setBackground(Color.lightGray);
        b26.setForeground(Color.RED);
        JButton b27 = new JButton("off");
        b27.setBackground(Color.lightGray);
        b27.setForeground(Color.RED);
        JButton blog = new JButton("log");
        blog.setBackground(Color.lightGray);
        blog.setForeground(Color.RED);
        JButton b10p = new JButton("10^x");
        b10p.setBackground(Color.lightGray);
        b10p.setForeground(Color.RED);
        JButton bay = new JButton("π");
        bay.setBackground(Color.lightGray);
        bay.setForeground(Color.RED);
        JButton bfact = new JButton("n!");
        bfact.setBackground(Color.lightGray);
        bfact.setForeground(Color.RED);    
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(blog);
        p1.add(b4);
        p1.add(b7);
        p1.add(b5);
        p1.add(b6);
        p1.add(b10p);
         p1.add(bay);
          p1.add(bfact);
        p1.add(b8);
        p1.add(b9);
        p1.add(b10);
        p1.add(b11);
        p1.add(b12);
        p1.add(b13);
        p1.add(b14);
        p1.add(b15);
        p1.add(b16);
        p1.add(b17);
        p1.add(b18);
        p1.add(b19);
        p1.add(b20);
        p1.add(b22);
        p1.add(b21);
        p1.add(b23);
        p1.add(b24);
        p1.add(b25);
        p1.add(b26_);
        p1.add(b26);
        p1.add(b27);
        JTextField t = new JTextField();
//*************************************

        b9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText() + "1";
                t.setText(ss);
            }
        });
        b10.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText() + "2";
                t.setText(ss);
            }
        });
        b11.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText() + "3";
                t.setText(ss);
            }
        });
        b13.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText() + "4";
                t.setText(ss);
            }
        });
        b14.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText() + "5";
                t.setText(ss);
            }
        });
        b15.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText() + "6";
                t.setText(ss);
            }
        });
        b17.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText() + "7";
                t.setText(ss);
            }
        });
        b18.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText() + "8";
                t.setText(ss);
            }
        });
        b19.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText() + "9";
                t.setText(ss);
            }
        });
        b21.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText() + "0";
                t.setText(ss);
            }
        });
        b26_.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText();
                t.setText(ss.substring(0,ss.length()-1));
            }
        });
        b22.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                 String s1 = t.getText();
                  String ss="";           
                 if(s1.indexOf(".")>=0)
                 {
                 ss = t.getText();
                 t.setText(ss);
                 }
                 else {
                    ss = t.getText() + ".";
                t.setText(ss);}
          
            }
        });
        
        bay.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ss = t.getText() + "3.14";
                t.setText(ss);
            }
        });
        b12.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                t.setText("");
                ope = '*';
               
            }
        });
        b16.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                t.setText("");
                ope = '/';
            }
        });
        b20.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                t.setText("");
                ope = '-';
  
            }
        });
        b24.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                t.setText("");
                ope = '+';
                
            }
        });
        b4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                t.setText("");
                ope = '%';
                
            }
        });
        b6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                t.setText("");
                ope = 'P';
                
            }
        });
        b8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                num1 = 1 / num1;
                t.setText(String.valueOf(num1));
                
            }
        });
        b23.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                num1 *= -1;
                t.setText(String.valueOf(num1));
                
                
            }
        });
        b5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                num1 = Math.pow(num1, 2);
                t.setText(String.valueOf(num1));
            
            }
        });
        b7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                num1 = Math.sqrt(num1);
                t.setText(String.valueOf(num1));
             
            }
        });
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                num1 = Math.sin(Math.toRadians(num1));
                t.setText(String.valueOf(num1));
               
            }
        });
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                num1 = Math.cos(Math.toRadians(num1));
                t.setText(String.valueOf(num1));
             
            }
        });
        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                num1 = Math.tan(Math.toRadians(num1));
                t.setText(String.valueOf(num1));
                
            }
        });
        bfact.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                num1 = fact(num1);
                t.setText(String.valueOf(num1));
                           }
        });
        b10p.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                num1 = Math.pow(10,num1);
                t.setText(String.valueOf(num1));
               
            }
        });
        blog.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(t.getText());
                num1 = Math.log10(num1);
                t.setText(String.valueOf(num1));
                
            }
        });
//******************************
        b25.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(t.getText());
                switch (ope) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    case '%':
                        result = num1 % num2;
                        break;
                    case 'P':
                        result = Math.pow(num1, num2);
                        break;
                }
                t.setText(String.valueOf(result));
            }
        });
        b27.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
        b26.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                t.setText("");
               
            }
        });

        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.WHITE, 7);
        javax.swing.border.Border border2 = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 7);
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        t.setBorder(border2);
        t.setSize(50, 10);
        t.setFont(font1);
        JPanel p2 = new JPanel(new BorderLayout());
        p1.setBorder(border);
        p2.add(t, BorderLayout.NORTH);

        f.add(p1, BorderLayout.CENTER);
        f.add(t, BorderLayout.NORTH);
        f.setResizable(false);
        f.setSize(300, 400);
        frame(f);
    }
}