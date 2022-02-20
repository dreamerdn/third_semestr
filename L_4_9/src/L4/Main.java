package L4;

import javax.swing.*;


// интерфейс, содержащий один абстрактный метод
interface Object {
    void printInfo();
}
// интерфейс, содержащий один абстрактный метод
interface Task {
    public int Task ();
}

// класс, реализующий 2 интерфейса
class Student implements Object,Task {
    private String full_name;
    private String sex;
    private String age;
    private String age2;
    private int c;


    Student(String name,String pol, String years,String y){
        full_name=name;
        sex=pol;
        age=years;
        age2=y;

    }

    public String getFull_name(){ return full_name; }
    public String getSex(){ return sex; }
    public String getAge(){ return age; }

    public int Task() {
        int i = Integer.parseInt(age.trim());
        int i2=Integer.parseInt(age2.trim());
        c=i-i2;
        return c;
    }

    public void printInfo() {
        JOptionPane.showMessageDialog(null,"Name: "+getFull_name()+" sex: "+getSex()+" age: "+getAge()+" If you are still studying, then for so many years: "+Task());
    }// реализация абстрактного метода вывода информации об объекте класса для круга

}

// класс, реализующий 2 интерфейса
class Schoolboy implements Object, Task{
    private String class_number;
    private String age;
    private String age2;
    private int c;

    Schoolboy(String cn, String years,String y)
    {
        class_number=cn;
        age=years;
        age2=y;
    }

    public String getClass_number() { return class_number; }

    public int Task(){
        int i = Integer.parseInt(age.trim());
        int i2=Integer.parseInt(age2.trim());
        c=i-i2;
        return c;
    }
    public void printInfo() {
        JOptionPane.showMessageDialog(null," I think you are in this class: "+Task()+" And you said that in: "+getClass_number());
    }// реализация абстрактного метода вывода информации об объекте класса для круга

}

// класс объявлен как абстрактный, так как в нём не реализованы
// абстрактные методы реализуемых интерфейсов.
// ОНИ ДОЛЖНЫ БЫТЬ РЕАЛИЗОВАНЫ В КЛАССАХ-НАСЛЕДНИКАХ!!!
abstract class Learner implements Object,Task{
    String faculty, speciality, group_number;

    Learner(String faculty,String speciality,String group_number) {
        this.faculty=faculty;
        this.speciality=speciality;
        this.group_number=group_number;
    }

    public String getFaculty() {
        return faculty;
    }
    public String getSpeciality() {
        return speciality;
    }

    public abstract String getGroup_number();
}

class Postgraduate extends Learner {
    public Postgraduate(String f, String sp, String group_number) {
        super(f, sp, group_number);
    }

    public String getGroup_number(){
        return group_number;
    }

    public void printInfo() {
        JOptionPane.showMessageDialog(null,"Faculty: "+getFaculty()+" Speciality: "+getSpeciality()+" Group number: "+getGroup_number());
    }

    public int Task() {
        return 0;
    }
}

class Main {
    public static void main(String[] args){

        String name1;
        String sx1;
        String y1;
        String y2;
        int input, input2, input3;

        name1=JOptionPane.showInputDialog("Enter your name:");
        sx1=JOptionPane.showInputDialog("Enter your sex:");
        y1=JOptionPane.showInputDialog("Enter your age:");
        int i = Integer.parseInt(y1.trim());
        y2=JOptionPane.showInputDialog("How old did you go to school?:");
        Student s1=new Student(name1,sx1,y1,y2);
        s1.printInfo();


        String klass;
        input = JOptionPane.showConfirmDialog(null, "Do you go to school?");
        if (input==0) {
            klass = JOptionPane.showInputDialog("Enter klass:");
            Schoolboy sc1 = new Schoolboy(klass,y1,y2);
            sc1.printInfo();
            input2 = JOptionPane.showConfirmDialog(null, "Am I right in my calculations?");
            if(input2==1){
                JOptionPane.showMessageDialog(null,"I'll try my best next time!!!");
            }
            else if(input2==0){
                JOptionPane.showMessageDialog(null,"Hooray!");
            }
        }
        else {
            input3 = JOptionPane.showConfirmDialog(null, "Do you go to university?");
            if (input3 == 0) {
                String facult;
                String speс;
                String gr;
                facult = JOptionPane.showInputDialog("Enter facult:");
                speс = JOptionPane.showInputDialog("Enter speс:");
                gr = JOptionPane.showInputDialog("Enter gr:");
                Postgraduate p1 = new Postgraduate(facult, speс, gr);
                p1.printInfo();
            }
        }
    }
}

