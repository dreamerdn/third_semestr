package L1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient("Dasha ","f ",20);
        Patient p2 = new Patient("Max ","m ",20);

        p1.print_Info(p1);
        p2.print_Info(p2);

        String n;
        String s;
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a surname: ");
        n = in.next();
        System.out.print("Input a sex: ");
        s = in.next();
        System.out.print("Input a age: ");
        a = in.nextInt();
        Patient p3 = new Patient(n,s,a);

        p3.print_Info(p3);

    }
}
