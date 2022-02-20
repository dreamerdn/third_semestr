package L_3_5;

public class Main {
    public static void main(String[] args) {
        Dishes s1=new Dishes("Dasha1",'f',20);
        System.out.println("Name: "+s1.getFull_name()+" sex: "+s1.getSex()+" age: "+s1.getAge()+" rechenie: "+s1.Educational_institution());
        Dishes s2=new Dishes("Dasha2",'f');
        System.out.println("Name: "+s2.getFull_name()+" sex: "+s2.getSex()+" rechenie: "+s2.Educational_institution());
        Dishes s3=new Dishes();
        System.out.println("Name: "+s3.getFull_name()+" sex: "+s3.getSex()+" age: "+s3.getAge()+" rechenie: "+s3.Educational_institution());
        System.out.println(" ");

        Pot sc1=new Pot("Max1",'m',19, 953506, 'A');
        System.out.println("Name: "+sc1.getFull_name()+" sex: "+sc1.getSex()+" age: "+sc1.getAge()+" №: "+sc1.getClass_number()+" lt: "+sc1.getLetter()+" rechenie: "+sc1.Educational_institution());
        Pot sc2=new Pot("Max2",953506, 'A');
        System.out.println("Name: "+sc2.getFull_name()+" №: "+sc2.getClass_number()+" lt: "+sc2.getLetter()+" rechenie: "+sc2.Educational_institution());
        Pot sc3=new Pot();
        System.out.println("Name: "+sc3.getFull_name()+" sex: "+sc3.getSex()+" age: "+sc3.getAge()+" №: "+sc3.getClass_number()+" lt: "+sc1.getLetter()+" rechenie: "+sc3.Educational_institution());
        System.out.println(" ");

        Pan l1=new Pan("Lena",'f',19,"economic","marketer",074002);
        System.out.println("Name: "+l1.getFull_name()+" sex: "+l1.getSex()+" age: "+l1.getAge()+" faculty: " +l1.getFaculty()+" speciality: "+l1.getSpeciality()+" group_number: "+l1.getGroup_number()+" rechenie: "+l1.Educational_institution());
        Pan l2=new Pan("Lena","economic","marketer",074002);
        System.out.println("Name: "+l2.getFull_name()+" faculty: " +l2.getFaculty()+" speciality: "+l2.getSpeciality()+" group_number: "+l2.getGroup_number()+" rechenie: "+l2.Educational_institution());
        Pan l3=new Pan();
        System.out.println("Name: "+l3.getFull_name()+" sex: "+l3.getSex()+" age: "+l3.getAge()+" faculty: " +l3.getFaculty()+" speciality: "+l3.getSpeciality()+" group_number: "+l3.getGroup_number()+" rechenie: "+l3.Educational_institution());
        System.out.println(" ");

        Plate p1=new Plate("Nikita",'m',19,"something","somebody");
        System.out.println("Name: "+p1.getFull_name()+" sex: "+p1.getSex()+" age: "+p1.getAge()+" title_of_scientific_work: " +p1.getTitle_of_scientific_work()+" scientific_director: "+p1.getScientific_director()+" rechenie: "+p1.Educational_institution());
        Plate p2=new Plate("Nikita","something","somebody");
        System.out.println("Name: "+p2.getFull_name()+" title_of_scientific_work: " +p2.getTitle_of_scientific_work()+" scientific_director: "+p2.getScientific_director()+" rechenie: "+p2.Educational_institution());
        Plate p3=new Plate();
        System.out.println("Name: "+p3.getFull_name()+" sex: "+p3.getSex()+" age: "+p3.getAge()+" title_of_scientific_work: " +p3.getTitle_of_scientific_work()+" scientific_director: "+p3.getScientific_director()+" rechenie: "+p3.Educational_institution());
    }

}
