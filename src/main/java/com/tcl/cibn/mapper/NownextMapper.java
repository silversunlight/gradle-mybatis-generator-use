package com.tcl.cibn.mapper;

import com.tcl.cibn.model.Nownext;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.type.JdbcType;

public interface NownextMapper {
    @Insert({
        "insert into nownext (channel_id, now_epg_id, ",
        "next_epg_id)",
        "values (#{channelId,jdbcType=INTEGER}, #{nowEpgId,jdbcType=INTEGER}, ",
        "#{nextEpgId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Nownext record);

    @Select({
        "select",
        "id, channel_id, now_epg_id, next_epg_id",
        "from nownext"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="channel_id", property="channelId", jdbcType=JdbcType.INTEGER),
        @Result(column="now_epg_id", property="nowEpgId", jdbcType=JdbcType.INTEGER),
        @Result(column="next_epg_id", property="nextEpgId", jdbcType=JdbcType.INTEGER)
    })
    List<Nownext> selectAll();
}