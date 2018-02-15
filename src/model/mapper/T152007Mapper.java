package model.mapper;

import java.util.List;
import model.po.T152007;
import model.po.T152007Example;
import org.apache.ibatis.annotations.Param;

public interface T152007Mapper {
    int countByExample(T152007Example example);

    int deleteByExample(T152007Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T152007 record);

    int insertSelective(T152007 record);

    List<T152007> selectByExample(T152007Example example);

    T152007 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T152007 record, @Param("example") T152007Example example);

    int updateByExample(@Param("record") T152007 record, @Param("example") T152007Example example);

    int updateByPrimaryKeySelective(T152007 record);

    int updateByPrimaryKey(T152007 record);
}