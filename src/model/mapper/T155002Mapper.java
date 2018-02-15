package model.mapper;

import java.util.List;
import model.po.T155002;
import model.po.T155002Example;
import org.apache.ibatis.annotations.Param;

public interface T155002Mapper {
    int countByExample(T155002Example example);

    int deleteByExample(T155002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T155002 record);

    int insertSelective(T155002 record);

    List<T155002> selectByExample(T155002Example example);

    T155002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T155002 record, @Param("example") T155002Example example);

    int updateByExample(@Param("record") T155002 record, @Param("example") T155002Example example);

    int updateByPrimaryKeySelective(T155002 record);

    int updateByPrimaryKey(T155002 record);
}