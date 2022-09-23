package dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import dto.Student;

public class ClassRosterDaoFileImpl implements ClassRosterDao {

    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";

    final Map<String, Student> students = new HashMap<>();

    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterDaoException {
        loadRoster();
        Student newStudent = students.put(studentId, student);
        writeRoster();
        return newStudent;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterDaoException {
        loadRoster();
        return new ArrayList<Student>(students.values());
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterDaoException {
        loadRoster();
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterDaoException {
        loadRoster();
        Student removedStudent = students.remove(studentId);
        writeRoster();
        return removedStudent;
    }

    private String marshalStudent(Student aStudent) {
        String studentAsText = aStudent.getStudentId() + DELIMITER;
        studentAsText += aStudent.getFirstName() + DELIMITER;
        studentAsText += aStudent.getLastName() + DELIMITER;
        studentAsText += aStudent.getCohort();
        return studentAsText;
    }

    private Student unmarshalStudent(String studentAsText) {
        String[] studentTokens = studentAsText.split(DELIMITER);
        String studentId = studentTokens[0];
        Student studentFromFile = new Student(studentId);
        studentFromFile.setFirstName(studentTokens[1]);
        studentFromFile.setLastName(studentTokens[2]);
        studentFromFile.setCohort(studentTokens[3]);
        return studentFromFile;
    }

    private void writeRoster() throws ClassRosterDaoException {
        PrintWriter out = null;

        try {
            // Write out the Student objects to the roster file.
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
            String studentAsText;
            List<Student> studentList = new ArrayList<Student>(students.values());
            for (Student currentStudent : studentList) {
                // turn a Student into a string
                studentAsText = marshalStudent(currentStudent);
                // write the Student object to the file
                out.println(studentAsText);
                // force PrintWriter to write line to the file
                out.flush();
            }
        } catch (IOException e) {
            throw new ClassRosterDaoException("Could not save student data.", e);
        } finally {
            // clean up
            if (out != null) {
                out.close();
            }
        }
    }

    private void loadRoster() throws ClassRosterDaoException {
        Scanner sc = null;

        try {
            sc = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
            String currentLine;
            Student currentStudent;
            while (sc.hasNextLine()) {
                currentLine = sc.nextLine();
                currentStudent = unmarshalStudent(currentLine);
                students.put(currentStudent.getStudentId(), currentStudent);
            }
        } catch (FileNotFoundException e) {
            throw new ClassRosterDaoException("-_- Could not load roster data into memory.", e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }


    
    
}
