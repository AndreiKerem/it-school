package ex3;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private String studentID;
    private String email;

    public Student(String name, int age, String studentID, String email) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }
}
