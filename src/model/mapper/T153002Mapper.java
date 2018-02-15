package model.mapper;

import java.util.List;
import model.po.T153002;
import model.po.T153002Example;
import org.apache.ibatis.annotations.Param;

public interface T153002Mapper {
    int countByExample(T153002Example example);

    int deleteByExample(T153002Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T153002 record);

    int insertSelective(T153002 record);

    List<T153002> selectByExample(T153002Example example);

    T153002 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T153002 record, @Param("example") T153002Example example);

    int updateByExample(@Param("record") T153002 record, @Param("example") T153002Example example);

    int updateByPrimaryKeySelective(T153002 record);

    int updateByPrimaryKey(T153002 record);
}