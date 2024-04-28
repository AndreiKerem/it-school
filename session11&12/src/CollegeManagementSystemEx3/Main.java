package CollegeManagementSystemEx3;

public class Main {

    public static void main(String[] args) {

        College college = new College();

        Student student1 = new Student("Mats", "Yatzil", "Masculine", 20, "01.02.2009", 1234252325, "Str. Invierii 27");
        Student student2 = new Student("Karolina", "Ralf", "Female", 19, "23.09.2004", 153245156, "Bd.Unirii 12");
        Student student3 = new Student("Felicie", "Anuschka", "Female", 18, "17.11.2005", 249592329, "Str. Fainari 1");
        Student student4 = new Student("Norbert", "Micha", "Masculine", 21, "14.01.2003", 284828148, "Int. Abanosului 6");

        college.addStudent(student1);
        college.addStudent(student2);
        college.addStudent(student3);
        college.addStudent(student4);

        Teacher teacher1 = new Teacher("Jens", "Amalia", "Female", 44, "30.03.1980", 582884859, "Sos. Salaj 290", "Math");
        Teacher teacher2 = new Teacher("Elise", "Giiwedin", "Female", 31, "06.04.1993", 952834951, "Calea Mosilor 301", "English");
        Teacher teacher3 = new Teacher("Angelika", "Lotta", "Female", 64, "20.09.1959", 532895329, "Sos. Colenta 120", "Chemistry");
        Teacher teacher4 = new Teacher("Ionut", "Baur", "Masculine", 36, "14.01.1988", 688011442, "Str.Stefan cel Mare 10", "Computer Science");
        Teacher teacher5 = new Teacher("Daniel", "Sharpe", "Masculine", 40, "10.08.1983", 368843567, "46 Park End St", "Physics");
        Teacher teacher6 = new Teacher("Stephanie", "Ferrari", "Female", 31, "03.01.1993", 32684975, "1632 Simons Hollow Road", "History");
        Teacher teacher7 = new Teacher("John", "Maser", "Masculine", 85, "26.12.1938", 94383113, "3525 Nelm Street", "Geography");
        Teacher teacher8 = new Teacher("Laura", "McCowan", "Female", 59, "28.04.1964", 20036271, "887 Science Center Drive", "Biology");

        college.addTeacher(teacher1);
        college.addTeacher(teacher2);
        college.addTeacher(teacher3);
        college.addTeacher(teacher4);
        college.addTeacher(teacher5);
        college.addTeacher(teacher6);
        college.addTeacher(teacher7);
        college.addTeacher(teacher8);

        CollegeCourses mathClass = new CollegeCourses("Math", teacher1);
        mathClass.addStudent(student1);
        mathClass.addStudent(student2);
        mathClass.addStudent(student3);
        mathClass.addStudent(student4);

        CollegeCourses englishClass = new CollegeCourses("English", teacher2);
        englishClass.addStudent(student1);
        englishClass.addStudent(student2);
        englishClass.addStudent(student3);

        CollegeCourses scienceClass = new CollegeCourses("Computer Science", teacher4);
        scienceClass.addStudent(student1);
        scienceClass.addStudent(student2);
        scienceClass.addStudent(student3);
        scienceClass.addStudent(student4);

        CollegeCourses chemistryClass = new CollegeCourses("Chemistry", teacher3);
        chemistryClass.addStudent(student1);
        chemistryClass.addStudent(student3);

        CollegeCourses physicsClass = new CollegeCourses("Physics", teacher5);
        physicsClass.addStudent(student2);
        physicsClass.addStudent(student4);

        CollegeCourses historyClass = new CollegeCourses("History", teacher6);
        historyClass.addStudent(student1);
        historyClass.addStudent(student2);
        historyClass.addStudent(student4);

        CollegeCourses geographyClass = new CollegeCourses("Geography", teacher7);
        geographyClass.addStudent(student3);
        geographyClass.addStudent(student2);
        geographyClass.addStudent(student4);

        CollegeCourses biologyClass = new CollegeCourses("Biolohy", teacher8);
        geographyClass.addStudent(student4);
        geographyClass.addStudent(student3);
        geographyClass.addStudent(student2);
        geographyClass.addStudent(student1);

        college.addCourse(mathClass);
        college.addCourse(englishClass);
        college.addCourse(scienceClass);
        college.addCourse(chemistryClass);
        college.addCourse(physicsClass);
        college.addCourse(historyClass);
        college.addCourse(geographyClass);
        college.addCourse(biologyClass);

        System.out.println("School information:");
        System.out.println("Number of students: " + college.getStudents().size());
        System.out.println("Number of teachers: " + college.getTeachers().size());
        System.out.println("Number of classes: " + college.getCourses().size());
        System.out.println();

        System.out.println("Math class information:");
        System.out.println("Class name: " + mathClass.getCourseName());
        System.out.println("Teacher: " + mathClass.getTeacher().getLastName() + " " + mathClass.getTeacher().getFirstName());
        System.out.println("Number of students: " + mathClass.getStudents().size());
        System.out.println();

        System.out.println("English class information:");
        System.out.println("Class name: " + englishClass.getCourseName());
        System.out.println("Teacher: " + englishClass.getTeacher().getLastName() + " " +englishClass.getTeacher().getFirstName());
        System.out.println("Number of students: " + englishClass.getStudents().size());
        System.out.println();

        college.removeStudent(student1);
        college.removeTeacher(teacher2);
        college.removeCourse(mathClass);

        System.out.println("School information after removing one student, teacher and Class:");
        System.out.println("Number of students: " + college.getStudents().size());
        System.out.println("Number of teachers: " + college.getTeachers().size());
        System.out.println("Number of classes: " + college.getCourses().size());
    }
}
