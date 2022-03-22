package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 回复表
 * @TableName s_req
 */
@TableName(value ="s_req")
@Data
public class SReq implements Serializable {
    /**
     * 回复ID
     */
    @TableId(type = IdType.AUTO)
    private Integer reId;

    /**
     * 问题ID
     */
    private Integer questionId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 回复内容
     */
    private String reDesc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}