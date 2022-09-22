package ui;

import dto.Student;

public class ClassRosterView {
    
    private UserIO io = new UserIOConsoleImpl();

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Students");
        io.print("2. Create New Student");
        io.print("3. View a Student");
        io.print("4. Remove a Student");
        io.print("5. Exit");

        return io.readInt("Please select from the above choices.");
    }

    public Student getNewStudentInfo() {
        Student currentStudent = new Student(io.readString("Please enter Student ID"));
        currentStudent.setFirstName(io.readString("Please enter First Name"));
        currentStudent.setLastName(io.readString("Please enter Last Name"));
        currentStudent.setCohort(io.readString("Please enter Cohort"));
        return currentStudent;
    }

}
