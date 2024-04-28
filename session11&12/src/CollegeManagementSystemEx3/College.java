package CollegeManagementSystemEx3;

import java.util.ArrayList;

public class College {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<CollegeCourses> courses;


    public College() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void addCourse(CollegeCourses collegeCourses) {
        courses.add(collegeCourses);
    }

    public void removeCourse(CollegeCourses collegeCourses) {
        courses.remove(collegeCourses);
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<CollegeCourses> getCourses() {
        return courses;
    }
}
