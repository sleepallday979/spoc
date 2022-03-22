package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户角色表
 * @TableName s_user_role
 */
@TableName(value ="s_user_role")
@Data
public class SUserRole implements Serializable {
    /**
     * 用户角色ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer roleId;

    /**
     * 角色ID
     */
    private Integer userId;

    /**
     * 修改时间
     */
    private Date userRoleTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}