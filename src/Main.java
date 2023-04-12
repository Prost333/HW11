import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrStr = new ArrayList<>();
//        String a = " Why";
//        String b = " You";
//        String c = " Called";
//        String d = " Me";
//        String e = " Only";
//        arrStr.add(a);
//        arrStr.add(b);
//        arrStr.add(c);
//        arrStr.add(d);
//        arrStr.add(e);
//        for (String i:arrStr) {
//            System.out.print(i);
//        }
//        arrStr.remove(d);
//        arrStr.remove(e);
//        for (String i:arrStr) {
//            System.out.print(i);
//        }


        Student student1 = new Student("Kolya ", "Antipenko ", "15.2.2000", "Gomel", 3.8);
        Student student2 = new Student("Saha ", "Baha ", "27.7.2001", "Minsk", 8.9);
        Student student3 = new Student("John ", "Travolte ", "19.12.2003", "Nebraska", 5.0);
        Student student4 = new Student("Barack ", "Obema ", "19.12.2003", "NY", 9.0);
        Student student5 = new Student("Barack ", "Obema ", "10.4.2005", "LA", 7.4);


        Gruppa first = new Gruppa("First");
        Gruppa second = new Gruppa("Second");
        Gruppa third = new Gruppa("Third");
        first.addStudent(student1);
        first.addStudent(student2);
        second.addStudent(student3);
        second.addStudent(student4);
        third.addStudent(student5);


        Facultet inyaz = new Facultet("inyaz",Enum.ACTIVE);
        Facultet texnari = new Facultet("texnari",Enum.ACTIVE);
        inyaz.addGruppa(first);
        inyaz.addGruppa(second);
        inyaz.addGruppa(third);
        texnari.addGruppa(first);
        texnari.addGruppa(second);
        texnari.addGruppa(third);
        first.deleteStudent(student1);
        second.midlSvore();
        texnari.howMuchStudents();
//        texnari.task10();
//        texnari.task11();
        first.incorporation(first,second);





    }
}