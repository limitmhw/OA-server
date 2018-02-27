package model.mapper;

import java.util.List;
import model.po.XiangMuRenYuanZhuCe;
import model.po.XiangMuRenYuanZhuCeExample;
import org.apache.ibatis.annotations.Param;

public interface XiangMuRenYuanZhuCeMapper {
    int countByExample(XiangMuRenYuanZhuCeExample example);

    int deleteByExample(XiangMuRenYuanZhuCeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XiangMuRenYuanZhuCe record);

    int insertSelective(XiangMuRenYuanZhuCe record);

    List<XiangMuRenYuanZhuCe> selectByExample(XiangMuRenYuanZhuCeExample example);

    XiangMuRenYuanZhuCe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XiangMuRenYuanZhuCe record, @Param("example") XiangMuRenYuanZhuCeExample example);

    int updateByExample(@Param("record") XiangMuRenYuanZhuCe record, @Param("example") XiangMuRenYuanZhuCeExample example);

    int updateByPrimaryKeySelective(XiangMuRenYuanZhuCe record);

    int updateByPrimaryKey(XiangMuRenYuanZhuCe record);
}