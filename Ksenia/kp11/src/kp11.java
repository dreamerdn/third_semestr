import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class kp11 {

    public static void main(String[] args) throws FileNotFoundException {

        //считывание месяцов из первого файла
        //НЕ ЗАБУДЬ ИЗМЕНИТЬ ПУТЬ!!!!!
        String path = "/Users/dashan/Desktop/file1.txt";
        File file1 = new File(path);
        Scanner scanner = new Scanner(file1);
        String line = scanner.nextLine();
        String[] words = line.split(" ");


        //рандомных чисел
        File file = new File("file2");
        PrintWriter pw = new PrintWriter(file);

        //запись значений из первого файла и рандомных чисел
        File file3 = new File("file3");
        PrintWriter pw3 = new PrintWriter(file3);
        Random rand = new Random();
        float min = 0.0f;
        float max = 100.0f;
        Float [] arr2=new Float[12];


        System.out.println(Arrays.toString(words));

        for (int i=0;i<words.length;i++){
            float random = (float)Math.floor(Math.random()*(max-min+1)+min);
            arr2[i]= random;
            pw.print(arr2[i]+" ");
            pw3.print(words[i]+" ");
            pw3.println(arr2[i]);
        }

        float sum=0;
        for(int i=0;i<12;i++){
            sum+=arr2[i];
        }
        float cnt=sum/12;
        pw.println("\nAverage: "+cnt);



        scanner.close();
        pw.close();
        pw3.close();
    }
}
