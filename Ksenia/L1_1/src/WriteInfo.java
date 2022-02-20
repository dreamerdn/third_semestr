class Employee {
    //поля класса
    String surname;
    int salary;
    boolean children;

    //конструктор
    Employee(String sur, int pay,boolean kids){
        surname=sur;
        salary=pay;
        children=kids;

    }
    //второй конструктор
    Employee(){
        surname="Ivanov2";
        salary=13000;
        children=true;
    }

    //методы вывода на экран
    void show1(){
        System.out.println("Surname of Employee:"+surname);
    }
    void show2(){
        System.out.println("Salary of Employee:"+salary+"\n");
    }
    void show3(){
        System.out.println("Surname of Employee: "+surname+"\nSalary of Employee: "+salary+"\nDoes he have children? - "+children+"\n");
    }
}

//главный класс
public class WriteInfo {
    public static void main(String[] args) {
//создание объектов
        Employee e1=new Employee("Ivanov",12000,false);
        Employee e2=new Employee();

        System.out.println("1.");
        e1.show1();
        e1.show2();
        e1.show3();
        System.out.println("2.");
        e2.show1();
        e2.show2();
        e2.show3();

    }
}
