package model.mapper;

import java.util.List;
import model.po.Eauthority;
import model.po.EauthorityExample;
import org.apache.ibatis.annotations.Param;

public interface EauthorityMapper {
    int countByExample(EauthorityExample example);

    int deleteByExample(EauthorityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Eauthority record);

    int insertSelective(Eauthority record);

    List<Eauthority> selectByExample(EauthorityExample example);

    Eauthority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Eauthority record, @Param("example") EauthorityExample example);

    int updateByExample(@Param("record") Eauthority record, @Param("example") EauthorityExample example);

    int updateByPrimaryKeySelective(Eauthority record);

    int updateByPrimaryKey(Eauthority record);
}