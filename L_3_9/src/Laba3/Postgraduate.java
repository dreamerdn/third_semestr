package Laba3;

public class Postgraduate extends Student{
    String title_of_scientific_work, scientific_director;
    Postgraduate(String name, String pol, String years,String title_of_scientific_work, String scientific_director) {
        super(name, pol, years);
        this.scientific_director=scientific_director;
        this.title_of_scientific_work=title_of_scientific_work;
    }
    Postgraduate(String name,String title_of_scientific_work, String scientific_director){
        super(name);
        this.scientific_director=scientific_director;
        this.title_of_scientific_work=title_of_scientific_work;
    }
    Postgraduate(){

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
