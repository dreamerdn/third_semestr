package Patient;

import java.io.IOException;

public class Demo {
    //создаем поля
    String surname;
    private char sex;
    private int age;

    //конструкторы
    Demo(String sur){

        surname=sur;
    }
    Demo(char s){

        sex=s;
    }
    Demo(int a){

        age = a;
    }

    //геттеры
    public String getSurname() {

        return surname;
    }

    public char getSex() {

        return sex;
    }

    public int getAge() {

        return age;
    }

    //метод для отображения поля Surname
     void show1(int cntM,int n,int i, Demo[] arr) {
        if (i!=0){
            System.out.print((i - 1) + ") Surname: " + arr[i].getSurname());
        }
        else
         System.out.print((i + 1) + ") Surname: " + arr[i].getSurname());
     }
    //метод для отображения поля Sex
     void show2(int cntM,int n,int i, Demo[] arr) {

        System.out.print("; Sex: " + arr[i+1].getSex());
    }
    //метод для отображения поля Age
        void show3(int cntM,int n,int i, Demo[] arr) {

        System.out.print("; Age: " + arr[i+2].getAge()+ "\n");
    }

    //метод для подсчета среднего возраста пациентов
    public static int Count(int numb,int cntM,int n,Demo[] arr){
        int sum=0;
        int aver=0;
        for(int i=0;i<cntM;i++){
        sum+=(arr[i].age);
        }
        aver=sum/numb;
        if(cntM==n) {
            System.out.println("Average : " + aver);
        }
      return aver;
    }

    //метод, для подсчета количества женщин
    public static int Female (int n, Demo[] arr,int cntM){
        int cnt=0;
        for (int i=0;i<cntM;i++){
        if (arr[i].sex == 'f')
            cnt++;
        }
        if(cntM==n) {
            System.out.println("Number of women : " + cnt);
        }
        return cnt;
    }

}

