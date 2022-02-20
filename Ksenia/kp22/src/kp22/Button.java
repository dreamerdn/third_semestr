package kp22;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

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
        btn.addActionListener(new MyHandler());
        add(btn);

        //создание объекта кнопки
        JButton btn1=new JButton("No");
        //положение и размеры кнопки
        btn1.setBounds(50,90,100,10);
        btn1.addActionListener(new MyHandler1());
        add(btn1);

        setVisible(true);
    }


}

class MyHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("Yes");
    }
}

/*class MyHandler1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("No");
    }
}
*/

class MyHandler1 implements ActionListener{
    public void actionPerformed(ActionEvent list1) {
        System.out.println("No");
    }
}


