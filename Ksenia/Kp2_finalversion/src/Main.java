import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Scanner;

 class Button extends JFrame {
    JButton b1= new JButton("swap items from list #1 and #2");
    JButton b2= new JButton("swap items from list #2 and #3");
    JButton b3= new JButton("swap items from list #3 and #1");
    JButton b4= new JButton("edit list #2");

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

        b1.setBounds(150,50,250,40);
        b1.addActionListener(new ButtonEvent1());
        add(b1);
        b2.setBounds(150,100,250,40);
        b2.addActionListener(new ButtonEvent2());
        add(b2);
        b3.setBounds(150,150,250,40);
        b3.addActionListener(new ButtonEvent3());
        add(b3);
        b4.setBounds(150,200,100,40);
        b4.addActionListener(new ButtonEvent4());
        add(b4);

        setVisible(true);
    }
}


public class Main {

    public static void main(String[] args)  {
        //заполнение файла №1
        File file1 = new File("file1");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file1);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        Random rand = new Random();
        int [] arr=new int[3];
        for (int i=0;i<3;i++) {
            arr[i]= rand.nextInt();
            System.out.println("L1: "+arr[i]);
            pw.print(arr[i]+" ");
        }
        pw.close();

        //заполнение файла №2
        File file2 = new File("file2");
        PrintWriter pw2 = null;
        try {
            pw2 = new PrintWriter(file2);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        Random rand2 = new Random();
        int [] arr2=new int[3];
        for (int i=0;i<3;i++) {
            arr2[i]= rand2.nextInt();
            System.out.println("L2: "+arr2[i]);
            pw2.print(arr2[i]+" ");
        }
        pw2.close();

        //заполнение файла №3
        File file3 = new File("file3");
        PrintWriter pw3 = null;
        try {
            pw3 = new PrintWriter(file3);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        Random rand3 = new Random();
        int [] arr3=new int[3];
        for (int i=0;i<3;i++) {
            arr3[i]= rand3.nextInt();
            System.out.println("L3: "+arr3[i]);
            pw3.print(arr3[i]+" ");
        }
        pw3.close();

        JOptionPane.showMessageDialog(null,"Follow the instructions below to work with lists!");
        new Button();
    }
}

class ButtonEvent1 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        //работа с файлом№1
        Scanner scanner = null;
        File file1 = new File("file1");
        try {
            scanner = new Scanner(file1);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        String line = scanner.nextLine();
        String[] words = line.split(" ");
        List list= new ArrayList();

        for (int i=0;i<words.length;i++){
            System.out.println("добавляем слова из файла 1");
            list.add(words[i]);
            System.out.println(" "+list.get(i));
        }

        scanner.close();

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

        for (int i=0;i<words2.length;i++){
            System.out.println("добавляем слова из файла 2");
            list2.add(words2[i]);
            System.out.println(" "+list2.get(i));
        }
        scanner2.close();

        String q,q_;
        String qw;
        q=JOptionPane.showInputDialog("Enter the number of the variable you want to replace from the list #1\nTHE VARIANTS FROM 0 TO "+(list.size()-1));
        int q1 = Integer.parseInt(q.trim());
        if(q1==99){
            return;
        }
        else
            q_=JOptionPane.showInputDialog("enter the number of the variable you want to replace from the list #2\nTHE VARIANTS FROM 0 TO "+(list2.size()-1));
            int q2 = Integer.parseInt(q_.trim());

            qw= (String) list.get(q1);
        list.set(q1,list2.get(q2));
        list2.set(q2,qw);


        PrintWriter pw1 = null;
        try {
            pw1 = new PrintWriter(file1);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        for (int i=0;i<list.size();i++) {
            pw1.print(list.get(i) + " ");
        }
        pw1.close();

        PrintWriter pw2 = null;
        try {
            pw2 = new PrintWriter(file2);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        for (int i=0;i<list2.size();i++) {
            pw2.print(list2.get(i) + " ");
        }
        pw2.close();
    }
}

class ButtonEvent2 implements ActionListener {
    public void actionPerformed(ActionEvent e){

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

        for (int i=0;i<words2.length;i++){
            System.out.println("добавляем слова из файла 2");
            list2.add(words2[i]);
            System.out.println(" "+list2.get(i));
        }
        scanner2.close();

        //работа с файлом №3
        Scanner scanner3 = null;
        File file3 = new File("file3");
        try {
            scanner3 = new Scanner(file3);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        String line3 = scanner3.nextLine();
        String[] words3 = line3.split(" ");
        List list3= new ArrayList();

        for (int i=0;i<words3.length;i++){
            System.out.println("добавляем слова из файла 1");
            list3.add(words3[i]);
            System.out.println(" "+list3.get(i));
        }

        scanner3.close();

        String q,q_;
        String qw;
        q=JOptionPane.showInputDialog("Enter the number of the variable you want to replace from the list #2\nTHE VARIANTS FROM 0 TO "+(list2.size()-1));
        int q1 = Integer.parseInt(q.trim());
        if(q1==99){
            return;
        }
        else
            q_=JOptionPane.showInputDialog("Enter the number of the variable you want to replace from the list #3\nTHE VARIANTS FROM 0 TO "+(list3.size()-1));
        int q2 = Integer.parseInt(q_.trim());

        qw= (String) list2.get(q1);
        list2.set(q1,list3.get(q2));
        list3.set(q2,qw);


        PrintWriter pw2 = null;
        try {
            pw2 = new PrintWriter(file2);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        for (int i=0;i<list2.size();i++) {
            pw2.print(list2.get(i) + " ");
        }
        pw2.close();

        PrintWriter pw3 = null;
        try {
            pw3 = new PrintWriter(file3);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        for (int i=0;i<list3.size();i++) {
            pw3.print(list3.get(i) + " ");
        }
        pw3.close();

    }
}

class ButtonEvent3 implements ActionListener {
    public void actionPerformed(ActionEvent e){

        //работа с файлом №3
        Scanner scanner3 = null;
        File file3 = new File("file3");
        try {
            scanner3 = new Scanner(file3);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        String line3 = scanner3.nextLine();
        String[] words3 = line3.split(" ");
        List list3= new ArrayList();

        for (int i=0;i<words3.length;i++){
            System.out.println("добавляем слова из файла 1");
            list3.add(words3[i]);
            System.out.println(" "+list3.get(i));
        }

        scanner3.close();

        //работа с файлом №1
        Scanner scanner = null;
        File file1 = new File("file1");
        try {
            scanner = new Scanner(file1);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        String line = scanner.nextLine();
        String[] words = line.split(" ");
        List list= new ArrayList();

        for (int i=0;i<words.length;i++){
            System.out.println("добавляем слова из файла 1");
            list.add(words[i]);
            System.out.println(" "+list.get(i));
        }
        scanner.close();

        String q,q_;
        String qw;
        q=JOptionPane.showInputDialog("Enter the number of the variable you want to replace from the list #3\nTHE VARIANTS FROM 0 TO "+(list3.size()-1));
        int q1 = Integer.parseInt(q.trim());
        if(q1==99){
            return;
        }
        else
            q_=JOptionPane.showInputDialog("Enter the number of the variable you want to replace from the list #1\nTHE VARIANTS FROM 0 TO "+(list.size()-1));
        int q2 = Integer.parseInt(q_.trim());

        qw= (String) list3.get(q1);
        list3.set(q1,list.get(q2));
        list.set(q2,qw);


        PrintWriter pw3 = null;
        try {
            pw3 = new PrintWriter(file3);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        for (int i=0;i<list3.size();i++) {
            pw3.print(list3.get(i) + " ");
        }
        pw3.close();

        PrintWriter pw1 = null;
        try {
            pw1 = new PrintWriter(file1);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        for (int i=0;i<list.size();i++) {
            pw1.print(list.get(i) + " ");
        }
        pw1.close();

    }
}

class ButtonEvent4 implements ActionListener {
    public void actionPerformed(ActionEvent e){

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

        for (int i=0;i<words2.length;i++){
            System.out.println("добавляем слова из файла 2");
            list2.add(words2[i]);
            System.out.println(" "+list2.get(i));
        }
        scanner2.close();

        int button_enter;
        button_enter = JOptionPane.showConfirmDialog(null, "Enter element to list #2?");
        if(button_enter==0) {
            //добавление элемента в список
            String enter_ = JOptionPane.showInputDialog("Enter number in list №2: ");
            int e_ = Integer.parseInt(enter_.trim());
            list2.add(words2.length, e_);
        }

        int button_edit;
        button_edit = JOptionPane.showConfirmDialog(null, "Edit element to list #2?");
        if(button_edit==0) {
            //!!!!!!!!!!!!!!!!!!!!!!!! ДОБАВИТЬ ПРОВЕРКИ НА ВВОД !!!!!!!!!!!!!!!!!!!!!!!!
            //редактирование элементов списка
            String edit_ = JOptionPane.showInputDialog("Edit element of list №2: ");
            int ed_ = Integer.parseInt(edit_.trim());
            String input_ = JOptionPane.showInputDialog("Where on the list would you like to place it?\nTHE VARIANTS FROM 0 TO "+(list2.size()-1));
            int in_ = Integer.parseInt(input_.trim());
            list2.remove(in_);
            list2.add(in_, ed_);
        }

        //удаление из второго файла
        int button_del2;
        button_del2 = JOptionPane.showConfirmDialog(null, "Remove from list #2?");
        if(button_del2==0){
            String del2=JOptionPane.showInputDialog("Enter the number of the element you want to delete\nTHE VARIANTS FROM 0 TO "+(list2.size()-1));
            int d2= Integer.parseInt(del2.trim());
            list2.remove(d2);
        }

            //запись в файл
            PrintWriter pw2 = null;
            try {
                pw2 = new PrintWriter(file2);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

            for (int i=0;i<list2.size();i++) {
                pw2.print(list2.get(i) + " ");
            }
            pw2.close();
        


    }
}