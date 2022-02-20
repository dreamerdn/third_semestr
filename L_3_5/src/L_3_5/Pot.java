package L_3_5;

public class Pot extends Dishes {
    private int class_number;
    private char letter;
    float square;
    Pot(String name, char pol, int years, int class_number, char letter) {
        super(name, pol, years);
        this.class_number=class_number;
        this.letter=letter;
    }
    Pot(String name,int class_number, char letter)
    {
        this.class_number=class_number;
        this.letter=letter;
    }
    Pot(){

    }

    public int getClass_number() {
        return class_number;
    }

    public char getLetter() {
        return letter;
    }

    public float Educational_institution(){
        square = (float) Math.sqrt(((1 + 1 + 1) / 1) * (((1 + 1 + 1) / 1) - 0.5));
        return square;
    }

}
