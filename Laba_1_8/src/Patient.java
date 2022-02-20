public class Patient {
    String surname;
    private char sex;
    private int age;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}

class Demo{
    public static void main(String[] args){
        Patient p1 = new Patient();
        Patient p2 = new Patient();

        p1.setSurname("Neyzhmak");
        p1.setSex('F');
        p1.setAge(20);
        p2.setSurname("Slizh");
        p2.setSex('M');
        p2.setAge(19);


        System.out.println("Surname: "+p1.getSurname());
        System.out.println("Sex: "+p1.getSex());
        System.out.println("Age: "+p1.getAge());
        System.out.println("Surname: "+p2.getSurname());
        System.out.println("Sex: "+p2.getSex());
        System.out.println("Age: "+p2.getAge());
    }
}