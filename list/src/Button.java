import kp2.list;

import javax.swing.*;
import java.awt.event.*;
public class Button extends JFrame{
    Button(){
        super("Window");
        //положение и размеры окна
        setBounds(250,250,300,200);
        //окно постоянных размеров
        setResizable(false);
        //реакция на щелчек системной пиктограммы
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //отключение менеджера компоновки
        setLayout(null);

        //создание объекта кнопки
        JButton btn=new JButton("Yes");
        //положение и размеры кнопки
        btn.setBounds(50,120,200,30);
        MyHandler hnd = new MyHandler();
        btn.addActionListener(hnd);
        add(btn);

        //создание объекта кнопки
        JButton btn1=new JButton("No");
        //положение и размеры кнопки
        btn1.setBounds(50,90,100,10);
        MyHandler1 hnd1 = new MyHandler1();
        btn1.addActionListener(hnd1);
        add(btn1);

        setVisible(true);
    }
}

class MyHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        list.addAll(list1);
        list1.clear();
        list1.addAll(list2);
        list2.clear();
        list2.addAll(list);
    }
}

class MyHandler1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("No");
    }
}


