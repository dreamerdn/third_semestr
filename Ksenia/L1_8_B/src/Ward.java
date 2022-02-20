class Ward {

    //поля класса
    String surname;
    int number_of_seats;
    boolean free_beds;

    //конструктор
    Ward(String sur, int num, boolean bed){
        this.surname=sur;
        this.number_of_seats=num;
        this.free_beds=bed;
    }

    Ward(){
        this.surname="Petrov";
        this.number_of_seats=140;
        this.free_beds=false;
    }

    void show1(){

        System.out.println("Doctor's surname: "+surname);
    }
    void show2(){

        System.out.println("Number of seats: "+number_of_seats);
    }
    void show3(){
        System.out.println("Doctor's surname: "+surname+"\nNumber of seats: "+number_of_seats+"\nAvailability of free beds - "+free_beds);
    }


    public static void main(String[] args) {
        Ward e1 = new Ward("Ivanov", 120, true);
        System.out.println("---Enter surname---");
        e1.show1();
        System.out.println("---Enter number_of_seats---");
        e1.show2();
        System.out.println("\n---Enter all fields---");
        e1.show3();
    }
}
