package model.mapper;

import java.util.List;
import model.po.Wexcel;
import model.po.WexcelExample;
import org.apache.ibatis.annotations.Param;

public interface WexcelMapper {
    int countByExample(WexcelExample example);

    int deleteByExample(WexcelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wexcel record);

    int insertSelective(Wexcel record);

    List<Wexcel> selectByExample(WexcelExample example);

    Wexcel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wexcel record, @Param("example") WexcelExample example);

    int updateByExample(@Param("record") Wexcel record, @Param("example") WexcelExample example);

    int updateByPrimaryKeySelective(Wexcel record);

    int updateByPrimaryKey(Wexcel record);
}