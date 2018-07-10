package com.tcl.cibn.mapper;

import com.tcl.cibn.model.Channelepg;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.type.JdbcType;

public interface ChannelepgMapper {
    @Insert({
        "insert into channelepg (channel_id, epg_id)",
        "values (#{channelId,jdbcType=INTEGER}, #{epgId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Channelepg record);

    @Select({
        "select",
        "id, channel_id, epg_id",
        "from channelepg"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="channel_id", property="channelId", jdbcType=JdbcType.INTEGER),
        @Result(column="epg_id", property="epgId", jdbcType=JdbcType.INTEGER)
    })
    List<Channelepg> selectAll();
}