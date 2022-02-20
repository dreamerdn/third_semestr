import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Scanner;

public class Button extends JFrame {
     JButton b1= new JButton("b1");
     JButton b2= new JButton("b2");
     JButton b3= new JButton("b3");
     JButton b4= new JButton("b4");
     JTextField text1 = new JTextField("text1");

    public Button(){
        super("Window");
        //положение и размеры окна
        setBounds(500,500,500,300);
        //окно постоянных размеров
        setResizable(false);
        //реакция на щелчек системной пиктограммы
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //отключение менеджера компоновки
        setLayout(null);

        b1.setBounds(150,100,100,10);
        b1.addActionListener(new ButtonEvent());
        add(b1);
        b2.setBounds(150,150,100,10);
        b2.addActionListener(new ButtonEvent2());
        add(b2);
        b3.setBounds(170,200,70,10);
        b3.addActionListener(new ButtonEvent3());
        add(b3);
        b4.setBounds(80,200,80,10);
        b4.addActionListener(new ButtonEvent4());
        add(b4);

        text1.setBounds(20,40,50,50);
        add(text1);

        setVisible(true);
    }


    public static void main(String[] args)  {

        JOptionPane.showMessageDialog(null,"Чтобы работать с списками следуй следующим инструкциям!");
        new Button();


       /* EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Button frame = new Button();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });*/
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
        List list= new ArrayList();

        for (int i=0;i<words.length;i++){
            System.out.println(words[i]);
            list.add(words[i]);
        }
        for (int i=0;i<words.length;i++) {
            System.out.println("from list: "+list.get(i));
        }
    }
}

class ButtonEvent2 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        File file2 = new File("file2");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file2);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

       Random rand = new Random();
        int [] arr2=new int[3];
        for (int i=0;i<3;i++) {
            arr2[i]= rand.nextInt();
            System.out.println(arr2[i]);
            pw.print(arr2[i]+" ");
        }

        pw.close();
    }
}

class ButtonEvent3 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        //раьбота с файлом №1
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
        List list= new ArrayList();

        for (int i=0;i<3;i++){
            System.out.println("добавляем слова из файла 1");
            list.add(words[i]);
        }

        //раьбота с файлом №2
        Scanner scanner2 = null;
        File file2 = new File("file2");
        try {
            scanner2 = new Scanner(file2);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        String line2 = scanner2.nextLine();
        String[] words2 = line2.split(" ");
        List list2= new ArrayList();

        for (int i=0;i<3;i++){
            System.out.println("добавляем слова из файла 2");
            list2.add(words2[i]);
            System.out.println("-"+list2.get(i));
        }

        JOptionPane.showMessageDialog(null,"1 list: "+list.get(0)+"; "+list.get(1)+"; "+list.get(2)+"\n2 list: "+list2.get(0)+"; "+list2.get(1)+"; "+list2.get(2));

        for (int i=0;i<3;i++){
            list.set(i,list2.get(i));
            //System.out.println("list1.2: "+list.set(i,list2.get(i)));
          // JOptionPane.showMessageDialog(null,"list1.2: "+list.get(i));
        }

        JOptionPane.showMessageDialog(null,"1 list: "+list.get(0)+"; "+list.get(1)+"; "+list.get(2)+"\n2 list: "+list2.get(0)+"; "+list2.get(1)+"; "+list2.get(2));

        String q;

        q=JOptionPane.showInputDialog("number: ");
        int q1 = Integer.parseInt(q.trim());
        if(q1==99){
            return;
        }
        else
        list.set(q1,list2.get(q1));
        JOptionPane.showMessageDialog(null,"list1.3: "+list.get(q1));

        scanner.close();
        scanner2.close();
    }
}

class ButtonEvent4 implements ActionListener {
    public void actionPerformed(ActionEvent e){

        Random rand = new Random();
        List list= new ArrayList();
        for (int i=0;i<3;i++) {
            list.add(rand.nextInt(100));
            JOptionPane.showMessageDialog(null,list.get(i));
            System.out.println("list1: "+list.get(i));
        }

        Random rand2 = new Random();
        List list2= new ArrayList();
        for (int i=0;i<3;i++) {
            list2.add(rand2.nextInt(10));
            JOptionPane.showMessageDialog(null,list2.get(i));
            System.out.println("list2: "+list2.get(i));
        }

        String q;
        int qw;

        q=JOptionPane.showInputDialog("number: ");
        int q1 = Integer.parseInt(q.trim());
        if(q1==99){
            return;
        }
        else
            qw= (int) list.get(q1);
            list.set(q1,list2.get(q1));
            list2.set(q1,qw);
            
        JOptionPane.showMessageDialog(null,"list1.3: "+list.get(q1));
        System.out.println("list: "+list.get(q1));
        System.out.println("list2: "+list2.get(q1));
    }
}