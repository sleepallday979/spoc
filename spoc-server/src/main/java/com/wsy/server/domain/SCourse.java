package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 课程情况表
 * @TableName s_course
 */
@TableName(value ="s_course")
@Data
public class SCourse implements Serializable {
    /**
     * 课程ID
     */
    @TableId(type = IdType.AUTO)
    private Integer courseId;

    /**
     * 课程老师ID
     */
    private Integer userId;

    /**
     * 课程名
     */
    private String courseName;

    /**
     * 课程描述
     */
    private String courseDesc;

    /**
     * 课程学期
     */
    private String courseTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}