package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 问题表
 * @TableName s_question
 */
@TableName(value ="s_question")
@Data
public class SQuestion implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer questionId;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private Integer courseId;

    /**
     * 
     */
    private String questionName;

    /**
     * 
     */
    private String questionDesc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}