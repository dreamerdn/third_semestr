package L2;

public class Square implements Figure {

    int a;
    int h;
    int S2;

    Square(int a1){
        a=a1;
        h=a1;
    }

    public int F_area(int a,int h){
        S2=a*h;
        return S2;
    }

     public void F_information(){
        System.out.println("a: "+a+"\nS2: "+S2+"\n");
    }


}
