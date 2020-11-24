package controller;

import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Student;

import java.util.List;

@Controller
@RequestMapping("Student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("selectAll")
    @ResponseBody
    public List<Student> SelectAindll(Integer x){
        return studentService.findAll(x);
    }

    @GetMapping("selectById")
    @ResponseBody
    public Student SlectById(Integer id){
        return studentService.selectById(id);
    }

    @PostMapping("deleteById")
    public void DeleteById(Integer id){
        studentService.deleteById(id);
    }

    @PostMapping("updataById")
    public void UpdateById(Integer id){
        studentService.updateById(id);
    }

    @PostMapping("inserter")
    public Student Inserte(Student student){
        return studentService.insertById(student);
    }









}
