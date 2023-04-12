public class Student {
    private String name;
    private  String surname;
    private  String date;
    private  String city;
    private double midSvore;


    public Student() {
    }

    public Student(String name, String surname, String date, String city, double midSvore) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.city = city;
        this.midSvore = midSvore;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getMidSvore() {
        return midSvore;
    }

    public void setMidSvore(double midSvore) {
        this.midSvore = midSvore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", год='" + date + '\'' +
                ", Город='" + city + '\'' +
                ", Средний Балл='" + midSvore + '\'' +
                '}';
    }
}
