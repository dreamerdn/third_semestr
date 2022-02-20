package qw;

public class Main {
    public static void main(String[] args) {
        Tribe []t1 = new Tribe[4];
        t1[0] = new Tribe("Land", 600, true);
        t1[1] = new Tribe("Wind", 480);
        t1[2] = new Tribe();
        t1[3] = new Tribe(t1[0]);
        for(int i=0;i<4;i++);{
            t1[i].print();}
        System.out.println("Sum of amount" + Tribe.Amount(t1));
        System.out.println("Has fire" + Tribe.hasFire_ralate(t1));
    }
}
}
