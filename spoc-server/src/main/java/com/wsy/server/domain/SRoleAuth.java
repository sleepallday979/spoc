package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色权限表
 * @TableName s_role_auth
 */
@TableName(value ="s_role_auth")
@Data
public class SRoleAuth implements Serializable {
    /**
     * 角色权限ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 权限ID
     */
    private Integer authId;

    /**
     * 修改时间
     */
    private Date authTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}