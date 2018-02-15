package model.mapper;

import java.util.List;
import model.po.T158003;
import model.po.T158003Example;
import org.apache.ibatis.annotations.Param;

public interface T158003Mapper {
    int countByExample(T158003Example example);

    int deleteByExample(T158003Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T158003 record);

    int insertSelective(T158003 record);

    List<T158003> selectByExample(T158003Example example);

    T158003 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T158003 record, @Param("example") T158003Example example);

    int updateByExample(@Param("record") T158003 record, @Param("example") T158003Example example);

    int updateByPrimaryKeySelective(T158003 record);

    int updateByPrimaryKey(T158003 record);
}