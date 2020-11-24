package Serviceimpl;

import Service.StudentService;
import dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.Studen;

import java.util.List;

public class StudenServiceimpl  implements StudentService {
    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Studen> findAll() {
        return studentDao.selectList(null);
    }

    @Override
    public List<Studen> findAllById( ) {

       return null;

    }



}
