package task2;

public class Main {
    public static void main(String[] args) {
        Patient patient1= new Patient(1," Игорь"," Инов","ОРВИ", Types.MALE);
        Patient patient2= new Patient(2," Саня"," Блатной","Чесотка", Types.MALE);
        Patient patient3= new Patient(3," Надя"," Хой","ОРВИ", Types.FEMALE);
        Patient patient4= new Patient(4," Алина"," Волкова","Диарея", Types.FEMALE);
        Patient patient5= new Patient(5," Юра"," Кот","ОРВИ", Types.MALE);
        Patient patient6= new Patient(6," Оля"," Хакс","Диарея", Types.FEMALE);
        Patient patient7= new Patient(7," Юля"," Хакс","Диарея", Types.FEMALE);
        Patient patient8= new Patient(8," Koma"," Paul","Диарея", Types.FEMALE);

        Room one = new Room(1, Types.FEMALEROOM,"Диарея");
        one.addPatient(patient3);
        one.addPatient(patient6);
        one.addPatient(patient7);
        Room two = new Room(2, Types.MALE,"ОРВИ");
        two.addPatient(patient1);
        two.addPatient(patient2);
        two.addPatient(patient5);
        Room three =new Room(3, Types.FEMALEROOM,"Чесотка");
        three.addPatient(patient4);
//        two.sortID();
//        three.sortID();
        Department head =new Department("Главное управление");
        head.addRoom(one);
        head.addRoom(two);
        head.addRoom(three);
        head.maleOrFemale();
        head.addPatientForDiagnoz(patient5);
        head.addPatientForDiagnoz(patient8);
        System.out.println(head.getSpisokRoom().size());







    }
}
