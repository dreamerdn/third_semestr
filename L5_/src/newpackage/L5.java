package newpackage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

class Laba5 {
    public static void main(String args[]) throws IOException {
        WorkWithString n = new WorkWithString();//создание объекта класса WorkWithString
        n.runConsol();//вызов метода, выполняющего действия над файлом и строкой
    }
}

class WorkWithString {
    String data;
    String filename;
    String choice;
    String choice2;
    RandomAccessFile fio;
    BufferedReader in;
    int n;

    public WorkWithString() throws UnsupportedEncodingException {
        this.in = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));//создание объекта класса BufferedReader с возможностью ввода данных на русском языке(кодировка "Cp1251")
    }

    public void runConsol() throws IOException {
        while (true) {
            printMenu();//вызов метода вывода меню на экран
            choice = in.readLine();//ввод выбранного пункта меню
            if (choice.compareTo("1") == 0) {//сравнение выбранного пользователем пункта меню
                textIntoFile();//вызов метода ввода текста и записи его в файл
            } else if (choice.compareTo("2") == 0) {
                printRedactMenu();//вызов метода вывода возможных действий редактирования текста на экран
                choice2 = in.readLine();//ввод выбранного пункта
                if (choice2.compareTo("1") == 0) {
                    addStart();//вызов метода добавления текста в начало файла
                } else if (choice2.compareTo("2") == 0) {
                    addEnd();//вызов метода добавления текста в конец файла
                } else if (choice2.compareTo("3") == 0) {
                    addRandom();//вызов метода добавления текста в указаную позицию в файле
                }
            } else if (choice.compareTo("3") == 0) {
                textFromfile();//вызов метода чтения текста из файла и определение количества гласных, пробелов и общего количества букв
            }
              else if (choice.compareTo("4") == 0) {
                    DelFile();
            } else if (choice.compareTo("5") == 0) {
                return;//выход из программы
            }
        }
    }

    public void printMenu() {//метод вывода меню на экран
        System.out.println("Your choice:");
        System.out.println("1.Enter text and write it to a file");
        System.out.println("2.Edit text in file");
        System.out.println("3. Read text from a file and perform actions on it");
        System.out.println("4. Delete the file");
        System.out.println("5.Exit");
    }

    //метод ввода текста и записи его в файл
    public void textIntoFile() throws IOException {
        System.out.println("Enter text:");
        data = in.readLine();//ввод текста
        System.out.println("Enter the file name:");
        filename = in.readLine();//ввод имя файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "rw");//создание файла с заданным именем
        fio.writeBytes(data);//запись текста в заданный файл
        fio.close();
        System.out.println("Your text has been saved.");
    }

    //метод вывода возможных действий редактирования текста на экран
    public void printRedactMenu() {
        System.out.println("Choose an action:");
        System.out.println("1 - add text to the beginning of the file");
        System.out.println("2 - adding text to the end of the file");
        System.out.println("3 - adding text to an arbitrary position in the file");
    }

    //метод добавления текста в начало файла
    public void addStart() throws IOException {
        System.out.println("Enter the file name:");
        filename = in.readLine();//ввод имени файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "rw");
        data = fio.readLine();//чтение информации из заданного файла
        System.out.println("Enter the line to add to the beginning:");
        String s;
        s = in.readLine();//ввод строки
        fio.seek(0);//переход в начало файла
        fio.writeBytes(s);//запись введенной строки
        fio.seek(s.length());//переход в конец записанной строки
        fio.writeBytes(data);//запись исходного текста после введенной строки
        fio.close();
        System.out.println("The line is written to the beginning of the file.");
    }

    //метод добавления текста в конец файла
    public void addEnd() throws IOException {
        System.out.println("Enter the file name:");
        filename = in.readLine();//ввод имени файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "rw");
        data = fio.readLine();//чтение информации из заданного файла
        System.out.println("Enter the line to add to the end:");
        String s;
        s = in.readLine();//ввод строки
        fio.seek(fio.length());//переход в конец файла
        fio.writeBytes(s);//запись введенной строки в конец файла
        fio.close();
        System.out.println("The line is written to the end of the file.");
    }

    //метод добавления текста в указаную позицию в файле
    public void addRandom() throws IOException {
        System.out.println("Enter the file name:");
        filename = in.readLine();//ввод имени файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "rw");
        System.out.println("Enter a line to add at the specified position in the file:");
        String s;
        s = in.readLine();//ввод строки
        System.out.println("Enter the required position in the file:");
        int n;
        n = Integer.parseInt(in.readLine());//ввод позиции
        fio.seek(n);//смещение на n позицию в файле
        data = fio.readLine();//чтение файла начиная с позиции n
        fio.seek(n);
        fio.writeBytes(s);//запись введенной строки с позиции n
        fio.writeBytes(data);//запись прочитанного с позиции n текста после введенной строки
        fio.close();
        System.out.println("The line was written to the file.");
    }

    public static String removeChar(String s, char c) {
        String r = "";
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) != c) r += s.charAt(i);
        }
        return r;
    }

    public void textFromfile() throws IOException {
        System.out.println("Enter the file name:");
        filename = in.readLine();//ввод имени файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "rw");
        data = fio.readLine();//чтение информации из заданного файла
        System.out.println("Information from the file: " + data);//вывод информации из файла
        data = data.replaceAll("\\d", "");
        System.out.println("What happened:" +data);//вывод информации из файла
        System.out.println("Want to clean save the result to a file? - (0)");
        n = Integer.parseInt(in.readLine());
        if(n==0) {
            fio.writeBytes(data);//запись текста в заданный файл
            fio.close();
            System.out.println("Your text has been saved.");
        }
        else{
            data = data.replaceAll("\\w", "");
        }

    }

    public void DelFile(){
        System.out.println("Enter the file name:");
        Scanner scan = new Scanner(System.in);
        String numb=scan.nextLine();
        File file = new File(numb);
        file.deleteOnExit();
    }

}
