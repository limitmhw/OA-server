package model.mapper;

import java.util.List;
import model.po.T161003;
import model.po.T161003Example;
import org.apache.ibatis.annotations.Param;

public interface T161003Mapper {
    int countByExample(T161003Example example);

    int deleteByExample(T161003Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T161003 record);

    int insertSelective(T161003 record);

    List<T161003> selectByExample(T161003Example example);

    T161003 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T161003 record, @Param("example") T161003Example example);

    int updateByExample(@Param("record") T161003 record, @Param("example") T161003Example example);

    int updateByPrimaryKeySelective(T161003 record);

    int updateByPrimaryKey(T161003 record);
}