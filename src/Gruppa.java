import java.util.ArrayList;
import java.util.List;

public class Gruppa {
    private String numberG;
    private List <Student> students= new ArrayList<>();

    public Gruppa() {
    }

    public Gruppa(String numberG) {
        this.numberG = numberG;


    }

    public String getNumberG() {
        return numberG;
    }

    public void setNumberG(String numberG) {
        this.numberG = numberG;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    //Task1.4

    public void deleteStudent (Student student){
        if (students.contains(student)){
            if (student.getMidSvore()<4){
                students.remove(student);
            }else {
                System.out.println("Студент нормально учится");}
        }else {
            System.out.println("Такого студента нет");
        }
    }
    public void incorporation (Gruppa gruppa1, Gruppa gruppa2) {

        if (gruppa1.getStudents().size()<2){
            gruppa2.getStudents().addAll(gruppa1.getStudents());
        }
        System.out.println(gruppa2.getStudents().size());
        }


    //Task1.9
    public double midlSvore(){
        double sum=0;
        for (Student s:students) {
            sum+=s.getMidSvore();
        }
        System.out.println(sum/ students.size());
        return sum/ students.size();
    }

}
