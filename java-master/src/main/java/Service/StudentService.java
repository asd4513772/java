package Service;

import pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll(Integer x);

    Student selectById(Integer id);

    void deleteById(Integer id);

    void updateById(Integer id);

    Student insertById(Student student);




}
