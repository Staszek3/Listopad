package PakListop_3_4_2018;

public class Employee {
    private String name;
    private String surname;
    private String position;
    private Long id;

    public Employee(String name, String surname, String position, Long id) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

