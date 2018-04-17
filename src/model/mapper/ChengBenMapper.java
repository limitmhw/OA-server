package model.mapper;

import java.util.List;
import model.po.ChengBen;
import model.po.ChengBenExample;
import org.apache.ibatis.annotations.Param;

public interface ChengBenMapper {
    int countByExample(ChengBenExample example);

    int deleteByExample(ChengBenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChengBen record);

    int insertSelective(ChengBen record);

    List<ChengBen> selectByExample(ChengBenExample example);

    ChengBen selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChengBen record, @Param("example") ChengBenExample example);

    int updateByExample(@Param("record") ChengBen record, @Param("example") ChengBenExample example);

    int updateByPrimaryKeySelective(ChengBen record);

    int updateByPrimaryKey(ChengBen record);
}