package service;

import java.util.List;

import dao.ClassRosterDao;
import dao.ClassRosterPersistenceException;
import dto.Student;

public class ClassRosterServiceLayerImpl implements ClassRosterServiceLayer{

    private final ClassRosterDao dao;

    public ClassRosterServiceLayerImpl(ClassRosterDao dao) {
        this.dao = dao;
    }

    @Override
    public void createStudent(Student student) throws ClassRosterDuplicateIdException,
            ClassRosterDataValidationException, ClassRosterPersistenceException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        // TODO Auto-generated method stub
        return null;
    }
        
}
