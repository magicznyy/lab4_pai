package jd.lab4_pai.controllers;

import jd.lab4_pai.entities.Student;
import jd.lab4_pai.entities.StudentRepository;
import jd.lab4_pai.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/students")
    public List<Student> showAllStudents(){
       return studentService.getStudentList();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent( @PathVariable Integer id){
        studentService.deleteStudent(id);
    }

    @PutMapping("/student/{id}/edit/{editValue}/{value}")
    public void editStudent(@PathVariable Integer id,
                            @PathVariable String value,
                            @PathVariable String editValue){
        studentService.editStudent(id,value, editValue);
    }


}
