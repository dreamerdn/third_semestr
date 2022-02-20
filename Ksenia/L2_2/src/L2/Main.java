package L2;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);

        int aa;
        int hh;
        System.out.print("Enter 'a' for Triangle:");
        aa=in.nextInt();
        System.out.print("Enter 'h' for Triangle:");
        hh=in.nextInt();
        Triangle t=new Triangle(aa,hh);
        t.F_area(aa,hh);
        t.F_information();
        //t.Сomparison(aa);

        int ss;
        System.out.print("Enter 'a' for Square:");
        ss=in.nextInt();
        Square s=new Square(ss);
        s.F_area(ss,ss);
        s.F_information();
        //s.Сomparison2(ss);

        SearchInfo q=new SearchInfo();
        q.Сomparison(t.F_area(aa,hh),aa);

        SearchInfo w=new SearchInfo();
        w.Сomparison(t.F_area(aa,hh),ss);


    }
}
