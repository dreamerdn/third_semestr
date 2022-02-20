package Patient;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        //подключение ввода с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int numb = in.nextInt();
        int n=numb*3;
        Demo[] arr = new Demo[n]; //создание массива
        int cntM=0;
        for (int i = 0; i < n; i+=3) {
            String str;//переменные, для передачи в конструктор данных
            char letter;
            int v;
            System.out.print("Input a surname: ");
            str = in.next();
            System.out.print("Input a sex: ");
            letter = in.next().charAt(0);
            System.out.print("Input a age: ");
            v = in.nextInt();
            arr[i] = new Demo(str);
            arr[i+1] = new Demo(letter);
            arr[i+2] = new Demo(v);
            cntM+=3;//счетчик для метода Count(прибавляем три по тем же причинам, что и умножаем на три n)
            arr[i].Count(numb,cntM,n,arr);//вызов метода подсчета среднего возраста
            arr[i].Female(n,arr,cntM);//вызов метода подсчета количества женщин
        }
        //отображение всех объектов
        for (int i=0;i<n;i+=3){
            arr[i].show1(cntM, n, i, arr);
            arr[i+1].show2(cntM, n, i, arr);
            arr[i+2].show3(cntM, n, i, arr);
        }
        //закрытие потока ввода
        in.close();}}

