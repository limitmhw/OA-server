package model.mapper;

import java.util.List;
import model.po.T154002;
import model.po.T154002Example;
import org.apache.ibatis.annotations.Param;

public interface T154002Mapper {
    int countByExample(T154002Example example);

    int deleteByExample(T154002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T154002 record);

    int insertSelective(T154002 record);

    List<T154002> selectByExample(T154002Example example);

    T154002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T154002 record, @Param("example") T154002Example example);

    int updateByExample(@Param("record") T154002 record, @Param("example") T154002Example example);

    int updateByPrimaryKeySelective(T154002 record);

    int updateByPrimaryKey(T154002 record);
}