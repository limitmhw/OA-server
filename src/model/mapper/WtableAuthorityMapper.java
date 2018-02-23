package model.mapper;

import java.util.List;
import model.po.WtableAuthority;
import model.po.WtableAuthorityExample;
import org.apache.ibatis.annotations.Param;

public interface WtableAuthorityMapper {
    int countByExample(WtableAuthorityExample example);

    int deleteByExample(WtableAuthorityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtableAuthority record);

    int insertSelective(WtableAuthority record);

    List<WtableAuthority> selectByExample(WtableAuthorityExample example);

    WtableAuthority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtableAuthority record, @Param("example") WtableAuthorityExample example);

    int updateByExample(@Param("record") WtableAuthority record, @Param("example") WtableAuthorityExample example);

    int updateByPrimaryKeySelective(WtableAuthority record);

    int updateByPrimaryKey(WtableAuthority record);
}