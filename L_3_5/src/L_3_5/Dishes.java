package L_3_5;

public class Dishes {
    private String full_name;
    private char sex;
    private int age;
    float square;

    Dishes(String name,char pol, int years){
        full_name=name;
        sex=pol;
        age=years;
    }
    Dishes(String name,char pol){
        full_name=name;
        sex=pol;
    }
    Dishes(){

    }

    public String getFull_name(){
        return full_name;
    }
    public char getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }

    public float Educational_institution(){
        square=(float) Math.sqrt(((2+9+3)/1)*(((1+5+6)/1)-8));
        return square;
    }

}
