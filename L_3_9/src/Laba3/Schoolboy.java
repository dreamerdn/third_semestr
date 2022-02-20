package Laba3;

public class Schoolboy extends Student {
    private int class_number;
    private char letter;
    Schoolboy(String name, String pol, String years, int class_number, char letter) {
        super(name, pol, years);
        this.class_number=class_number;
        this.letter=letter;
    }
    Schoolboy(String name,int class_number, char letter)
    {
        super(name);
        this.class_number=class_number;
        this.letter=letter;
    }
    Schoolboy(){

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
