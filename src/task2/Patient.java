package task2;

import java.util.Objects;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private String diagnosis;
    private Types type;

    public Patient(int id, String name, String surname, String diagnosis, Types type) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.type = type;
    }

    public Patient() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(diagnosis, patient.diagnosis) && type == patient.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id + name + surname + diagnosis + type);
    }
}
