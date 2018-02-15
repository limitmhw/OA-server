package model.mapper;

import java.util.List;
import model.po.Wtable;
import model.po.WtableExample;
import org.apache.ibatis.annotations.Param;

public interface WtableMapper {
    int countByExample(WtableExample example);

    int deleteByExample(WtableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wtable record);

    int insertSelective(Wtable record);

    List<Wtable> selectByExample(WtableExample example);

    Wtable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wtable record, @Param("example") WtableExample example);

    int updateByExample(@Param("record") Wtable record, @Param("example") WtableExample example);

    int updateByPrimaryKeySelective(Wtable record);

    int updateByPrimaryKey(Wtable record);
}