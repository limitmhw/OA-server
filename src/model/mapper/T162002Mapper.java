package model.mapper;

import java.util.List;
import model.po.T162002;
import model.po.T162002Example;
import org.apache.ibatis.annotations.Param;

public interface T162002Mapper {
    int countByExample(T162002Example example);

    int deleteByExample(T162002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T162002 record);

    int insertSelective(T162002 record);

    List<T162002> selectByExample(T162002Example example);

    T162002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T162002 record, @Param("example") T162002Example example);

    int updateByExample(@Param("record") T162002 record, @Param("example") T162002Example example);

    int updateByPrimaryKeySelective(T162002 record);

    int updateByPrimaryKey(T162002 record);
}