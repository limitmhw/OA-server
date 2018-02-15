package model.mapper;

import java.util.List;
import model.po.T155004;
import model.po.T155004Example;
import org.apache.ibatis.annotations.Param;

public interface T155004Mapper {
    int countByExample(T155004Example example);

    int deleteByExample(T155004Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T155004 record);

    int insertSelective(T155004 record);

    List<T155004> selectByExample(T155004Example example);

    T155004 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T155004 record, @Param("example") T155004Example example);

    int updateByExample(@Param("record") T155004 record, @Param("example") T155004Example example);

    int updateByPrimaryKeySelective(T155004 record);

    int updateByPrimaryKey(T155004 record);
}