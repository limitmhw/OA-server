package model.mapper;

import java.util.List;
import model.po.T152005;
import model.po.T152005Example;
import org.apache.ibatis.annotations.Param;

public interface T152005Mapper {
    int countByExample(T152005Example example);

    int deleteByExample(T152005Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T152005 record);

    int insertSelective(T152005 record);

    List<T152005> selectByExample(T152005Example example);

    T152005 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T152005 record, @Param("example") T152005Example example);

    int updateByExample(@Param("record") T152005 record, @Param("example") T152005Example example);

    int updateByPrimaryKeySelective(T152005 record);

    int updateByPrimaryKey(T152005 record);
}