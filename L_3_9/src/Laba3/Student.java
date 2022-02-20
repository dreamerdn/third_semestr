package Laba3;

public class Student {
    private String full_name;
    private String sex;
    private String age;
    float square;

    Student(String name,String pol, String years){
        full_name=name;
        sex=pol;
        age=years;
    }
    Student(String name,String pol){
        full_name=name;
        sex=pol;
    }
    Student(String name){
        full_name=name;
    }
    Student(){

    }

    public void setFull_name(String full_name) {

        this.full_name = full_name;
    }
    public void setSex(String sex) {

        this.sex = sex;
    }
    public void setAge(String age) {

        this.age = age;
    }


    public String getFull_name(){

        return full_name;
    }
    public String getSex(){

        return sex;
    }
    public String getAge(){

        return age;
    }

    public float Educational_institution(){
        square=(float) Math.sqrt(((2+9+3)/1)*(((1+5+6)/1)-8));
        return square;
    }
}
