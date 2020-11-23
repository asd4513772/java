package Serviceimpl;

import Service.StudentService;
import dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;

public class StudenServiceimpl  implements StudentService {
    @Autowired
    private StudentDao studentDao;



}
