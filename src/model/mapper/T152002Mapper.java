package model.mapper;

import java.util.List;
import model.po.T152002;
import model.po.T152002Example;
import org.apache.ibatis.annotations.Param;

public interface T152002Mapper {
    int countByExample(T152002Example example);

    int deleteByExample(T152002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T152002 record);

    int insertSelective(T152002 record);

    List<T152002> selectByExample(T152002Example example);

    T152002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T152002 record, @Param("example") T152002Example example);

    int updateByExample(@Param("record") T152002 record, @Param("example") T152002Example example);

    int updateByPrimaryKeySelective(T152002 record);

    int updateByPrimaryKey(T152002 record);
}