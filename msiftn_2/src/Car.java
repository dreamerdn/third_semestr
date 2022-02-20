import java.io.IOException;
import java.io.*;
class Car{
    String name; // Название машины.
    int price; // Цена машины.
    boolean availability; // Наличие машины в салоне.

    Car () throws IOException
    {
        String bolv; // Открываем символьный поток ввода.

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in,"Cp1251"));
    //    InputStreamReader isr=new InputStreamReader(System.in, "windows-1251");
        /* Ввод данных о машине. */
        System.out.print("\nВведите название машины: ");
        this.name = input.readLine();
        System.out.print("\nВведите цену машины: ");
        this.price = Integer.parseInt(input.readLine());

        /* Ввод информации о наличии машины в салоне. */
        while (true)
        {
            System.out.print("\nИмеется ли в наличии yes/no ");
            bolv = input.readLine();
            if ("+".equals(bolv))
            {
                this.availability = true;
                break;
            }
            if ("-".equals(bolv))
            {
                this.availability = false;
                break;
            }
            System.out.print("\nОшибка!");
        }
    }
    /* Запись данных в файл. */
    public void InputInFile() throws IOException
    {
        File file = new File("document.doc"); // Создание файла для записи информации.
        file.deleteOnExit(); // Файл удалится после завершения работы.
        FileWriter writer; // Поток для записи в файл.
        writer = new FileWriter(file, true);
        writer.append("\nМашина ").append(this.name).append(" .Наличие: "); //Вывод информации на экран.
        if (this.availability)
            writer.append("Есть.\n");
        else writer.append("Нет.\n");
        writer.flush(); // Очистка потока.
        writer.close(); // Закрытие потока.
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
    public static int availability (Car[] cars)
    {
        int lic = 0;
        for(int i = 0;i < 4;i++)
            if(cars[i].availability)
                lic++;
        return lic;
    }
    public static void main(String[] args) throws IOException
    {
        Car [] cars;
        cars = new Car[4];
        for (int i = 0; i < 4; i++)
            cars[i] = new Car();
        for (int i = 0; i < 4; i++)
            cars[i].InputInFile();
        /* Вычисление стоимости продуктов в наличии. */
        double total = 0;
        for (int i = 0; i < 4; i++)
        {
            if (cars[i].availability)
            {
                total+= cars[i].gettotalprice();
            }
        }
        System.out.println("Общая стоимость автомобилей: " + String.format("%.1f", total));
        OutputOfFile();
    }
}
