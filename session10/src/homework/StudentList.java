package homework;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        studentList.add("VLADA ANDREI");
        studentList.add("DARIE EMANUEL");
        studentList.add("DANULESCU RAZVAN");
        studentList.add("LOLEA MARIUS");
        studentList.add("MICLAUS SIMONA");
        studentList.add("MIHAI GEORGE");
        studentList.add("MOSOIU IONITA TRAIAN");
        studentList.add("NICOARA TANIA");
        studentList.add("POP IOAN");
        studentList.add("SIMION EMIL");

        Collections.copy(studentList, graduateStudentList);
        Collections.sort(graduateStudentList);

        System.out.println("Graduate student list is : ");

        for (String s : graduateStudentList) {
            System.out.println(s);
        }
    }
}
