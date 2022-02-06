package a.polyanskaya.model;

import java.util.Objects;

/*
Application --> JDBC API --> JDBC Driver Manager --> MySQL'
Application <-- JDBC API <-- JDBC Driver Manager <-- MySQL'
 */
public class User {


    private long id;
    private String name;
    private String specialty;
    private int salary;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                salary == user.salary &&
                Objects.equals(name, user.name) &&
                Objects.equals(specialty, user.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, specialty, salary);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
