package model.mapper;

import java.util.List;
import model.po.YongHu;
import model.po.YongHuExample;
import org.apache.ibatis.annotations.Param;

public interface YongHuMapper {
    int countByExample(YongHuExample example);

    int deleteByExample(YongHuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YongHu record);

    int insertSelective(YongHu record);

    List<YongHu> selectByExample(YongHuExample example);

    YongHu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YongHu record, @Param("example") YongHuExample example);

    int updateByExample(@Param("record") YongHu record, @Param("example") YongHuExample example);

    int updateByPrimaryKeySelective(YongHu record);

    int updateByPrimaryKey(YongHu record);
}