public class Qe100 {
    public String toString(){
        return getClass().getSimpleName();
    }

    public static void main(String[] args){
        Qe101 q= new Qe101();
        System.out.println(q.toString());
    }
}
class Qe99 extends Qe100{
}
class Qe101 extends Qe99{
}