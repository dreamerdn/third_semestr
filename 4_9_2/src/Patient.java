import javax.swing.*;
import java.io.*;
import java.util.Scanner;
public class Patient {
    String surname;
    String gender;
    int age;
    Patient () throws IOException{
        //открываем символьный поток ввода
        BufferedReader input=new BufferedReader (new InputStreamReader(System.in,"Cp1251"));
        System.out.print("Enter your name: ");
        this.surname=input.readLine();
        System.out.print("Enter your sex: ");
        this.gender=input.readLine();
        System.out.print("Enter your age:");
        this.age=Integer.parseInt(input.readLine());
    }
    //записываем информацию в файл document.doc
    public void InputInFile()throws IOException{
        File file = new File("file1");
        file.deleteOnExit(); //файл удалится после завершения работы виртуальной машины Java
        //поток для записи в файл
        FileWriter writer = new FileWriter(file,true);
        writer.append("\nSurname: "+this.surname+"; gender: "+this.gender+"; age: "+this.age+"; ");

        writer.flush();// Очистка потока.
        writer.close(); // Закрытие потока.
    }
    //статический метод вывода информации из файла
    public static void OutputOfFile()throws IOException{
        File file = new File("file1");
        //поток для вывода информации
        FileReader reader;
        char[] buffer;
        int numb;
        buffer=new char[1];
        reader = new FileReader(file);
        do{
            numb=reader.read(buffer);
            System.out.print(buffer[0]);
        }while(numb==1);

        reader.close();
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of patients: ");
        int n = scanner.nextInt();
        if (n != 0) {
            Patient[] patients = new Patient[n];
            for (int i = 0; i < n; i++) {
                patients[i] = new Patient();
            }
            for (int i = 0; i < n; i++) {
                patients[i].InputInFile();
            }
            OutputOfFile();

            int total = 0;
            for (int i = 0; i < n; i++)
            {
                total+= patients[i].age;
            }
            int cntage = total / n;
            System.out.println("\nAverage age of patient: " + cntage);


            int cnt=0;
            for (int i=0;i<n;i++){
                if(patients[i].gender=="f"){
                    cnt++;
                    System.out.println("cnt " + cnt);
                }
            }
            System.out.println("Number of woman: " + cnt);
        } else
            System.out.println("Thanks for using!");

    }
}

