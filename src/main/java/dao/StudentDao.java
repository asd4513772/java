package dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pojo.Studen;

import java.util.List;

@Mapper
public interface StudentDao extends BaseMapper<Studen> {
    List<Studen> findAll();

    List<Studen> findAllById(Studen id);



}
