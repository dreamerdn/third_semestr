public class WriteInfo {

    public static void main(String[] args) {
        Ward e1 = new Ward("Ivanov", 12000, true);
        Ward e2 = new Ward();
        System.out.println("1.");
        System.out.println("---Enter surname---");
        e1.show1();
        System.out.println("---Enter number_of_seats---");
        e1.show2();
        System.out.println("\n---Enter all fields---");
        e1.show3();

        System.out.println("2.");
        System.out.println("---Enter surname---");
        e2.show1();
        System.out.println("---Enter number_of_seats---");
        e2.show2();
        System.out.println("\n---Enter all fields---");
        e2.show3();

    }
}

