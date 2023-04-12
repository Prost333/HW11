package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Room {
    private int number;
    private Types typeRoom;
    private String roomForDiagnos;
    private List<Patient> patients = new ArrayList<>();

    public Room() {
    }

    public Room(int number, Types typeRoom, String roomForDiagnos) {
        this.number = number;
        this.typeRoom = typeRoom;
        this.roomForDiagnos = roomForDiagnos;
    }

    public Room(int number, Types typeRoom) {
        this.number = number;
        this.typeRoom = typeRoom;



    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRoomForDiagnos() {
        return roomForDiagnos;
    }

    public void setRoomForDiagnos(String roomForDiagnos) {
        this.roomForDiagnos = roomForDiagnos;
    }

    public void setTypeRoom(Types typeRoom) {
        this.typeRoom = typeRoom;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void addPatient(Patient patient) {
        if (patients.size() < 3) {
            patients.add(patient);
            System.out.println(patient.getName() + " заселился в  палату  " + number);
        }
//        else {
//            System.out.println("В палате нет свободных мест");
//
//        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return number == room.number && typeRoom == room.typeRoom && Objects.equals(roomForDiagnos, room.roomForDiagnos) && Objects.equals(patients, room.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, typeRoom, roomForDiagnos, patients);
    }

    public void sortID() {
        patients.sort(Comparator.comparingInt(Patient::getId));
        for (Patient p : patients) {
            System.out.println("ID " + p.getId() + " " + p.getSurname() + " " + p.getDiagnosis());
        }
    }
}
