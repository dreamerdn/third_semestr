package L1;

public class Patient {
    String name;
    String sex;
    int age;

    Patient(String name2, String sex2, int age2){
        name= name2;
        sex=sex2;
        age=age2;
    }


    void print_Info(Patient a){
        System.out.println(a.name+" "+a.sex+" "+a.age);
    }
}
