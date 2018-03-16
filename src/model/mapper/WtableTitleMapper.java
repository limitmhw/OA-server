package model.mapper;

import java.util.List;
import model.po.WtableTitle;
import model.po.WtableTitleExample;
import org.apache.ibatis.annotations.Param;

public interface WtableTitleMapper {
    int countByExample(WtableTitleExample example);

    int deleteByExample(WtableTitleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtableTitle record);

    int insertSelective(WtableTitle record);

    List<WtableTitle> selectByExample(WtableTitleExample example);

    WtableTitle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtableTitle record, @Param("example") WtableTitleExample example);

    int updateByExample(@Param("record") WtableTitle record, @Param("example") WtableTitleExample example);

    int updateByPrimaryKeySelective(WtableTitle record);

    int updateByPrimaryKey(WtableTitle record);
}