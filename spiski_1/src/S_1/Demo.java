package S_1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args){
        List list= new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List list2= new ArrayList();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        for (int i=0;i<4;i++){
            System.out.println("list: "+list.get(i));
            System.out.println("list2: "+list2.get(i));
        }

        //List list3= new ArrayList();

        for (int i=0;i<4;i++){
            list.set(i,list2.get(i));
            //System.out.println("list1.2: "+list.set(i,list2.get(i)));
            System.out.println("list1.2: "+list.get(i));
        }

        for (int i=0;i<4;i++){
            System.out.println("list: "+list.get(i));
            System.out.println("list2: "+list2.get(i));
        }


    }
}
