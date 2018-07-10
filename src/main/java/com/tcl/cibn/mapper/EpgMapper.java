package com.tcl.cibn.mapper;

import com.tcl.cibn.model.Epg;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.type.JdbcType;

public interface EpgMapper {
    @Insert({
        "insert into epg (stream_id, title, ",
        "type, tag, start, ",
        "end, blocked, thumb_ott)",
        "values (#{streamId,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{tag,jdbcType=VARCHAR}, #{start,jdbcType=VARCHAR}, ",
        "#{end,jdbcType=VARCHAR}, #{blocked,jdbcType=TINYINT}, #{thumbOtt,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Epg record);

    @Select({
        "select",
        "id, stream_id, title, type, tag, start, end, blocked, thumb_ott",
        "from epg"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="stream_id", property="streamId", jdbcType=JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="tag", property="tag", jdbcType=JdbcType.VARCHAR),
        @Result(column="start", property="start", jdbcType=JdbcType.VARCHAR),
        @Result(column="end", property="end", jdbcType=JdbcType.VARCHAR),
        @Result(column="blocked", property="blocked", jdbcType=JdbcType.TINYINT),
        @Result(column="thumb_ott", property="thumbOtt", jdbcType=JdbcType.VARCHAR)
    })
    List<Epg> selectAll();
}