package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 作业表
 * @TableName s_work
 */
@TableName(value ="s_work")
@Data
public class SWork implements Serializable {
    /**
     * 作业ID
     */
    @TableId(type = IdType.AUTO)
    private Integer workId;

    /**
     * 课程ID
     */
    private Integer courseId;

    /**
     * 作业截止时间
     */
    private Date workTime;

    /**
     * 作业描述
     */
    private String workDesc;

    /**
     * 作业上传空间
     */
    private String workSpace;

    /**
     * 作业分数
     */
    private String workScore;

    /**
     * 用户ID
     */
    private Integer userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}