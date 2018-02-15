package model.mapper;

import java.util.List;
import model.po.T160002;
import model.po.T160002Example;
import org.apache.ibatis.annotations.Param;

public interface T160002Mapper {
    int countByExample(T160002Example example);

    int deleteByExample(T160002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T160002 record);

    int insertSelective(T160002 record);

    List<T160002> selectByExample(T160002Example example);

    T160002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T160002 record, @Param("example") T160002Example example);

    int updateByExample(@Param("record") T160002 record, @Param("example") T160002Example example);

    int updateByPrimaryKeySelective(T160002 record);

    int updateByPrimaryKey(T160002 record);
}