package Test1;

import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "/Users/dashan/Desktop/file1.txt";
        File file1 = new File(path);
        Scanner scanner = new Scanner(file1);
        String line = scanner.nextLine();

        File file = new File("file2");
        PrintWriter pw = new PrintWriter(file);
        Random rand = new Random();

        Months[] arr = new Months[12];
        String[] words = line.split(" ");

        for (Months arr : words){

        }

        int [] arr2=new int[12];

        for (int i=0;i<12;i++){
          arr2[i]=rand.nextInt(100);
        }

        for (int i=0;i<12;i++) {
            //вывод в консоль
            arr[i].show(arr,arr2,i);
            //запись в файл №2
            pw.println(arr[i].name);
        }

        //вывод в консоль среднего арифметического значения
        System.out.println("Average = "+Months.Count(arr2));
        //запись в файл №2 среднего арифметического значения
        pw.println(Months.Count(arr2));

        scanner.close();
        pw.close();
    }
}
