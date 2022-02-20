package newpackage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        System.out.println("3.Read text from a file and perform actions on it");
        System.out.println("4.Delete the file");
        System.out.println("5.Exit");
    }

    public void textIntoFile() throws IOException {//метод ввода текста и записи его в файл
        System.out.println("Enter text:");
        data = in.readLine();//ввод текста
        System.out.println("Enter the file name:");
        filename = in.readLine();//ввод имя файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "rw");//создание файла с заданным именем
        fio.writeBytes(data);//запись текста в заданный файл
        fio.close();
        System.out.println("Your text has been saved.");
    }

    public void printRedactMenu() {//метод вывода возможных действий редактирования текста на экран
        System.out.println("Choose an action:");
        System.out.println("1 - add text to the beginning of the file");
        System.out.println("2 - adding text to the end of the file");
        System.out.println("3 - adding text to an arbitrary position in the file");
    }

    public void addStart() throws IOException {//метод добавления текста в начало файла
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

    public void addEnd() throws IOException {//метод добавления текста в конец файла
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

    public void addRandom() throws IOException {//метод добавления текста в указаную позицию в файле
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


        public static void main(String[] args) throws IOException {
            String analizingStr = "word1";
            System.out.println("Вывод строки:");
            System.out.println(analizingStr);// выведет word1 word2 word3
            StringTokenizer tokenizer = new StringTokenizer(analizingStr);
            int n = tokenizer.countTokens();//подсчет количества слов
            String[] tokens = new String[n];//создание массива для записи отдельных слов
            for (int i = 0; i < n; i++) {
                tokens[i] = tokenizer.nextToken();//запись слов в массив
            }
            System.out.println("Вывод второго слова из строки:");
            System.out.println(tokens[1]);//выведет word2
        }



    public void textFromfile() throws IOException {
        System.out.println("Enter the file name:");
        filename = in.readLine();//ввод имени файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "rw");
        data = fio.readLine();//чтение информации из заданного файла
        System.out.println("Information from the file: " + data);//вывод информации из файла

        StringTokenizer tokenizer = new StringTokenizer(data);
        int n = tokenizer.countTokens();//подсчет количества слов
        String[] tokens = new String[n];//создание массива для записи отдельных слов
        String[] tokens2 = new String[n];//создание массива для записи отдельных слов

        int cnt2=0;
        for (int i = 0; i < n; i++) {
            tokens[i] = tokenizer.nextToken();//запись слов в массив
        }

        for (int i = 0; i < n; i++) {
            tokens2[0]=tokens[0];
            int cnt=0;
            for (int j = 0; j < n; j++) {
                if(i!=j) {
                    if (tokens[i].equals(tokens[j])) {
                        cnt++;
                    }
                }
            }
            if(cnt==0){
                cnt2++;
                tokens2[cnt2]=tokens[i];
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (tokens2[i]==null)
                continue;
            System.out.println(tokens2[i]);
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
