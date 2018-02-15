package model.mapper;

import java.util.List;
import model.po.GongCheng;
import model.po.GongChengExample;
import org.apache.ibatis.annotations.Param;

public interface GongChengMapper {
    int countByExample(GongChengExample example);

    int deleteByExample(GongChengExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GongCheng record);

    int insertSelective(GongCheng record);

    List<GongCheng> selectByExample(GongChengExample example);

    GongCheng selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GongCheng record, @Param("example") GongChengExample example);

    int updateByExample(@Param("record") GongCheng record, @Param("example") GongChengExample example);

    int updateByPrimaryKeySelective(GongCheng record);

    int updateByPrimaryKey(GongCheng record);
}