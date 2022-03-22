package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户表
 * @TableName s_user
 */
@TableName(value ="s_user")
@Data
public class SUser implements Serializable {
    /**
     * 用户ID
     */
    @TableId(type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户账号
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户昵称
     */
    private String userUname;

    /**
     * 用户院系
     */
    private String userDept;

    /**
     * 用户班级
     */
    private String userClass;

    /**
     * 用户专业
     */
    private String userMajor;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}