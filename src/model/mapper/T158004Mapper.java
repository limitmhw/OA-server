package model.mapper;

import java.util.List;
import model.po.T158004;
import model.po.T158004Example;
import org.apache.ibatis.annotations.Param;

public interface T158004Mapper {
    int countByExample(T158004Example example);

    int deleteByExample(T158004Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T158004 record);

    int insertSelective(T158004 record);

    List<T158004> selectByExample(T158004Example example);

    T158004 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T158004 record, @Param("example") T158004Example example);

    int updateByExample(@Param("record") T158004 record, @Param("example") T158004Example example);

    int updateByPrimaryKeySelective(T158004 record);

    int updateByPrimaryKey(T158004 record);
}