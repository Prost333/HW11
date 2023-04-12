package task2;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String nameDepartment;
    private List<Room> spisokRoom = new ArrayList<>();

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public List<Room> getSpisokRoom() {
        return spisokRoom;
    }

    public void setSpisokRoom(List<Room> spisokRoom) {
        this.spisokRoom = spisokRoom;
    }

    public void addRoom(Room room) {
        spisokRoom.add(room);
    }


    //Task2.6
    public void maleOrFemale() {
        int sumf = 0;
        int sumM = 0;
        for (Room room : spisokRoom) {
            for (Patient p : room.getPatients()) {
                if (p.getType() == Types.FEMALE) {
                    sumf++;
                } else if (p.getType() == Types.MALE) {
                    sumM++;
                }
            }

        }
        System.out.println("Female: " + sumf);
        System.out.println("Male: " + sumM);
    }

    public void addPatientForDiagnoz(Patient patient) {
        Room room = new Room(spisokRoom.size()+1 , patient.getType(), "Диарея");
        for (Room r : spisokRoom) {
            if (r.getRoomForDiagnos().equals(patient.getDiagnosis())) {
                r.addPatient(patient);
                spisokRoom.add(r);
                System.out.println(patient.getName()+" заселился в палату: ");
                break;

            } else {
                Room room1 = new Room(spisokRoom.size()+1 , patient.getType(), patient.getDiagnosis());
                room1.addPatient(patient);
                spisokRoom.add(room1);
                break;

            }
        }

    }
}



