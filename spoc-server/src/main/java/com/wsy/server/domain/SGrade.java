package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 成绩表
 * @TableName s_grade
 */
@TableName(value ="s_grade")
@Data
public class SGrade implements Serializable {
    /**
     * 课程成绩ID
     */
    @TableId(type = IdType.AUTO)
    private Integer gradeId;

    /**
     * 课程ID
     */
    private Integer courseId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 课程成绩描述
     */
    private String gradeDesc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}