package model.mapper;

import java.util.List;
import model.po.T159002;
import model.po.T159002Example;
import org.apache.ibatis.annotations.Param;

public interface T159002Mapper {
    int countByExample(T159002Example example);

    int deleteByExample(T159002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T159002 record);

    int insertSelective(T159002 record);

    List<T159002> selectByExample(T159002Example example);

    T159002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T159002 record, @Param("example") T159002Example example);

    int updateByExample(@Param("record") T159002 record, @Param("example") T159002Example example);

    int updateByPrimaryKeySelective(T159002 record);

    int updateByPrimaryKey(T159002 record);
}