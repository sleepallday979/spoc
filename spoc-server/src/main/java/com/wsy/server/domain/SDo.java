package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 作业完成情况表
 * @TableName s_do
 */
@TableName(value ="s_do")
@Data
public class SDo implements Serializable {
    /**
     * 作业完成情况ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 作业ID
     */
    private Integer workId;

    /**
     * 作业完成情况
     */
    private String doState;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}