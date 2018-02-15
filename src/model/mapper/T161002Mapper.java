package model.mapper;

import java.util.List;
import model.po.T161002;
import model.po.T161002Example;
import org.apache.ibatis.annotations.Param;

public interface T161002Mapper {
    int countByExample(T161002Example example);

    int deleteByExample(T161002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T161002 record);

    int insertSelective(T161002 record);

    List<T161002> selectByExample(T161002Example example);

    T161002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T161002 record, @Param("example") T161002Example example);

    int updateByExample(@Param("record") T161002 record, @Param("example") T161002Example example);

    int updateByPrimaryKeySelective(T161002 record);

    int updateByPrimaryKey(T161002 record);
}