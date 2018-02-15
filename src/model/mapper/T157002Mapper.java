package model.mapper;

import java.util.List;
import model.po.T157002;
import model.po.T157002Example;
import org.apache.ibatis.annotations.Param;

public interface T157002Mapper {
    int countByExample(T157002Example example);

    int deleteByExample(T157002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T157002 record);

    int insertSelective(T157002 record);

    List<T157002> selectByExample(T157002Example example);

    T157002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T157002 record, @Param("example") T157002Example example);

    int updateByExample(@Param("record") T157002 record, @Param("example") T157002Example example);

    int updateByPrimaryKeySelective(T157002 record);

    int updateByPrimaryKey(T157002 record);
}