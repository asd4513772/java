package controller;

import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pojo.Studen;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("selectAll")
    public String SelectAindll(Model model){
      List<Studen>list=studentService.findAll();
      model.addAttribute("list",list);
        return "list";

    }

}
