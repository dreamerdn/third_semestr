package L_3_5;

public class Pan extends Dishes {
    String faculty, speciality;
    int group_number;
    Pan (String name, char pol, int years, String faculty,String speciality,int group_number) {
        super(name, pol, years);
        this.faculty=faculty;
        this.speciality=speciality;
        this.group_number=group_number;
    }
    Pan (String name, String faculty,String speciality,int group_number){
        this.faculty=faculty;
        this.speciality=speciality;
        this.group_number=group_number;
    }
    Pan (){

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
