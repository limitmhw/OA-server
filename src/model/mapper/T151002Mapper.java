package model.mapper;

import java.util.List;
import model.po.T151002;
import model.po.T151002Example;
import org.apache.ibatis.annotations.Param;

public interface T151002Mapper {
    int countByExample(T151002Example example);

    int deleteByExample(T151002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T151002 record);

    int insertSelective(T151002 record);

    List<T151002> selectByExample(T151002Example example);

    T151002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T151002 record, @Param("example") T151002Example example);

    int updateByExample(@Param("record") T151002 record, @Param("example") T151002Example example);

    int updateByPrimaryKeySelective(T151002 record);

    int updateByPrimaryKey(T151002 record);
}