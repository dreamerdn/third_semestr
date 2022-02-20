package Reader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Reader extends JFrame {

    String text1;
    int k;
    Object boxA, boxB, boxC;
    String path = "/Users/dashan/Desktop/file1.txt";
    File file1 = new File(path);
    static JLabel l1, l2, l3, l4, l5, l6;
    JComboBox box_1, box_2, box_3;
    JRadioButton rb1, rb2;
    ButtonGroup bg;
    static JButton b, del;
    static JTextField text;
    static JTextArea area;
    protected String rbres = "";

    static String[] box1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    static String[] box2 = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
    static String[] box3 = {"1970-1975", "1975-1980", "1980-1985", "1985-1990", "1990-1995", "1995-2000", "2000-2005", "2005-2010", "2010-2015"};

    public Reader(String str) {
        super(str);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.pink);
        b = new JButton("Отправить опрос");
        del = new JButton("Очистить");
        text = new JTextField(9);
        area = new JTextArea(9, 9);
        l1 = new JLabel("ФИО");
        l4 = new JLabel("Банка или бутылка");
        l2 = new JLabel("У какого бренда лучшая упаковка?");
        l3 = new JLabel("Ваш возраст");
        l5 = new JLabel("банка");
        l6 = new JLabel("бутылка");

        box_1 = new JComboBox(box1);
        box_2 = new JComboBox(box2);
        box_3 = new JComboBox<Object>(box3);
        rb1 = new JRadioButton("банка лучше");
        rb2 = new JRadioButton("бутылка лучше");
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        setLayout(null);
        b.setSize(200, 30);
        b.setLocation(150, 400);
        b.setForeground(Color.blue);
        del.setSize(100, 30);
        del.setLocation(30, 400);
        del.setForeground(Color.red);
        //ФИО
        text.setSize(220, 25);
        text.setLocation(210, 20);
        //у какого бренда лучше упаковка?
        area.setSize(300, 70);
        area.setLocation(150, 150);

        l1.setSize(200, 25);
        l1.setLocation(30, 20);

        l2.setSize(400, 25);
        l2.setLocation(160, 120);

        l3.setSize(200, 25);
        l3.setLocation(30, 300);

        l4.setSize(200, 25);
        l4.setLocation(30, 60);

        box_1.setSize(70, 25);
        box_1.setLocation(240, 300);

        box_2.setSize(100, 25);
        box_2.setLocation(300, 300);

        box_3.setSize(90, 25);
        box_3.setLocation(392, 300);


        rb1.setSize(40, 25);
        rb1.setLocation(200, 60);
        l5.setSize(40, 25);
        l5.setLocation(225, 60);


        rb2.setSize(40, 25);
        rb2.setLocation(300, 60);
        l6.setSize(60, 25);
        l6.setLocation(325, 60);


        add(b);
        add(del);
        add(text);
        add(area);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(box_1);
        add(box_2);
        add(box_3);
        add(rb1);
        add(rb2);

        b.addActionListener(new ButtonActionListener());
        rb1.addActionListener(new FlagActionListener());
        rb2.addActionListener(new FlagActionListener());
        del.addActionListener(new DelActionListener());
        box_1.addActionListener(new BoxActionListener());
        box_2.addActionListener(new BoxActionListener());
        box_3.addActionListener(new BoxActionListener());
    }

    public class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (!file1.exists()) {
                    file1.createNewFile();
                }

                FileWriter out = new FileWriter(file1, true);
                try {
                    String text1 = text.getText();
                    String area2 = area.getText();
                    if (text.getText().equals("")) {
                        out.write("Не введено; ");
                    } else
                        out.write(text1 + " ; ");
                    if (area.getText().equals("")) {
                        out.write("Не введено; ");
                    } else
                        out.write(area2 + " ; ");
                    if (k != 1 || k != -1) {
                        out.write(" ");
                    }


                    out.write(rbres + " ; ");
                    if (boxA == null) {
                        out.write("Возраст не введен  ||||| ");
                    } else out.write("Возраст:" + boxA + " " + boxB + " " + boxC + "|||||");

                } finally {
                    out.close();
                }
            } catch (IOException e1) {
                throw new RuntimeException(e1);
            }
        }
    }


    public class FlagActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == rb1) {
                rbres = rb1.getText();
            } else if (e.getSource() == rb2) {
                rbres = rb2.getText();
            } else {
                rbres = "Не введено";
            }
        }
    }

    public class DelActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == del) {
                text.setText(null);
                area.setText(null);
                box_1.setSelectedItem(null);
                box_2.setSelectedItem(null);
                box_3.setSelectedItem(null);
                rb1.setText(null);
                rb2.setText(null);
            }
        }
    }

    public class BoxActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == box_1) {
                boxA = box_1.getSelectedItem();
            }
            if (e.getSource() == box_2) {
                boxB = box_2.getSelectedItem();
            }
            if (e.getSource() == box_3) {
                boxC = box_3.getSelectedItem();

            }
        }
    }
}
