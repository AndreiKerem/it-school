package CollegeManagementSystemEx3;

public class Student {

    private String firstName;
    private String lastName;
    private String Sex;
    private int Age;
    private String dateOfBirth;
    private long CNP;
    private String Address;


    public Student(String firstName, String lastName, String Sex, int Age, String dateOfBirth, long CNP, String Address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Sex = Sex;
        this.Age = Age;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        this.Address = Address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getCNP() {
        return CNP;
    }

    public void setCNP(long CNP) {
        this.CNP = CNP;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
