package L2;

interface Figure{
    int F_area(int a,int h);
    void F_information();
}

public class SearchInfo {

    public void Сomparison(int S, int aa) {
        if (S == aa)
            System.out.println("S1=" + aa);
        else
        if (S > aa)
            System.out.println("S1>" + aa);
        else
        if (S < aa)
            System.out.println("S1<" + aa);

    }

    public void Сomparison2(int S2, int ss){
        if (S2 == ss)
            System.out.println("S2=" + ss);
        else
        if (S2 > ss)
            System.out.println("S2>" + ss);
        else
        if (S2 < ss)
            System.out.println("S2<" + ss);

    }

}
