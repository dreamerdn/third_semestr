package Laba3;

public class Learner extends Student{
    String faculty, speciality;
    int group_number;
    Learner(String name, String pol, String years, String faculty,String speciality,int group_number) {
        super(name, pol, years);
        this.faculty=faculty;
        this.speciality=speciality;
        this.group_number=group_number;
    }
    Learner(String name, String faculty,String speciality,int group_number){
        super(name);
        this.faculty=faculty;
        this.speciality=speciality;
        this.group_number=group_number;
    }
    Learner(){

    }

    public String getFaculty() {
        return faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getGroup_number() {
        return group_number;
    }

    public float Educational_institution(){
        square = (float) Math.sqrt(((1 + 1 + 1) / 1) * (((1 + 1 + 1) / 1) - 0.4));
        return square;
    }
}
