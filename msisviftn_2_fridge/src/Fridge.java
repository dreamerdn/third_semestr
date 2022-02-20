import java.io.IOException;
import java.io.*;
class Fridge{
    String brand;
    int price;
    boolean existence;

    Fridge () throws IOException
    {
        String n; // Открываем символьный поток ввода.

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in,"Cp1251"));
        System.out.print("\nEnter the brand of the Fridge: ");
        this.brand = input.readLine();
        System.out.print("Enter the price of the Fridge: ");
        this.price = Integer.parseInt(input.readLine());

        while (true)
        {
            System.out.print("Is there in stock? (+ or -) ");
            n = input.readLine();
            if ("+".equals(n))
            {
                this.existence = true;
                break;
            }
            if ("-".equals(n))
            {
                this.existence = false;
                break;
            }
            System.out.print("\nError, try again:");
        }
    }
    /* Запись данных в файл. */
    public void InputInFile() throws IOException
    {
        File file = new File("document.doc"); // Создание файла для записи информации.
        file.deleteOnExit(); // Файл удалится после завершения работы.
        FileWriter w; // Поток для записи в файл.
        w = new FileWriter(file, true);
        w.append("\nFridge brand is: ").append(this.brand).append("\nExistence: "); //Вывод информации на экран.
        if (this.existence)
            w.append("in stock.\n");
        else w.append("out of stock.\n");
        w.flush(); // Очистка потока.
        w.close(); // Закрытие потока.
    }
    /* Чтение данных из файла. */
    public static void OutputOfFile()throws IOException
    {
        File file = new File("document.doc");
        FileReader reader; //Поток для вывода информации
        char[] buffer;
        int numb;
        buffer = new char[1];
        reader = new FileReader(file);
        do {
            numb = reader.read(buffer);
            System.out.print(buffer[0]);
        }
        while (numb == 1);
        reader.close();
    }
    /* Вычисление общей цены. */
    private double gettotalprice()
    {

        return price;
    }
    /* Определение продуктов в наличии */
    public static int availability (Fridge[] cars)
    {
        int lic = 0;
        for(int i = 0;i < 4;i++)
            if(cars[i].existence)
                lic++;
        return lic;
    }
    public static void main(String[] args) throws IOException
    {
        Fridge [] f;
        f = new Fridge[3];
        for (int i = 0; i < 3; i++)
            f[i] = new Fridge();
        for (int i = 0; i < 3; i++)
            f[i].InputInFile();

        double total = 0;
        for (int i = 0; i < 3; i++)
        {
            if (f[i].existence)
            {
                total+= f[i].gettotalprice();
            }
        }
        System.out.println("\nTotal cost of Fridge: " + String.format("%.1f", total));
        OutputOfFile();
    }
}

