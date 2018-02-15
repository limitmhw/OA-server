package model.mapper;

import java.util.List;
import model.po.T158002;
import model.po.T158002Example;
import org.apache.ibatis.annotations.Param;

public interface T158002Mapper {
    int countByExample(T158002Example example);

    int deleteByExample(T158002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T158002 record);

    int insertSelective(T158002 record);

    List<T158002> selectByExample(T158002Example example);

    T158002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T158002 record, @Param("example") T158002Example example);

    int updateByExample(@Param("record") T158002 record, @Param("example") T158002Example example);

    int updateByPrimaryKeySelective(T158002 record);

    int updateByPrimaryKey(T158002 record);
}