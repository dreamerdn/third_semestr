package L2;

public class Triangle implements Figure{

    int a;
    int h;
    int S;

    Triangle(int a1,int h1){
        a=a1;
        h=h1;
    }

    public int F_area(int a, int h){
        S=(h*a)/2;

        return S;
    }

    public void F_information(){
        System.out.println("a: "+a+"\nh: "+h+"\nS1: "+S);
    }


}
