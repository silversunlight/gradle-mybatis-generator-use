package com.tcl.cibn.mapper;

import com.tcl.cibn.model.Channel;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface ChannelMapper {
    @Delete({
        "delete from channel",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into channel (title, description, ",
        "sort, icon, cp, ",
        "thumb, thumb_ott, ",
        "category, blocked, share)",
        "values (#{title,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{sort,jdbcType=INTEGER}, #{icon,jdbcType=VARCHAR}, #{cp,jdbcType=VARCHAR}, ",
        "#{thumb,jdbcType=VARCHAR}, #{thumbOtt,jdbcType=VARCHAR}, ",
        "#{category,jdbcType=VARCHAR}, #{blocked,jdbcType=BIT}, #{share,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Channel record);

    @Select({
        "select",
        "id, title, description, sort, icon, cp, thumb, thumb_ott, category, blocked, ",
        "share",
        "from channel",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="cp", property="cp", jdbcType=JdbcType.VARCHAR),
        @Result(column="thumb", property="thumb", jdbcType=JdbcType.VARCHAR),
        @Result(column="thumb_ott", property="thumbOtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="blocked", property="blocked", jdbcType=JdbcType.BIT),
        @Result(column="share", property="share", jdbcType=JdbcType.VARCHAR)
    })
    Channel selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, title, description, sort, icon, cp, thumb, thumb_ott, category, blocked, ",
        "share",
        "from channel"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="cp", property="cp", jdbcType=JdbcType.VARCHAR),
        @Result(column="thumb", property="thumb", jdbcType=JdbcType.VARCHAR),
        @Result(column="thumb_ott", property="thumbOtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="blocked", property="blocked", jdbcType=JdbcType.BIT),
        @Result(column="share", property="share", jdbcType=JdbcType.VARCHAR)
    })
    List<Channel> selectAll();

    @Update({
        "update channel",
        "set title = #{title,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=INTEGER},",
          "icon = #{icon,jdbcType=VARCHAR},",
          "cp = #{cp,jdbcType=VARCHAR},",
          "thumb = #{thumb,jdbcType=VARCHAR},",
          "thumb_ott = #{thumbOtt,jdbcType=VARCHAR},",
          "category = #{category,jdbcType=VARCHAR},",
          "blocked = #{blocked,jdbcType=BIT},",
          "share = #{share,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Channel record);
}