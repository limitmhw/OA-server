package model.mapper;

import java.util.List;
import model.po.XiangMuXinXi;
import model.po.XiangMuXinXiExample;
import org.apache.ibatis.annotations.Param;

public interface XiangMuXinXiMapper {
    int countByExample(XiangMuXinXiExample example);

    int deleteByExample(XiangMuXinXiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XiangMuXinXi record);

    int insertSelective(XiangMuXinXi record);

    List<XiangMuXinXi> selectByExample(XiangMuXinXiExample example);

    XiangMuXinXi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XiangMuXinXi record, @Param("example") XiangMuXinXiExample example);

    int updateByExample(@Param("record") XiangMuXinXi record, @Param("example") XiangMuXinXiExample example);

    int updateByPrimaryKeySelective(XiangMuXinXi record);

    int updateByPrimaryKey(XiangMuXinXi record);
}