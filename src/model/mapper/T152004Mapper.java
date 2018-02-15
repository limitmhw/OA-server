package model.mapper;

import java.util.List;
import model.po.T152004;
import model.po.T152004Example;
import org.apache.ibatis.annotations.Param;

public interface T152004Mapper {
    int countByExample(T152004Example example);

    int deleteByExample(T152004Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T152004 record);

    int insertSelective(T152004 record);

    List<T152004> selectByExample(T152004Example example);

    T152004 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T152004 record, @Param("example") T152004Example example);

    int updateByExample(@Param("record") T152004 record, @Param("example") T152004Example example);

    int updateByPrimaryKeySelective(T152004 record);

    int updateByPrimaryKey(T152004 record);
}