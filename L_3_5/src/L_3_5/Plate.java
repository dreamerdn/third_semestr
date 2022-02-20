package L_3_5;

public class Plate extends Dishes {
    String title_of_scientific_work, scientific_director;
    Plate(String name, char pol, int years,String title_of_scientific_work, String scientific_director) {
        super(name, pol, years);
        this.scientific_director=scientific_director;
        this.title_of_scientific_work=title_of_scientific_work;
    }
    Plate(String name,String title_of_scientific_work, String scientific_director){
        this.scientific_director=scientific_director;
        this.title_of_scientific_work=title_of_scientific_work;
    }
    Plate(){

    }

    public String getTitle_of_scientific_work() {
        return title_of_scientific_work;
    }
    public String getScientific_director() {
        return scientific_director;
    }

    public float Educational_institution(){
        square = (float) Math.sqrt(((2 + 2 + 2) / 1) * (((2 + 2 + 2) / 1) - 1));
        return square;
    }


}
