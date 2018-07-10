package com.tcl.cibn.mapper;

import com.tcl.cibn.model.PlayUrl;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.type.JdbcType;

public interface PlayUrlMapper {
    @Insert({
        "insert into play_url (title, quality, ",
        "vip_only, sharable, ",
        "channel_id)",
        "values (#{title,jdbcType=VARCHAR}, #{quality,jdbcType=INTEGER}, ",
        "#{vipOnly,jdbcType=TINYINT}, #{sharable,jdbcType=TINYINT}, ",
        "#{channelId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(PlayUrl record);

    @Select({
        "select",
        "id, title, quality, vip_only, sharable, channel_id",
        "from play_url"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="quality", property="quality", jdbcType=JdbcType.INTEGER),
        @Result(column="vip_only", property="vipOnly", jdbcType=JdbcType.TINYINT),
        @Result(column="sharable", property="sharable", jdbcType=JdbcType.TINYINT),
        @Result(column="channel_id", property="channelId", jdbcType=JdbcType.INTEGER)
    })
    List<PlayUrl> selectAll();
}