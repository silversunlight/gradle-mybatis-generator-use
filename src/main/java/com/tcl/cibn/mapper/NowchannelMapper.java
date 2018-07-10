package com.tcl.cibn.mapper;

import com.tcl.cibn.model.Nowchannel;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.type.JdbcType;

public interface NowchannelMapper {
    @Insert({
        "insert into nowchannel (channel_id)",
        "values (#{channelId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Nowchannel record);

    @Select({
        "select",
        "id, channel_id",
        "from nowchannel"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="channel_id", property="channelId", jdbcType=JdbcType.INTEGER)
    })
    List<Nowchannel> selectAll();
}