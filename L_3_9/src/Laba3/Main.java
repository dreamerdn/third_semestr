package Laba3;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String[] text= new String[4];
        String[] c= new String[4];
        String[] ag= new String[4];

        for(int i=0;i<4;i++) {
            text[i] = JOptionPane.showInputDialog("Enter full name");
            c[i] = JOptionPane.showInputDialog("Enter sex");
            ag[i] = JOptionPane.showInputDialog("Enter age");
        }

        Student s1=new Student(text[0],c[0],ag[0]);
        Student s2=new Student(text[0],c[0]);
        Student s3=new Student();

        JOptionPane.showMessageDialog(null,"Name: "+s1.getFull_name()+" sex: "+s1.getSex()+" age: "+s1.getAge()+" rechenie: "+s1.Educational_institution()+"\nName: "+s2.getFull_name()+" sex: "+s2.getSex()+" rechenie: "+s2.Educational_institution()+"\nName: "+s3.getFull_name()+" sex: "+s3.getSex()+" age: "+s3.getAge()+" rechenie: "+s3.Educational_institution());

        Schoolboy sc1=new Schoolboy(text[1],c[1],ag[1], 953506, 'A');
        Schoolboy sc2=new Schoolboy(text[1],953506, 'A');
        Schoolboy sc3=new Schoolboy();
        JOptionPane.showMessageDialog(null,"Name: "+sc1.getFull_name()+" sex: "+sc1.getSex()+" age: "+sc1.getAge()+" №: "+sc1.getClass_number()+" lt: "+sc1.getLetter()+" rechenie: "+sc1.Educational_institution()+"\nName: "+sc2.getFull_name()+" №: "+sc2.getClass_number()+" lt: "+sc2.getLetter()+" rechenie: "+sc2.Educational_institution()+"\nName: "+sc3.getFull_name()+" sex: "+sc3.getSex()+" age: "+sc3.getAge()+" №: "+sc3.getClass_number()+" lt: "+sc1.getLetter()+" rechenie: "+sc3.Educational_institution());

        Learner l1=new Learner(text[2],c[2],ag[2],"economic","marketer",74002);
        Learner l2=new Learner(text[2],"economic","marketer",74002);
        Learner l3=new Learner();
        JOptionPane.showMessageDialog(null,"Name: "+l1.getFull_name()+" sex: "+l1.getSex()+" age: "+l1.getAge()+" faculty: " +l1.getFaculty()+" speciality: "+l1.getSpeciality()+" group_number: "+l1.getGroup_number()+" rechenie: "+l1.Educational_institution()+"\nName: "+l2.getFull_name()+" faculty: " +l2.getFaculty()+" speciality: "+l2.getSpeciality()+" group_number: "+l2.getGroup_number()+" rechenie: "+l2.Educational_institution()+"\nName: "+l3.getFull_name()+" sex: "+l3.getSex()+" age: "+l3.getAge()+" faculty: " +l3.getFaculty()+" speciality: "+l3.getSpeciality()+" group_number: "+l3.getGroup_number()+" rechenie: "+l3.Educational_institution());

        Postgraduate p1=new Postgraduate(text[3],c[3],ag[3],"something","somebody");
        Postgraduate p2=new Postgraduate(text[3],"something","somebody");
        Postgraduate p3=new Postgraduate();
        JOptionPane.showMessageDialog(null,"Name: "+p1.getFull_name()+" sex: "+p1.getSex()+" age: "+p1.getAge()+" title_of_scientific_work: " +p1.getTitle_of_scientific_work()+" scientific_director: "+p1.getScientific_director()+" rechenie: "+p1.Educational_institution()+"\nName: "+p2.getFull_name()+" title_of_scientific_work: " +p2.getTitle_of_scientific_work()+" scientific_director: "+p2.getScientific_director()+" rechenie: "+p2.Educational_institution()+"\nName: "+p3.getFull_name()+" sex: "+p3.getSex()+" age: "+p3.getAge()+" title_of_scientific_work: " +p3.getTitle_of_scientific_work()+" scientific_director: "+p3.getScientific_director()+" rechenie: "+p3.Educational_institution());

    }
}
