package model.mapper;

import java.util.List;
import model.po.T156002;
import model.po.T156002Example;
import org.apache.ibatis.annotations.Param;

public interface T156002Mapper {
    int countByExample(T156002Example example);

    int deleteByExample(T156002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T156002 record);

    int insertSelective(T156002 record);

    List<T156002> selectByExample(T156002Example example);

    T156002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T156002 record, @Param("example") T156002Example example);

    int updateByExample(@Param("record") T156002 record, @Param("example") T156002Example example);

    int updateByPrimaryKeySelective(T156002 record);

    int updateByPrimaryKey(T156002 record);
}