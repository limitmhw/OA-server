package model.mapper;

import java.util.List;
import model.po.TableContent;
import model.po.TableContentExample;
import org.apache.ibatis.annotations.Param;

public interface TableContentMapper {
    int countByExample(TableContentExample example);

    int deleteByExample(TableContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableContent record);

    int insertSelective(TableContent record);

    List<TableContent> selectByExampleWithBLOBs(TableContentExample example);

    List<TableContent> selectByExample(TableContentExample example);

    TableContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableContent record, @Param("example") TableContentExample example);

    int updateByExampleWithBLOBs(@Param("record") TableContent record, @Param("example") TableContentExample example);

    int updateByExample(@Param("record") TableContent record, @Param("example") TableContentExample example);

    int updateByPrimaryKeySelective(TableContent record);

    int updateByPrimaryKeyWithBLOBs(TableContent record);

    int updateByPrimaryKey(TableContent record);
}