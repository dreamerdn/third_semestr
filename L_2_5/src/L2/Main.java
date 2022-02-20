package L2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
            //создание массива
            Book[] arr = new Book[3];
            arr[0]=new Book ("Cinderella",30,true,40);
            arr[1]=new Book ("Faust",20,false,350);
            arr[2]=new Book("Romeo and Juliet",40,130);
            Book.show(arr);//вызов функции, которая отображает информацию введенную в массив
            System.out.println("\nBooks with pictures: "+Book.Pctrs(arr));//вызов функции подсчитывающей книги с картинками
            System.out.println("Prise: "+Book.Count(arr));//вызов функции подсчитывающей общую стоимость книг
            System.out.println("Average number of page: "+Book.CountStr(arr));
    }
}
