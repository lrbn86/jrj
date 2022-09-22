package dto;

public class Student {

    private String firstName;
    private String lastName;
    final String studentId;
    private String cohort;

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCohort() {
        return this.cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

}
