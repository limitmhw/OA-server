package model.mapper;

import java.util.List;
import model.po.GongSiXinXi;
import model.po.GongSiXinXiExample;
import model.po.GongSiXinXiKey;
import org.apache.ibatis.annotations.Param;

public interface GongSiXinXiMapper {
    int countByExample(GongSiXinXiExample example);

    int deleteByExample(GongSiXinXiExample example);

    int deleteByPrimaryKey(GongSiXinXiKey key);

    int insert(GongSiXinXi record);

    int insertSelective(GongSiXinXi record);

    List<GongSiXinXi> selectByExampleWithBLOBs(GongSiXinXiExample example);

    List<GongSiXinXi> selectByExample(GongSiXinXiExample example);

    GongSiXinXi selectByPrimaryKey(GongSiXinXiKey key);

    int updateByExampleSelective(@Param("record") GongSiXinXi record, @Param("example") GongSiXinXiExample example);

    int updateByExampleWithBLOBs(@Param("record") GongSiXinXi record, @Param("example") GongSiXinXiExample example);

    int updateByExample(@Param("record") GongSiXinXi record, @Param("example") GongSiXinXiExample example);

    int updateByPrimaryKeySelective(GongSiXinXi record);

    int updateByPrimaryKeyWithBLOBs(GongSiXinXi record);

    int updateByPrimaryKey(GongSiXinXi record);
}