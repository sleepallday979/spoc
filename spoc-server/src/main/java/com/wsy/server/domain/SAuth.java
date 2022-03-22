package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 权限表

 * @TableName s_auth
 */
@TableName(value ="s_auth")
@Data
public class SAuth implements Serializable {
    /**
     * 权限ID
     */
    @TableId(type = IdType.AUTO)
    private Integer authId;

    /**
     * 权限名称
     */
    private String authName;

    /**
     * 权限描述
     */
    private String authDesc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}