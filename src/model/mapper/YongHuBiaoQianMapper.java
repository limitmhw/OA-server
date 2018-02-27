package model.mapper;

import java.util.List;
import model.po.YongHuBiaoQian;
import model.po.YongHuBiaoQianExample;
import org.apache.ibatis.annotations.Param;

public interface YongHuBiaoQianMapper {
    int countByExample(YongHuBiaoQianExample example);

    int deleteByExample(YongHuBiaoQianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YongHuBiaoQian record);

    int insertSelective(YongHuBiaoQian record);

    List<YongHuBiaoQian> selectByExample(YongHuBiaoQianExample example);

    YongHuBiaoQian selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YongHuBiaoQian record, @Param("example") YongHuBiaoQianExample example);

    int updateByExample(@Param("record") YongHuBiaoQian record, @Param("example") YongHuBiaoQianExample example);

    int updateByPrimaryKeySelective(YongHuBiaoQian record);

    int updateByPrimaryKey(YongHuBiaoQian record);
}