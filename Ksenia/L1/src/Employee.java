public class Employee {
    //поля класса
    String surname;
    int salary;
    String children;

    //конструктор
    Employee(String sur, int pay, String kids){
        surname=sur;
        salary=pay;
        children=kids;
    }

    void show1(){
        System.out.println("Surname of Employee:"+surname);
    }
    void show2(){
        System.out.println("Salary of Employee:"+salary);
    }
    void show3(){
        System.out.println("Surname of Employee: "+surname+"\nSalary of Employee: "+salary+"\nDoes he have children? - "+children);
    }


    public static void main(String[] args) {
        Employee e1 = new Employee("Ivanov", 12000, "no");
        e1.show1();
        e1.show2();
        e1.show3();
    }
}

