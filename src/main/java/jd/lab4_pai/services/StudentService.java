package jd.lab4_pai.services;

import jd.lab4_pai.entities.Student;
import jd.lab4_pai.entities.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getStudentList() {
        return (List<Student>) studentRepository.findAll();
    }


    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public void editStudent(Integer id,String value, String editValue){
        Student student;
        if(studentRepository.existsById(id)){
             student = studentRepository.findStudentById(id);
            if(editValue.equals("imie"))
                student.setName(value);
            else if (editValue.equals("nazwisko"))
                student.setSurname(value);
            else if(editValue.equals("srednia"))
                student.setAverage(Float.parseFloat(value));

            studentRepository.save(student);
        }
    }

    public void deleteStudent(Integer id){
        if(studentRepository.existsById(id))
        studentRepository.delete(studentRepository.findStudentById(id));
    }

}
