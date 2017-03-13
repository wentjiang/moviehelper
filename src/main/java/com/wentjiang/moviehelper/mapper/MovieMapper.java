package com.wentjiang.moviehelper.mapper;

import com.wentjiang.moviehelper.model.Movie;
import com.wentjiang.moviehelper.model.MovieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MovieMapper {
    int countByExample(MovieExample example);

    int deleteByExample(MovieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Movie record);

    int insertSelective(Movie record);

    List<Movie> selectByExampleWithBLOBsWithRowbounds(MovieExample example, RowBounds rowBounds);

    List<Movie> selectByExampleWithBLOBs(MovieExample example);

    List<Movie> selectByExampleWithRowbounds(MovieExample example, RowBounds rowBounds);

    List<Movie> selectByExample(MovieExample example);

    Movie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Movie record, @Param("example") MovieExample example);

    int updateByExampleWithBLOBs(@Param("record") Movie record, @Param("example") MovieExample example);

    int updateByExample(@Param("record") Movie record, @Param("example") MovieExample example);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKeyWithBLOBs(Movie record);

    int updateByPrimaryKey(Movie record);
}