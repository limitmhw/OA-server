package model.mapper;

import java.util.List;
import model.po.T152006;
import model.po.T152006Example;
import org.apache.ibatis.annotations.Param;

public interface T152006Mapper {
    int countByExample(T152006Example example);

    int deleteByExample(T152006Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T152006 record);

    int insertSelective(T152006 record);

    List<T152006> selectByExample(T152006Example example);

    T152006 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T152006 record, @Param("example") T152006Example example);

    int updateByExample(@Param("record") T152006 record, @Param("example") T152006Example example);

    int updateByPrimaryKeySelective(T152006 record);

    int updateByPrimaryKey(T152006 record);
}