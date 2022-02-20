package kp2;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.awt.event.*;


public class list {
    public static void main(String[] args)
    {
        List list1=new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List list2=new ArrayList();
        list2.add("Slizh");
        list2.add("Neyzhmak");
        list2.add("Sakhon");
        List list3=new ArrayList();
        list3.add('q');
        list3.add('w');
        list3.add('e');
        List list=new ArrayList();
        //запись в список №0 элементов списка №1

        list.addAll(list1);
        list1.clear();
        list1.addAll(list2);
        list2.clear();
        list2.addAll(list);





        int n=1;
        switch (n) {
            case 1:
            for (int i = 0; i < 3; i++) {
                System.out.print(list1.get(i) + " ");
                System.out.print(list2.get(i) + " ");
                System.out.print(list3.get(i) + "\n");
                System.out.print(list.get(i) + "\n");
            }
            break;
        }

        //new Button();
    }
}
