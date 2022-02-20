import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Scanner;


public class Button extends JFrame {
    private JButton b1= new JButton("b1");
    public Button(){
        super("Window");
        //положение и размеры окна
        setBounds(250,250,300,200);
        //окно постоянных размеров
        setResizable(false);
        //реакция на щелчек системной пиктограммы
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //отключение менеджера компоновки
        setLayout(null);
        b1.setBounds(50,90,100,10);
        b1.addActionListener(new ButtonEvent());
        add(b1);

        setVisible(true);
    }

    public static void main(String[] args)  {
        new Button();
    }
}


class ButtonEvent implements ActionListener {
    public void actionPerformed(ActionEvent e){
        String path = "/Users/dashan/Desktop/fileb1.txt";
        File file1 = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file1);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        String line = scanner.nextLine();
        String[] words = line.split(" ");

        File file = new File("file2");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        for (int i=0;i<words.length;i++){
            pw.print(words[i]);
        }
    }
}