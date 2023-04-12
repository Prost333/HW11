import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Facultet  {
    private String facultName;
    private List<Gruppa> spisokGrupp = new ArrayList<>();
    private Enum active;

    public Facultet(String facultName, Enum active) {
        this.facultName = facultName;
        this.active = active;

    }

    public Enum getActive() {
        return active;
    }

    public void setActive(Enum active) {
        this.active = active;
    }

    public Facultet() {
    }

    public String getFacultName() {
        return facultName;
    }

    public void setFacultName(String facultName) {
        this.facultName = facultName;
    }

    public List<Gruppa> getSpisokGrupp() {
        return spisokGrupp;
    }

    public void setSpisokGrupp(List<Gruppa> spisokGrupp) {
        this.spisokGrupp = spisokGrupp;
    }

    public void addGruppa(Gruppa gruppa) {
        spisokGrupp.add(gruppa);
    }
    //Task1.7
    public void changeEnum(){
        if (active==Enum.ACTIVE){
            active=Enum.INACTIVE;
            System.out.println(" Факультет закрылся");
        } else if (active==Enum.INACTIVE) {
           active=Enum.ACTIVE;
            System.out.println(" Факультет Активен");
        }
    }
    public int howMuchStudents(){
        int total=0;
        for (Gruppa g:spisokGrupp) {
            total+=g.getStudents().size();
        }
        System.out.println(total);
         return  total;
    }
    //Task1.8
    public  void optimiziren(){
        if (howMuchStudents()<20){
            active=Enum.INACTIVE;
        }
    }
    //Task1.11
    public  void task10(){
        List<Student> students=new ArrayList<>();
        for (Gruppa gruppa:spisokGrupp) {
            students.addAll(gruppa.getStudents());
        }
        students.sort(Comparator.comparingDouble(Student::getMidSvore).reversed());
        for (Student s:students){
            System.out.println(s.getName()+" "+s.getSurname()+s.getMidSvore());
        }
    }
    //Task1.11
    public  void task11(){
        List<Student> students=new ArrayList<>();
        for (Gruppa gruppa:spisokGrupp) {
            students.addAll(gruppa.getStudents());
        }
        students.sort(Comparator.comparingDouble(Student::getMidSvore));
        for (Student s:students){
            System.out.println(s.getName()+" "+s.getSurname()+s.getMidSvore());
        }
    }


    }


