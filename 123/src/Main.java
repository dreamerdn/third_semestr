public class Main {
    public static void main(String[] args) {

        Drugstore []d1 = new Drugstore[4]; //создаём массив из 10 объектов класса Drugstore
        d1[0] = new Drugstore("Kolenko", true, 100);  //создаём первый объект массива с помощью конструктора с полным набором параметров
        d1[1]=new Drugstore("Petrov",false); // аналогично заполняем другой, но теперь пользуемся конструктором без одного параметра
        d1[2]=new Drugstore();  // заполняем третий с помощью конструктора по умолчанию, все поля будут проинициализированы нулями
        d1[3]=new Drugstore(d1[0]); // вызов конструктора копий, здесь мы копируем информацию, из первого объекта
        for(int i=0;i<4;i++){
            d1[i].print();        }// выводим полученную информацию.
        System.out.println("sum of profits "+ Drugstore.Profit(d1));  //выводим суммы зарплаты через вызов статистического метода

        System.out.println("owners with license "+ Drugstore.hasLicense(d1));
//выводим количество владельцев с лицензиями через вызов статистического метода
    } }

public class Drugstore {
    private String name;  //фамилия
    private boolean license;   //лицензия. переменная типа булиан для того, что Вам нужно лишь знать: есть она или нет. То есть true или false. Булиан принимает только эти два значения тру или фолс.
    private int profit; //обычное число: доход
    public Drugstore() {    //конструктор без параметров(по умолчанию). вызовется если будет создан объект таким образом :
    }                       //Drugstore d = new Drugstore(); то есть не будут переданы параметры.
    //если Вы для такого объекта попробуете распечатать информацию о нём - Вам выдаст значения по умолчанию, т.е все поля проинициализирует нулями, либо неизменяемыми значениями
    //которые вы инициализировали в начале
    public Drugstore(String name, boolean license, int profit) { //конструктор с полным набором параметров. То есть переданными значениями будет инициализирован объект
        this.name = name;
        this.license = license;
        this.profit = profit;
    }
    public Drugstore( Drugstore o){ // создаине конструктора копирования
        this.name=o.name;
        this.license=o.license;
        this.profit=o.profit;
    }
    public Drugstore(String Name, boolean License ){ // конструктор с неполным набором параметров, здесь инициализируется только имя и наличие лицензии
        this.name=Name;
        this.license=License;
    }
    public String getName() { //методы получения полей объекта.
        return name;
    }
    public boolean isLicense() {
        return license;
    }
    public int getProfit() {
        return profit;
    }


    public static int Profit(Drugstore []drugstore){ //статический метод подсчёта прибыли, передаём массив Drugstore для подсчёта 4-х объектов

        int p=0;
        for(int i=0;i<4;i++){
            p+=drugstore[i].profit; //складываем все зарплаты
            return p;
        }


        public static int hasLicense(Drugstore []drugstore){
            int lic=0;
            for(int i=0;i<4;i++)
                if(drugstore[i].license==true) //если владелец имеет лицензию, то увеличиваем счётчик
                    lic++;
            return lic;
        }



        public void print() { //метод для вывода введенной информации

            System.out.println(this.getName()+"\n"+
                    this.getProfit());

            if(this.isLicense()){
                System.out.println("Have license.");
            }
            if(!this.isLicense()){
                System.out.println("Have not license.");
            }

        }


    }
