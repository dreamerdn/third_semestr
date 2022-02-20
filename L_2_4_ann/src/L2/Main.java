package L2;

import java.io.IOException;

public class Main {

        public static void main(String[] args) throws IOException {
            //создание массива
            Product[] arr = new Product[3];
            arr[0]=new Product ("Book",30,true);
            arr[1]=new Product ("Notebook",20,false);
            arr[2]=new Product("Pens",40);
            Product.show(arr);//вызов функции, которая отображает информацию введенную в массив
            System.out.println("\nProducts in stock: "+Product.Avl(arr));//вызов функции подсчитывающей продукты в наличии
            System.out.println("Prise: "+Product.Count(arr));//вызов функции подсчитывающей общую стоимость продуктов
        }
    }

