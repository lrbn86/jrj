package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dto.Student;

public class ClassRosterDaoFileImpl implements ClassRosterDao {

    final Map<String, Student> students = new HashMap<>();

    @Override
    public Student addStudent(String studentId, Student student) {
        return students.put(studentId, student);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<Student>(students.values());
    }

    @Override
    public Student getStudent(String studentId) {
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
