package jd.lab4_pai.controllers;

import jd.lab4_pai.entities.Student;
import jd.lab4_pai.entities.StudentRepository;
import jd.lab4_pai.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        System.out.println("XD");
    }

    @GetMapping("/students")
    public void showAllStudents(){
        studentService.getStudentList();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent( @PathVariable Integer id){
        studentService.deleteStudent(id);
    }

    @PutMapping("/student/{id}/edit/{editValue}/{value}")
    public void editStudent(@PathVariable Integer id, @PathVariable String value, @PathVariable String editValue){

        System.out.println(id + " " + value + " editValue: " + editValue );
        studentService.editStudent(id,value, editValue);
    }


}
