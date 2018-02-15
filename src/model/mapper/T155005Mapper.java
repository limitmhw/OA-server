package model.mapper;

import java.util.List;
import model.po.T155005;
import model.po.T155005Example;
import org.apache.ibatis.annotations.Param;

public interface T155005Mapper {
    int countByExample(T155005Example example);

    int deleteByExample(T155005Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T155005 record);

    int insertSelective(T155005 record);

    List<T155005> selectByExample(T155005Example example);

    T155005 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T155005 record, @Param("example") T155005Example example);

    int updateByExample(@Param("record") T155005 record, @Param("example") T155005Example example);

    int updateByPrimaryKeySelective(T155005 record);

    int updateByPrimaryKey(T155005 record);
}